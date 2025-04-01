package academy.devdojo.mainjava.javacore.Bintroducaometodos.teste;

import academy.devdojo.mainjava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(10, 2);
        System.out.println(result);
        System.out.println("---------------------");
        System.out.println(calculadora.divideDoisNumeros02(10, 5));
        System.out.println("---------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
