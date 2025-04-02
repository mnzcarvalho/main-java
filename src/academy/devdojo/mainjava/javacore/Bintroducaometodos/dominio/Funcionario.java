package academy.devdojo.mainjava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        int i = 1;
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
            for (double salario : salarios) {
                System.out.print("Salario " + i + ": R$" + salario + ", ");
                i = i + 1;
            }

        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
            return;
        }
        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nA média salarial foi de: R$" + media);
    }
}
//        System.out.println("Salário 1: R$" + this.salarios[0]);
//        System.out.println("Salário 2: R$" + this.salarios[1]);
//        System.out.println("Salário 3: R$" + this.salarios[2]);