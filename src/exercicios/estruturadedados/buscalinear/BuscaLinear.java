package academy.devdojo.mainjava.exercicios.estruturadedados.buscalinear;

import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        for (int i = 0; i < estados.length; i++) {
            System.out.println("Estado " + (i+1) + ": " + estados[i]);
        }

        Scanner leitor = new Scanner(System.in);
        System.out.println("\nDigite qual sigla você está procurando: ");
        String siglaEstado = leitor.nextLine();

        System.out.println("Verificando Resultado");
        boolean isEncontrou = false;
        for (int i = 0; i < estados.length; i++) {
            if (siglaEstado.equalsIgnoreCase(estados[i])) {
                isEncontrou = true;
                break;
            }
        }
        if (isEncontrou){
            System.out.println("Estado encontrado!!");
        } else {
            System.out.println("Estádo não encontrado...");
        }
    }
}
