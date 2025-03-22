package academy.devdojo.mainjava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 20000;
        double primeiraFaixa = 9.70;
        double segundaFaixa = 37.35;
        double terceiraFaixa = 49.50;
        double taxa = 0;
        double salarioLiquido = 0;
        if (salarioAnual <= 34712){
            taxa = (salarioAnual *  primeiraFaixa) / 100;
            salarioLiquido = salarioAnual - taxa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            taxa = (salarioAnual * segundaFaixa) / 100;
            salarioLiquido = salarioAnual - taxa;
        }else {
            taxa = (salarioAnual * terceiraFaixa) / 100;
            salarioLiquido = salarioAnual - taxa;
        }
        System.out.println(salarioLiquido);
    }
}
