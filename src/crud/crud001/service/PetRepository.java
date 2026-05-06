package crud.crud001.service;

import crud.crud001.model.Pet;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

public interface PetRepository {
    void salvarPet(Pet pet) throws IOException;
    List<Pet> listarTodos() throws IOException;
    Pet lerDoArquivo(Path arquivo) throws IOException;
}
