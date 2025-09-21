package academy.devdojo.mainjava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Prever o futuro!");
        System.out.println("Digite sua pergunta e responderei sim ou não");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
