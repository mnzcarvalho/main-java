package javacore.Xserializacao.domain;

import java.io.*;

//Serializable é uma interface "FLAG", que só serve para vc testar se passa "naquele teste"
public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 3190503585786412922L; //serializable class withouth (ctrl + shift + a)
    private long id;
    private String nome;
    private transient String password; // não será serializado
    private static final String NOME_CURSO = "DevDojo Vraau"; //Atributos static pertencem a classe e não ao objeto, não será serializado
    private transient Turma turma;

    public Aluno(long id, String nome, String password) {
        System.out.println("Dentro do construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTruma = ois.readUTF();
            turma = new Turma(nomeTruma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_CURSO='" + NOME_CURSO + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
