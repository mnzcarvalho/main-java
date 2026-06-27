package javacore.Zgenerics.test;

import javacore.Zgenerics.domain.Barco;
import javacore.Zgenerics.domain.Carro;
import javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o barco por 1 mês: ");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("============================");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por 1 mês: ");
        rentalServiceBarco.retornarObjetoAlugado(barco);

    }

}

