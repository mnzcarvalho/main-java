package javacore.Hheranca.domain;

//super = super-classe
//todas as classes no java são "filhas" da classe Object
//ctrl + O = overwrite - criar um construtor com o super
public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco STATIC de Funcionario");
    }

    {
        System.out.println("Bloco de inicialização não estático de Funcionario 1");
    }

    {
        System.out.println("Bloco de inicialização não estático de Funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void impressora() {
        super.impressora();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu : " + this.nome + " recebi o pagamento de: R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
