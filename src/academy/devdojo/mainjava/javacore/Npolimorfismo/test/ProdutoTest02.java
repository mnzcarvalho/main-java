package academy.devdojo.mainjava.javacore.Npolimorfismo.test;

import academy.devdojo.mainjava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.mainjava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.mainjava.javacore.Npolimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("i9 999", 6666);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("==========================");

        Produto produto2 = new Tomate("Tomate Cereja", 6);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
