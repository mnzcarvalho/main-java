package academy.devdojo.mainjava.javacore.Npolimorfismo.test;

import academy.devdojo.mainjava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.mainjava.javacore.Npolimorfismo.domain.Televisao;
import academy.devdojo.mainjava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.mainjava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("i5-9999", 20000);
        Tomate tomate = new Tomate("Cereja", 6);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("==================================");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("==================================");
        CalculadoraImposto.calcularImposto(tv);
    }
}
