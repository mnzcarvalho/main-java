package javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NomalizeTest01 {
    public static void main(String[] args) {
        String diretorioPorjeto = "home/dudu/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioPorjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./dudu/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
