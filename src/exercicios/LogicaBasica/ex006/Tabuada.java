package exercicios.LogicaBasica.ex006;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        int opcao = 0;
        int maximo = 0;
        Tabuada tabuada = new Tabuada();
        Scanner sc = new Scanner(System.in);
        boolean entradaValida = false;

        System.out.println("==Tabuada===");
        System.out.println();

        while (!entradaValida) {
            try {
                System.out.println();
                System.out.println("Digite um número:");
                opcao = sc.nextInt();
                System.out.println("Até qual número vai a taboada: ");
                maximo = sc.nextInt();
                tabuada.mostrarTabuada(opcao, maximo);
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: você deve digitar apenas números inteiros.");
                sc.next();
                System.out.println();
            }
        }
        sc.close();
    }


    public void mostrarTabuada(int num, int max) {

        for (int i = 0; i <= max; i++) {
            System.out.println(num + " x " + i + " = " + (i * num));
        }
    }
}

