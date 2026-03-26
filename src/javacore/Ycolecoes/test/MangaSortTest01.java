package javacore.Ycolecoes.test;

import javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(01L,"Berserk", 19.9));
        mangas.add(new Manga(02L,"Fullmetal Alchemist: Brotherhood", 22.1));
        mangas.add(new Manga(03L,"Frieren", 11.9));
        mangas.add(new Manga(04L,"Attack on Titan",9.9));
        mangas.add(new Manga(05L,"Jujutsu Kaisen", 8.9));



        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-----------------------");

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("-----------------------");

//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator()); // mesma funcionalidade do codigo acima
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
