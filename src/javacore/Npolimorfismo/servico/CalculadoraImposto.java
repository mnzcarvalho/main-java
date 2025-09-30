package academy.devdojo.mainjava.javacore.Npolimorfismo.servico;

import academy.devdojo.mainjava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.mainjava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.mainjava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);

        }

    }
}
