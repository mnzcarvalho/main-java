package javacore.Oexception.exception.test;

import javacore.Oexception.exception.domain.Leitor1;
import javacore.Oexception.exception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
//        try(Reader reader = new BufferedReader( new FileReader("Test.txt"))){
        try (Leitor1 leitor1 = new Leitor1();           //LEITOR1/2 estão IMPLEMENTANDO a interface CLOSEABLE
             Leitor2 leitor2 = new Leitor2()) {         //São fechados na ordem inversa em que foram declarados


        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

