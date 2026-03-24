package javacore.Ycolecoes.test;

import javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Fullmetal Alchemist: Brotherhood");
        mangas.add("Frieren");
        mangas.add("Attack on Titan");
        mangas.add("Jujutsu Kaisen");

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(121.12);
        dinheiros.add(-12D);
        dinheiros.add(12122.2);

        for (String manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("---------------");
        Collections.sort(mangas); // ordena por ordem alfabética
        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------");

        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }

        System.out.println("---------------");

        Collections.sort(dinheiros); // ordena do menor para o maior
        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }

    }
}
