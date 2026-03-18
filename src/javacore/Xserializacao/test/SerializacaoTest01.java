package javacore.Xserializacao.test;

import javacore.Xserializacao.domain.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Ao serializar, transforma o objeto em um array de bits.
//Tem que informar ao java que o objeto é serializável - "implements Serializable" na classe.
//Interface flag = interface que não contém métodos.
//Ao deserializar, o java não lê o construtor. Ao trabalhar com herança a subclasse não chamar a "superClasse".
public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Eduardo", "123");
//        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("folder/aluno.serializado");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("folder/aluno.serializado");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
