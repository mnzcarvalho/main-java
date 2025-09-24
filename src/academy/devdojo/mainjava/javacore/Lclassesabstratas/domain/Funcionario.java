package academy.devdojo.mainjava.javacore.Lclassesabstratas.domain;

//Abstract vai evitar a criação da classe funcionário
//Funcionário só servira como um template, uma classe criara para ser uma superclasse
//Não é obrigado a implementar os metodos abstratos nas "classes abstratas", apenas nas "filhas"
//Não se pode ter multiplas heranças em JAVA, mas se pode ter uma hierarquia maior
public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaSalario();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    public abstract void calculaSalario();
}
