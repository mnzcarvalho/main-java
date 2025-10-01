package exercicios.sistemas.sistemafuncionarios;

public class Estagiario extends Funcionario{
    private int horasTrabalho;

    public Estagiario(String nome, double salario, Departamento departamento, String matricula, int horasTrabalho) {
        super(nome, salario, departamento, matricula);
        this.horasTrabalho = horasTrabalho;
    }

    @Override
    double calcularBonus() {
        return 50 * horasTrabalho;
    }
}
