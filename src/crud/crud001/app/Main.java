package crud.crud001.app;

import crud.crud001.service.ArquivoService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArquivoService arquivoService = new ArquivoService();

        try {
            List<String> perguntas = arquivoService.leitorArquivo("C:\\Users\\mnz\\CODE\\JAVA\\main-java\\src\\crud\\crud001\\formulario.txt");
            for (String pergunta : perguntas) {
                System.out.println(pergunta);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
