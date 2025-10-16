package javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file1 = new File("file.txt");
        try {
            boolean isCreated = file1.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("Path: " +file1.getPath());
            System.out.println("Absolute Path: " +file1.getAbsolutePath());
            System.out.println("is Directory: " +file1.isDirectory());
            System.out.println("is File: " +file1.isFile());
            System.out.println("is Hidden: " +file1.isHidden());
            System.out.println("Last Modified: " + Instant.ofEpochMilli(file1.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            boolean exists = file1.exists();
            if (exists){
                System.out.println("Deleted: " + file1.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
