package academy.devdojo.mainjava.javacore.Gassociacao.dominioEx;

import java.util.ArrayList;
import java.util.List;

public class SistemaSeminarios {
    private List<Seminario> seminarios;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Local> locais;

    public SistemaSeminarios() {
        this.seminarios = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.locais = new ArrayList<>();
    }

    //Metodo para cadastrar entidades
    public void cadastrarProfessor(String nome, String especialidade) {
        Professor professor = new Professor(nome, especialidade);
        professores.add(professor);
        System.out.println("Professor cadastrado: " + nome);
    }

    public void cadastrarLocal(String endereco) {
        Local local = new Local(endereco);
        locais.add(local);
        System.out.println("Local cadastrado: " + endereco);
    }

    public void cadastrarAluno(String nome, int idade) {
        Aluno aluno = new Aluno(nome, idade);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado: " + nome);
    }

    //Metodos para buscar entidades
    private Professor buscarProfessor(String nome){
        for (Professor professor : professores) {
            if (professor.getNome().equalsIgnoreCase(nome))
                return professor;
        }
        return null;
    }

    private Local buscarLocal(String endereco){
        for (Local local : locais) {
            if (local.getEndereco().equalsIgnoreCase(endereco))
                return local;
        }
        return null;
    }

    private Aluno buscarAluno(String nome){
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome))
                return aluno;
        }
        return null;
    }

    private Seminario buscarSeminario(String titulo){
        for (Seminario seminario : seminarios) {
            if (seminario.getTitulo().equalsIgnoreCase(titulo))
                return seminario;
        }
        return null;
    }

    public void cadastrarSeminario(String titulo, String nomeProfessor, String enderecoLocal) {
        Professor professor = buscarProfessor(nomeProfessor);
        Local local = buscarLocal(enderecoLocal);

        if (professor != null && local != null){
            Seminario seminario = new Seminario(titulo, professor,local);
            seminarios.add(seminario);
            System.out.println("Seminário cadastrado: " + titulo);
        } else {
            System.out.println("Professor ou local não encontrado.");
        }
    }

    //Metodo para cadastrar aluno em seminário
    public void inscreverAlunoSeminario(String nomeAluno, String tituloSeminario){
        Aluno aluno = buscarAluno(nomeAluno);
        Seminario seminario = buscarSeminario(tituloSeminario);

        if (aluno != null && seminario != null) {
            seminario.adicionarAluno(aluno);
        } else {
            System.out.println("Aluno ou seminário não encontrado!");
        }
    }

    //Metodo para exibir todos os Seminários
    public void exibirTodosSeminarios(){
        System.out.println("======TODOS OS SEMINARIOS=======");
        for (Seminario seminario : seminarios) {
            seminario.exibirInformacoes();
        }
    }

    //Metodo para exibir alunos não inscritos
    public void exibirAlunosNaoInscrito(){
        System.out.println("===Alunos não Inscritos===");
        for (Aluno aluno : alunos) {
            if (aluno.getSeminario() == null){
                System.out.println(aluno);
            }
        }
    }

    //Metodo para testar o Sistema
        public static void main(String[] args) {
            SistemaSeminarios sistema = new SistemaSeminarios();

            //Cadastrando professores
            sistema.cadastrarProfessor("Dr. Silva", "Inteligência Artificial");
            sistema.cadastrarProfessor("Dra. Santos", "Banco de Dados");

            //Cadastrando locais
            sistema.cadastrarLocal("Auditório principal - Bloco A");
            sistema.cadastrarLocal("Sala 101 - Bloco B");

            //Cadastrar alunos
            sistema.cadastrarAluno("Pedro", 19);
            sistema.cadastrarAluno("Julia", 28);
            sistema.cadastrarAluno("José", 30);
            sistema.cadastrarAluno("Maria", 25);
            sistema.cadastrarAluno("Matheus", 22);

            //Cadastrar seminários
            sistema.cadastrarSeminario("IA no Mundo Moderno", "Dr. Silva", "Auditório principal - Bloco A");
            sistema.cadastrarSeminario("Bancos de Dados NoSQL", "Dra. Santos", "Sala 101 - Bloco B");

            //Inscrever alunos
            sistema.inscreverAlunoSeminario("Pedro", "IA no Mundo Moderno");
            sistema.inscreverAlunoSeminario("Maria", "IA no Mundo Moderno");
            sistema.inscreverAlunoSeminario("José", "Bancos de Dados NoSQL");

            // Tentativa de inscrever aluno em dois seminários (deve falhar)
            sistema.inscreverAlunoSeminario("Pedro", "Bancos de Dados NoSQL");

            // Exibindo informações
            sistema.exibirTodosSeminarios();
            sistema.exibirAlunosNaoInscrito();
        }
    }
