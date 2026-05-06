package crud.crud001.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import crud.crud001.enums.Sexo;
import crud.crud001.enums.TipoAnimal;
import crud.crud001.model.Endereco;
import crud.crud001.model.Pet;
import crud.crud001.util.Constantes;

//leitura e escrita de arquivos
public class ArquivoService {

    public void criarFormulario() throws IOException {
        Path pasta = Paths.get("src/crud/crud001");
        if (!Files.exists(pasta)) {
            Files.createDirectories(pasta);
        }
        Path arquivoFormulario = pasta.resolve("formulario.txt");
        if (!Files.exists(arquivoFormulario)) {
            Files.createFile(arquivoFormulario);
            Files.write(arquivoFormulario, Collections.singleton("1 - Qual o nome e sobrenome do pet?\n" +
                    "2 - Qual o tipo do pet (Cachorro/Gato)?\n" +
                    "3 - Qual o sexo do animal?\n" +
                    "4 - Qual endereço e bairro que ele foi encontrado?\n" +
                    "5 - Qual a idade aproximada do pet?\n" +
                    "6 - Qual o peso aproximado do pet?\n" +
                    "7 - Qual a raça do pet?"));
        }
    }

    public List<String> leitorArquivo(String caminhoArquivo) throws IOException {
        return Files.readAllLines(Paths.get(caminhoArquivo));
    }

    public void salvarPet(Pet pet) throws IOException {
        // Separa nome e sobrenome (limite 2 partes para evitar erro com múltiplos sobrenomes)
        String[] partesNome = pet.getNome().split(" ", 2);
        String nomeArquivo = partesNome[0];
        String sobreNomeArquivo = partesNome.length > 1 ? partesNome[1] : "";

        // Gera timestamp no formato exigido
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmm");
        String timestamp = LocalDateTime.now().format(formatter);

        String nomeArquivoFinal = timestamp + "-" + nomeArquivo + "+" + sobreNomeArquivo + ".TXT";

        //Validação da pasta
        Path pastaPets = Paths.get(Constantes.PASTA_PETS);
        Files.createDirectory(pastaPets);

        //Escrita do arquivo
        Path arquivo = pastaPets.resolve(nomeArquivoFinal);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo.toFile()))) {
            writer.write(pet.getNome());
            writer.newLine();

            writer.write(pet.getTipo().name());
            writer.newLine();

            writer.write(pet.getSexo().name());
            writer.newLine();

            Endereco endereco = pet.getEndereco();
            String linhaEndereco = String.join(", ",
                    endereco.getRua(),
                    endereco.getNumero(),
                    endereco.getBairro(),
                    endereco.getCidade()
            );

            writer.write(linhaEndereco);
            writer.newLine();

            writer.write(pet.getIdade() + " anos");
            writer.newLine();

            writer.write(pet.getPeso() + "kg");
            writer.newLine();

            writer.write(pet.getRaca());
        }
    }

    public List<Pet> listarTodosPets (){
        List<Pet> pets = new ArrayList<>();

        File pasta = new File(Constantes.PASTA_PETS);

        if (!pasta.exists()) return pets;

        File[] arquivos = pasta.listFiles();

        if (arquivos == null) return pets;

        for (File arquivo : arquivos) {
            Pet pet = fromFile(arquivo);
            if (pet != null) pets.add(pet);
        }
        return pets;
    }

    public Pet fromFile(File arquivo) {
        try {
            List<String> linhas = Files.readAllLines(arquivo.toPath());

            Pet pet = new Pet();

            pet.setNome(linhas.get(0));
            pet.setTipo(TipoAnimal.valueOf(linhas.get(1)));
            pet.setSexo(Sexo.valueOf(linhas.get(2)));

            // Endereço
            String[] partesEndereco = linhas.get(3).split(", ");
            Endereco endereco = new Endereco(
                    partesEndereco[0],
                    partesEndereco[2],
                    partesEndereco[3]
            );
            endereco.setNumero(partesEndereco[1]);
            pet.setEndereco(endereco);

            // Idade
            String idadeStr = linhas.get(4).replace(" anos", "");
            pet.setIdade(Double.parseDouble(idadeStr));

            // Peso
            String pesoStr = linhas.get(5).replace("kg", "");
            pet.setPeso(Double.parseDouble(pesoStr));

            pet.setRaca(linhas.get(6));

            return pet;

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + arquivo.getName());
            return null;
        }
    }

}
