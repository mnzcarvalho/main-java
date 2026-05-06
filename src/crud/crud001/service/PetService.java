package crud.crud001.service;

import crud.crud001.model.Endereco;
import crud.crud001.model.Pet;
import crud.crud001.enums.Sexo;
import crud.crud001.enums.TipoAnimal;
import crud.crud001.util.Constantes;
import crud.crud001.util.Validador;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetService {
    private final PetRepository repository;
    private final PetSearch search;

    public PetService(PetRepository repository, PetSearch search) {
        this.repository = repository;
        this.search = search;
    }

    // Cadastra novo pet: lê perguntas do formulário, coleta respostas via Scanner,
    // valida campos, cria objeto Pet, salva via repository.
    public void cadastrar(Scanner sc) {
        try {
            List<String> perguntas = Files.readAllLines(Paths.get(Constantes.FORMULARIO_PATH));
            String rua = "", numero = Constantes.NAO_INFORMADO, bairro = "", cidade = "";

            System.out.println(perguntas.get(0));
            String nome = sc.nextLine().trim();
            if (!Validador.validarNomeSobrenome(nome)) {
                System.out.println("Erro: nome/sobrenome inválido.");
                return;
            }

            System.out.println(perguntas.get(1));
            TipoAnimal tipo;
            try { tipo = TipoAnimal.valueOf(sc.nextLine().trim().toUpperCase()); }
            catch (IllegalArgumentException e) { System.out.println("Erro: tipo inválido."); return; }

            System.out.println(perguntas.get(2));
            Sexo sexo;
            try { sexo = Sexo.valueOf(sc.nextLine().trim().toUpperCase()); }
            catch (IllegalArgumentException e) { System.out.println("Erro: sexo inválido."); return; }

            System.out.println(perguntas.get(3));
            String[] endParts = sc.nextLine().split(",");
            if (endParts.length > 0) rua = endParts[0].trim();
            if (endParts.length > 1) numero = endParts[1].trim();
            if (endParts.length > 2) bairro = endParts[2].trim();
            if (endParts.length > 3) cidade = endParts[3].trim();

            System.out.println(perguntas.get(4));
            double idade;
            try { idade = Double.parseDouble(sc.nextLine().replace(",",".").trim()); }
            catch (NumberFormatException e) { System.out.println("Erro: idade inválida."); return; }
            if (idade > 20) { System.out.println("Erro: idade > 20."); return; }
            if (idade < 0) { System.out.println("Erro: idade inválida."); return; }

            System.out.println(perguntas.get(5));
            double peso;
            try { peso = Double.parseDouble(sc.nextLine().replace(",",".").trim()); }
            catch (NumberFormatException e) { System.out.println("Erro: peso inválido."); return; }
            if (peso < 0.5 || peso > 60) { System.out.println("Erro: peso inválido."); return; }

            System.out.println(perguntas.get(6));
            String raca = sc.nextLine().trim();
            if (!raca.isEmpty() && !raca.matches("\\p{L}+")) {
                System.out.println("Erro: raça inválida.");
                return;
            }

            Endereco endereco = new Endereco(rua, bairro, cidade);
            endereco.setNumero(numero);

            Pet pet = new Pet(nome, tipo, sexo, endereco, idade, peso, raca);
            repository.salvarPet(pet);
            System.out.println("Pet cadastrado com sucesso.");

        } catch (IOException e) {
            System.out.println("Erro de I/O: " + e.getMessage());
        }
    }

    // Lista todos os pets cadastrados usando repository.listarTodos(),
    // formata com search.formatarResultados().
    public void listarTodos() {
        try {
            List<Pet> pets = repository.listarTodos();
            System.out.println(search.formatarResultados(pets));
        } catch (Exception e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        }
    }

    // Altera pet existente: lista pets, usuário seleciona índice,
    // permite alterar campos (vazio = manter), salva sobrepondo arquivo.
    // Tipo e Sexo não podem ser alterados (Passo 6 do guide).
    public void alterar(Scanner sc) {
        try {
            List<Pet> pets = repository.listarTodos();
            if (pets.isEmpty()) { System.out.println("Nenhum pet cadastrado."); return; }

            System.out.println("=== Pets cadastrados ===");
            for (int i = 0; i < pets.size(); i++) {
                System.out.println((i+1) + ". " + pets.get(i).getNome() + " (" + pets.get(i).getTipo() + ")");
            }
            System.out.print("Selecione o índice: ");
            int idx;
            try { idx = Integer.parseInt(sc.nextLine().trim()) - 1; }
            catch (NumberFormatException e) { System.out.println("Índice inválido."); return; }
            if (idx < 0 || idx >= pets.size()) { System.out.println("Índice inválido."); return; }

            Pet pet = pets.get(idx);

            System.out.println("Pressione ENTER para manter o valor atual.");
            System.out.println("Nome atual: " + pet.getNome());
            System.out.print("Novo nome: ");
            String novoNome = sc.nextLine().trim();
            if (!novoNome.isEmpty()) {
                if (Validador.validarNomeSobrenome(novoNome)) pet.setNome(novoNome);
                else { System.out.println("Nome inválido. Mantido original."); }
            }

            System.out.println("Tipo não altera: " + pet.getTipo());
            System.out.println("Sexo não altera: " + pet.getSexo());

            Endereco end = pet.getEndereco();
            System.out.println("Endereço atual: " + end.getRua() + ", " + end.getNumero() + ", " + end.getBairro() + ", " + end.getCidade());
            System.out.print("Novo endereço (rua,numero,bairro,cidade) ou vazio: ");
            String novoEnd = sc.nextLine().trim();
            if (!novoEnd.isEmpty()) {
                String[] parts = novoEnd.split(",");
                if (parts.length >= 1) end.setRua(parts[0].trim());
                if (parts.length >= 2) end.setNumero(parts[1].trim());
                if (parts.length >= 3) end.setBairro(parts[2].trim());
                if (parts.length >= 4) end.setCidade(parts[3].trim());
            }

            System.out.println("Idade atual: " + pet.getIdade());
            System.out.print("Nova idade: ");
            String sIdade = sc.nextLine().trim();
            if (!sIdade.isEmpty()) {
                try {
                    double idade = Double.parseDouble(sIdade.replace(",","."));
                    if (Validador.validarIdade(idade)) pet.setIdade(idade);
                    else System.out.println("Idade inválida. Mantida original.");
                } catch (NumberFormatException e) { System.out.println("Idade inválida. Mantida original."); }
            }

            System.out.println("Peso atual: " + pet.getPeso());
            System.out.print("Novo peso: ");
            String sPeso = sc.nextLine().trim();
            if (!sPeso.isEmpty()) {
                try {
                    double peso = Double.parseDouble(sPeso.replace(",","."));
                    if (Validador.validarPeso(peso)) pet.setPeso(peso);
                    else System.out.println("Peso inválido. Mantido original.");
                } catch (NumberFormatException e) { System.out.println("Peso inválido. Mantido original."); }
            }

            System.out.println("Raça atual: " + pet.getRaca());
            System.out.print("Nova raça: ");
            String novaRaca = sc.nextLine().trim();
            if (!novaRaca.isEmpty()) {
                if (Validador.validarRaca(novaRaca)) pet.setRaca(novaRaca);
                else System.out.println("Raça inválida. Mantida original.");
            }

            repository.salvarPet(pet);
            System.out.println("Pet alterado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao alterar: " + e.getMessage());
        }
    }

    // Deleta pet: lista pets, usuário seleciona, confirma (SIM/NÃO),
    // deleta arquivo da pasta petsCadastrados.
    public void deletar(Scanner sc) {
        try {
            List<Pet> pets = repository.listarTodos();
            if (pets.isEmpty()) { System.out.println("Nenhum pet cadastrado."); return; }

            System.out.println("=== Pets cadastrados ===");
            for (int i = 0; i < pets.size(); i++) {
                System.out.println((i+1) + ". " + pets.get(i).getNome() + " (" + pets.get(i).getTipo() + ")");
            }
            System.out.print("Selecione o índice: ");
            int idx;
            try { idx = Integer.parseInt(sc.nextLine().trim()) - 1; }
            catch (NumberFormatException e) { System.out.println("Índice inválido."); return; }
            if (idx < 0 || idx >= pets.size()) { System.out.println("Índice inválido."); return; }

            System.out.print("Confirma exclusão de " + pets.get(idx).getNome() + "? (SIM/NÃO): ");
            String conf = sc.nextLine().trim();
            if ("SIM".equalsIgnoreCase(conf)) {
                // Delete file by searching for the pet's file
                Path pasta = Paths.get(Constantes.PASTA_PETS);
                try (DirectoryStream<Path> stream = Files.newDirectoryStream(pasta, "*.txt")) {
                    int count = 0;
                    for (Path arquivo : stream) {
                        if (count == idx) {
                            Files.delete(arquivo);
                            System.out.println("Pet deletado com sucesso.");
                            return;
                        }
                        count++;
                    }
                }
            } else {
                System.out.println("Exclusão cancelada.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao deletar: " + e.getMessage());
        }
    }
}
