package crud.crud001.service;

import crud.crud001.model.Pet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Toda a lógica de CRUD e busca

public class PetService {

    // Lista em memória para armazenar pets cadastrados
    private List<Pet> pets = new ArrayList<>();
    private ArquivoService arquivoService = new ArquivoService();
    private Scanner entrada = new Scanner(System.in);


    public void cadastrarPet () {
        try {
            List<String> perguntas = arquivoService.leitorArquivo("C:\\Users\\mnz\\CODE\\JAVA\\main-java\\src\\crud\\crud001\\formulario.txt");
            if (perguntas.size() != 7) {
                System.out.println("Erro: formulario.txt deve ter 7 perguntas.");
                return;
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler formulário.txt: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
    }

}
