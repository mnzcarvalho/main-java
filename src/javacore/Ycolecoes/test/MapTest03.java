package javacore.Ycolecoes.test;

import javacore.Ycolecoes.domain.Consumidor;
import javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Eduardo Menezes");
        Consumidor consumidor2 = new Consumidor("MNZ NET ");

        Manga manga1 = new Manga(02L, "Fullmetal Alchemist: Brotherhood", 22.1);
        Manga manga2 = new Manga(01L, "Berserk", 19.9);
        Manga manga3 = new Manga(04L, "Attack on Titan", 9.9);
        Manga manga4 = new Manga(03L, "Frieren", 11.9);
        Manga manga5 = new Manga(05L, "Jujutsu Kaisen", 8.9);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga4, manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }
            System.out.println();

        }

    }
}
