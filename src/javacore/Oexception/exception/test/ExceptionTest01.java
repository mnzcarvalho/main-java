package javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo(){
        File file = new File("Arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);

        } catch (IOException e){
            e.printStackTrace(); // não colocar regra de négocio no catch, é apenas para tratar exceções
        }


    }
}
