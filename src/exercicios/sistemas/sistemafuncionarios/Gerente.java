package exercicios.sistemas.sistemafuncionarios;

public class Gerente extends Funcionario implements Trabalhavel{
    private int equipSize;


    public Gerente(String nome, double salario, Departamento departamento, String matricula) {
        super(nome, salario, departamento, matricula);

    }

    @Override
    double calcularBonus() {
        return (this.getSalario() * 0.20) + (100 * equipSize);
    }

    @Override
    public void realizarTarefas() {
        System.out.println("Gerenciando equipe de " + equipSize + " pessoas.");
    }

    public int getEquipSize() {
        return equipSize;
    }

    public void setEquipSize(int equipSize) {
        this.equipSize = equipSize;
    }
}
