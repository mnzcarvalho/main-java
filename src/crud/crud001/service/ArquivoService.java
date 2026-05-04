package crud.crud001.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import crud.crud001.model.Endereco;
import crud.crud001.model.Pet;
import crud.crud001.util.Constantes;

//leitura e escrita de arquivos
public class ArquivoService {

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
}
