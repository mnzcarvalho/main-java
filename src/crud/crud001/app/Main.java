package crud.crud001.app;

import crud.crud001.service.ArquivoService;
import crud.crud001.service.MenuService;
import crud.crud001.service.PetService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArquivoService arquivoService = new ArquivoService();
        PetService petService = new PetService();
        MenuService menuService = new MenuService(petService);

        menuService.exibir();
    }
}
