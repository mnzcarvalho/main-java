package academy.devdojo.mainjava.javacore.Lclassesabstratas.domain;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    //mesmo que o calculaSalario esteja no funcionário, quem executa é o objeto
    @Override
    public void calculaSalario() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
