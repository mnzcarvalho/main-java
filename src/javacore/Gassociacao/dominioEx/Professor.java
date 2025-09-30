package academy.devdojo.mainjava.javacore.Gassociacao.dominioEx;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("===========================");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (this.seminarios == null) return;
        System.out.println("===Seminários a Ministrar===");
        for (Seminario seminario : this.seminarios) {
            System.out.println("Título: " + seminario.getTitutlo());;
            System.out.println("Local: " +seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("===Alunos===");
            for (Aluno aluno : seminario.getAlunos()) { //Array dentro de um array >> Alunos[aluno] fore
                System.out.println("Alunos: " + aluno.getNome() + "\nIdade: " + aluno.getIdade());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
