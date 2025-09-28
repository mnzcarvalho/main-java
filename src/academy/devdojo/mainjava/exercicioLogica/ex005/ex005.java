package academy.devdojo.mainjava.exercicioLogica.ex005;

import java.text.DecimalFormat;
import java.util.Scanner;

//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
public class ex005 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        double salarioMinimo =  1293.20;

        System.out.println("Digite o valor do seu salário: ");
        double meuSalario = scanner.nextDouble();

        if (meuSalario >= salarioMinimo){
            System.out.println("Seu salário : R$ " + meuSalario);
            System.out.println("Salário mínimo no valor de R$ 1.293,20");
            System.out.println("Calculando valor...");
            System.out.println("Você recebe um total de " + df.format((meuSalario / salarioMinimo)) + " salários mínimos");
        } else {
            System.out.println("Você recebe menos que um salário mínimo");
        }
    }
}
