package javacore.Ycolecoes.test;

import javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();

        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(02L,"Fullmetal Alchemist: Brotherhood", 22.1));
        mangas.add(new Manga(01L,"Berserk", 19.9));
        mangas.add(new Manga(04L,"Attack on Titan",9.9));
        mangas.add(new Manga(03L,"Frieren", 11.9));
        mangas.add(new Manga(05L,"Jujutsu Kaisen", 8.9));

        //compara por nome pq na classe mangá o metodo compareTo está comparando por nome
        //Collections.sort(mangas);

        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(05L, "Jujutsu Kaisen", 8.9);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));

    }
}
