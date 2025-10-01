package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.domain.Computador;
import javacore.Npolimorfismo.domain.Produto;
import javacore.Npolimorfismo.domain.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

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
