package academy.devdojo.mainjava.exercicios.exercicioLogica.ex004;

import java.util.Scanner;

//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
public class ex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        System.out.println("Número : " + numero);
        System.out.println("Seu sucessor é: " + (numero + 1));
        System.out.println("Seu antecessor é: " + (numero - 1));
    }
}
