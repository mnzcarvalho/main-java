package exercicios.sistemas.sistemafuncionarios;

public class Desenvolvedor extends Funcionario implements Trabalhavel{
    private String linguagem;

    public Desenvolvedor(String nome, double salario, Departamento departamento, String matricula, String linguagem) {
        super(nome, salario, departamento, matricula);
        this.linguagem = linguagem;
    }


    @Override
    double calcularBonus() {
        return this.getSalario() * 0.15;
    }

    @Override
    public void realizarTarefas() {
        System.out.println("Desenvolvimento em: " + linguagem);
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
