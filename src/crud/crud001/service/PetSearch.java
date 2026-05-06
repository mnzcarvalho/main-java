package crud.crud001.service;

import crud.crud001.model.Pet;
import crud.crud001.enums.TipoAnimal;
import java.util.List;
import java.util.Map;
import java.io.IOException;

public interface PetSearch {
    List<Pet> buscar(TipoAnimal tipo, Map<String,String> criterios) throws IOException;
    String formatarResultados(List<Pet> pets);
}
