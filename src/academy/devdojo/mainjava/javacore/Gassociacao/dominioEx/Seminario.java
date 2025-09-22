package academy.devdojo.mainjava.javacore.Gassociacao.dominioEx;

public class Seminario {
    private String titutlo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titutlo) {
        this.titutlo = titutlo;
    }

    public Seminario(String titutlo, Aluno[] seminarios) {
        this.titutlo = titutlo;
        this.alunos = seminarios;
    }

    public Seminario(Local local, String titutlo) {
        this.local = local;
        this.titutlo = titutlo;
    }

    public Seminario(String titutlo, Aluno[] alunos, Local local) {
        this.titutlo = titutlo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitutlo() {
        return titutlo;
    }

    public void setTitutlo(String titutlo) {
        this.titutlo = titutlo;
    }

    public Aluno[] getSeminarios() {
        return alunos;
    }

    public void setSeminarios(Aluno[] seminarios) {
        this.alunos = seminarios;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
