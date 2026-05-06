package crud.crud001.app;

import crud.crud001.service.ArquivoService;
import crud.crud001.service.MenuService;
import crud.crud001.service.PetSearchService;
import crud.crud001.service.PetService;
import crud.crud001.service.PetRepository;
import crud.crud001.service.PetSearch;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            PetRepository repository = new ArquivoService();
            PetSearch search = new PetSearchService();
            PetService petService = new PetService(repository, search);
            MenuService menuService = new MenuService(petService);
            menuService.exibir();
        } catch (Exception e) {
            System.out.println("Erro fatal: " + e.getMessage());
        }
    }
}
