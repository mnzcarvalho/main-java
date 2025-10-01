package exercicios.sistemas.sistemafuncionarios;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private Departamento departamento;
    private final String matricula;

    public Funcionario(String nome, double salario, Departamento departamento, String matricula) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
        this.matricula = matricula;
    }

    abstract double calcularBonus() throws BonusException;

    void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Departamento: " + getDepartamento());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getMatricula() {
        return matricula;
    }
}
