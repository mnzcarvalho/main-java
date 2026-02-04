package exercicios.review.b.domain;

import java.util.Scanner;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String getNome() {
        return "Circulo";
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    //    Scanner scanner = new Scanner(System.in);
//    double r = 0;
//    @Override
//    public double calcularArea() {
//        System.out.println("Calculando área de um circulo através do raio");
//        System.out.println("Digite o raio: ");
//        r = scanner.nextDouble();
//        double area = (Math.pow(r,2) * 3.14);
//        System.out.println("A área do circulo é de: \n");
//        return area;
//    }
//
//    @Override
//    public double calcularPerimetro() {
//        System.out.println("Calculando o perímetro através do raio");
//        System.out.println("Digite o raio: ");
//        r = scanner.nextDouble();
//        double p = 2 * 3.14 * r;
//        System.out.println("O perímetro do círculo é \n" );
//        return p;
//    }
//
//    @Override
//    public String getNome() {
//        return "Area do Círculo";
//    }
}
