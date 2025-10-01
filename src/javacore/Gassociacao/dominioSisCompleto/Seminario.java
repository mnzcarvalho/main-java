package javacore.Gassociacao.dominioSisCompleto;

import java.util.ArrayList;
import java.util.List;

public class Seminario {
    private String titulo;
    private Professor professor;
    private Local local;
    private List<Aluno> alunos;

    public Seminario(String titulo, Professor professor, Local local) {
        this.titulo = titulo;
        this.professor = professor;
        this.local = local;
        this.alunos = new ArrayList<>(); // Inicialização da lista
    }

    //Metodo para adicionar aluno
    public void adicionarAluno(Aluno aluno) {
        if (aluno.getSeminario() != null) {
            System.out.println("Aluno: " + aluno.getNome() + "Já está em outro seminário!");
            return;
        }
        alunos.add(aluno);
        aluno.setSeminario(this);
        System.out.println("Aluno: " + aluno.getNome() + " adicionado ao seminário: " + titulo);
    }

    //Metodo para remover aluno
    public void removeAluno(Aluno aluno) {
        if (alunos.remove(aluno)) {
            aluno.setSeminario(null);
            System.out.println("Aluno: " + aluno.getNome() + " foi removido do seminário: " + titulo);
        } else {
            System.out.println("Aluno não encontrado nesse seminário!");
        }
    }

    //Metodo para exibir informações do seminário
    public void exibirInformacoes() {
        System.out.println("===Seminário===");
        System.out.println("Título: " + titulo);
        System.out.println(professor);
        System.out.println(local);
        System.out.println("Alunos inscritos: " + alunos.size());

        if (!alunos.isEmpty()) {
            System.out.println("Lista de alunos: ");
            for (Aluno aluno : alunos) {
                System.out.println(" - " + aluno.getNome() + " (" + aluno.getIdade() + " anos");

            }

        }
        System.out.println("==============================");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString(){
        return "Seminário " + titulo + "- Ministrado por: " + professor.getNome();
    }
}

