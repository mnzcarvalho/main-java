package exercicios.LogicaBasica.ex006;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculadoraService calculadora = new CalculadoraService();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        System.out.println("===Calculadora (2 valores)===");
        do {
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");
            System.out.println("Esolha uma opção: ");

            try {
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("==SOMA==");
                        System.out.println("Digite um número: ");
                        double n1 = sc.nextDouble();
                        System.out.println("Digite um número: ");
                        double n2 = sc.nextDouble();
                        double resultado = calculadora.somar(n1, n2);
                        System.out.println("O resultado da soma é: " + resultado);
                    }

                    case 2 -> {
                        System.out.println("==SUBTRAÇÃO==");
                        System.out.println("Digite um número: ");
                        double n1 = sc.nextDouble();
                        System.out.println("Digite um número: ");
                        double n2 = sc.nextDouble();
                        double resultado = calculadora.subtrair(n1, n2);
                        System.out.println("O resultado da subtração é: " + resultado);
                    }
                    case 3 -> {
                        System.out.println("==MULTIPLICAÇÃO==");

                        System.out.println("Digite um número: ");
                        double n1 = sc.nextDouble();
                        System.out.println("Digite um número: ");
                        double n2 = sc.nextDouble();
                        double resultado = calculadora.multiplicar(n1, n2);
                        System.out.println("O resultado da multiplicação é: " + resultado);
                    }
                    case 4 -> {
                        try {
                            System.out.println("==DIVISÃO==");
                            System.out.println("Digite um número: ");
                            double n1 = sc.nextDouble();
                            System.out.println("Digite um número: ");
                            double n2 = sc.nextDouble();
                            double resultado = calculadora.dividir(n1, n2);

                            System.out.println("O resultado da divisão é: " + resultado);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 0 -> System.out.println("Encerrando...");

                    default -> System.out.println("Opção inválida! Escolha um número de 0 a 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Você deve digitar apenas números inteiros.");
                sc.next();
                opcao = -1;
            }
        } while (opcao != 0);
        sc.close();
    }
}
