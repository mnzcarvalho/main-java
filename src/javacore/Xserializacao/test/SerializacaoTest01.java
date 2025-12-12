package javacore.Xserializacao.test;

import javacore.Xserializacao.domain.Aluno;
import javacore.Xserializacao.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1L, "Eduardo", "123");
        Turma turma = new Turma("Maratona Java");
        aluno1.setTurma(turma);
        serializar(aluno1);
        descerealizar();
    }

    //quando seriliza, vc está trabalhando com array de bites (baixo nível)
    private static void serializar(Aluno aluno) {
        Path path = Paths.get("folder/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Quando vc está lendo um objeto serializado o java não vai utilizar o construtor
    //Se estiver trabalhando com herança o objetivo do construtor é chamar o super, mas o construtor n é executado
    private static void descerealizar() {
        Path path = Paths.get("folder/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
