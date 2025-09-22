package academy.devdojo.mainjava.javacore.Hheranca.domain;

//super = super-classe
//todas as classes no java são "filhas" da classe Object
//ctrl + O = overwrite - criar um construtor com o super
public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome);
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
