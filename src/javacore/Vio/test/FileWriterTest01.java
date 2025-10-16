package javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("Primeira aula sobre file, DevDojo balaaaaaa\n uuuuuoooooooooooooooooooooooooo\n");
            fw.flush();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
