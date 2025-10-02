package exercicios.estruturadedados.buscalienar2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n\nQual número vc busca?");
        Scanner scanner = new Scanner(System.in);
        int buscado = scanner.nextInt();

        boolean isExiste = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == buscado){
                System.out.println("Número encontrado, posição: " + i);
                isExiste = true;
                break;
            }
        }
        if (isExiste == false){
            System.out.println("Número não encontrado");
        }
    }
}
