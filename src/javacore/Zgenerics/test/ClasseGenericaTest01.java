package javacore.Zgenerics.test;

import javacore.Zgenerics.domain.Carro;
import javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por 1 mês: ");
        carroRentavelService.retornarCarroAlugado(carro);
    }

}