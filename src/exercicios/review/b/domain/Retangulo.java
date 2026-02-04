package exercicios.review.b.domain;

import java.util.Scanner;

public class Retangulo extends FormaGeometrica{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String getNome() {
        return "Retângulo";
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //    Scanner scanner = new Scanner(System.in);
//    double base = 0;
//    double altura = 0;
//
//    @Override
//    public double calcularArea() {
//        System.out.println("Calcular área do retângulo (m²)");
//        System.out.println("Digite a base: ");
//        base = scanner.nextDouble();
//        System.out.println("Digite a altura: ");
//        altura = scanner.nextDouble();
//        System.out.println("A área do retângulo é de: " + (base * altura));
//    }
//
//    @Override
//    public double calcularPerimetro() {
//
//    }
//
//    @Override
//    public String getNome() {
//
//    }
}
