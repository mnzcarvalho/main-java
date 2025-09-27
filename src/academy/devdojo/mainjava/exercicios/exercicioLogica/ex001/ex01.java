package academy.devdojo.mainjava.exercicios.exercicioLogica.ex001;

import java.util.Scanner;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de C: ");
        double c = scanner.nextDouble();

        double soma = a + b;

        if (soma < c) {
            System.out.println("A soma é menor que C");
        } else {
            System.out.println("A soma não é menor que C");
        }

        scanner.close();
    }

}
