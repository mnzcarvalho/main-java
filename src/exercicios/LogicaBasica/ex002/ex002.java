package academy.devdojo.mainjava.exercicios.LogicaBasica.ex002;
//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===VERIFICAÇÃO DE NÚMEROS===");
        System.out.println("Digite um valor: ");
        double numero = scanner.nextDouble();

        if (numero % 2 == 0 && numero > 0){
            System.out.println("O numero é par, positivo");
        } else if (numero % 2 == 0 && numero < 0) {
            System.out.println("O numero é par, negativo");
        } else if (numero % 2 != 0 && numero > 0) {
            System.out.println("O numero é ímpar, positivo");
        } else if (numero == 0){
            System.out.println("O numero é zero");
        } else {
            System.out.println("O numero é ímpar, negativo");
        }
    }
}
