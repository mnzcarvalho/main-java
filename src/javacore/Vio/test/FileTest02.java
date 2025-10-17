package javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("folder");
        boolean isDiretorio = fileDiretorio.mkdir();
        System.out.println(isDiretorio);
//        File fileArquivoDiretorio = new File("D:\\Dudu\\CODE\\main-java\\folder\\arquivo.txt");
        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);
        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File("folder_renamed");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);

    }
}
