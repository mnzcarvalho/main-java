package crud.crud001.service;

import crud.crud001.model.Pet;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArquivoService implements PetRepository {

    @Override
    // Salva pet usando TDA (pet.savePet()).
    // Implementação de PetRepository.salvarPet().
    public void salvarPet(Pet pet) throws IOException {
        pet.savePet(); // TDA: Pet saves itself
    }

    @Override
    // Lista todos os pets da pasta petsCadastrados.
    // Lê cada .txt, converte para Pet via Pet.loadPet().
    // Implementação de PetRepository.listarTodos().
    public List<Pet> listarTodos() throws IOException {
        List<Pet> pets = new ArrayList<>();
        Path pasta = Paths.get("petsCadastrados");
        if (!Files.exists(pasta)) return pets;

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(pasta, "*.txt")) {
            for (Path arquivo : stream) {
                Pet pet = Pet.loadPet(arquivo);
                if (pet != null) pets.add(pet);
            }
        }
        return pets;
    }

    @Override
    // Lê pet de arquivo específico.
    // Implementação de PetRepository.lerDoArquivo().
    public Pet lerDoArquivo(Path arquivo) throws IOException {
        return Pet.loadPet(arquivo);
    }
}
