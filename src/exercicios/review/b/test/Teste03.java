package exercicios.review.b.test;

import exercicios.review.b.domain.Circulo;
import exercicios.review.b.domain.Retangulo;
import exercicios.review.b.domain.Triangulo;

import java.util.Scanner;

public class Teste03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testando Círculo
        System.out.println("=== CÍRCULO ===");
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        Circulo circulo = new Circulo(raio);

        System.out.println("Nome: " + circulo.getNome());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println();

        // Testando Retângulo
        System.out.println("=== RETÂNGULO ===");
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        Retangulo retangulo = new Retangulo(base, altura);

        System.out.println("Nome: " + retangulo.getNome());
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
        System.out.println();

        // Testando Triângulo
        System.out.println("=== TRIÂNGULO ===");
        System.out.print("Digite a base do triângulo: ");
        base = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        altura = scanner.nextDouble();
        Triangulo triangulo = new Triangulo(base, altura);

        System.out.println("Nome: " + triangulo.getNome());
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());

        scanner.close();
    }
}
