package academy.devdojo.mainjava.exercicios.exercicioLogica.ex003;

import java.util.Scanner;

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
public class ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double n2 = scanner.nextDouble();

        double soma;

        if (n1 == n2){
            soma = n1 + n2;
            System.out.println("Numero iguais");
            System.out.println("Realizando soma...");
            System.out.println("A soma de " + n1 + " + " + n2 +" é de : " + soma);
        } else {
            soma = n1 * n2;
            System.out.println("Números diferentes");
            System.out.println("Realizando multiplicação...");
            System.out.println("A multiplicação de " + n1 + " + " + n2 +" é de : " + soma);
        }
    }
}
