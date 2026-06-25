package javacore.Zgenerics.test;

import javacore.Zgenerics.domain.Barco;
import javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por 1 mês: ");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }

}

