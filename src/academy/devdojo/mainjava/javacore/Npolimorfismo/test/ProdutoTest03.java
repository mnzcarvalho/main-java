package academy.devdojo.mainjava.javacore.Npolimorfismo.test;

import academy.devdojo.mainjava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.mainjava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.mainjava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.mainjava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("i9 999", 6666);

        Tomate tomate = new Tomate("Tomate Cereja", 6);
        tomate.setDataValidade("11/12/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("=================================");
        CalculadoraImposto.calcularImposto(produto);
    }
}
