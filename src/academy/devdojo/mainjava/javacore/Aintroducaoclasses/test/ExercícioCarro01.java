package academy.devdojo.mainjava.javacore.Aintroducaoclasses.test;

import academy.devdojo.mainjava.javacore.Aintroducaoclasses.dominio.Carro;

//criar dois objetos com a classe carro e imprimir seus valores
public class ExercícioCarro01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.ano = 1910;
        carro1.modelo = "Full + 15";

        // carro1 = carro2; (Referência de objetos)

        carro2.nome = "Fiat";
        carro2.ano = 2050;
        carro2.modelo = "Vrau";

        System.out.println("O primeiro carro é um: " + carro1.nome + " do ano " + carro1.ano + ", modelo: " + carro1.modelo + ".");
        System.out.println("\nO segundo carro é um: " + carro2.nome + " do ano " + carro2.ano + ", modelo: " + carro2.modelo + ".");
    }
}
