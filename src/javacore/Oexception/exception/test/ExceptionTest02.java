package academy.devdojo.mainjava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("Arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);

        } catch (IOException e) {            // não colocar regra de négocio no catch, é apenas para tratar exceções
            e.printStackTrace();
            throw e;
        }
    }
}
