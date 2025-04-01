package academy.devdojo.mainjava.javacore.Bintroducaometodos.teste;

import academy.devdojo.mainjava.javacore.Bintroducaometodos.dominio.Calculadora;
//PASSAGEM DE PARÂMETROS, TIPOS PRIMITIVOS
//dentro da classe, quando se está passando valores do tipo primitivo para um métod0, a variável original não será alterada...
//será passada uma cópia
public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("Num1: "+ a);
        System.out.println("Num2: "+ b);
    }
}
