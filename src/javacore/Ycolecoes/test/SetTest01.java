package javacore.Ycolecoes.test;

import javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        //Set proíbe elementos duplicados
        //Os elementos são organizados pelo hash, podendo se reajustar baseado no que se insere.
        //Não tem index no Set
        //LinkedHashSet mantem a ordem de inserção

        Set<Manga> mangas = new LinkedHashSet<>();
//      Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(01L, "Berserk", 19.9, 0));
        mangas.add(new Manga(02L, "Fullmetal Alchemist: Brotherhood", 22.1, 5));
        mangas.add(new Manga(03L, "Frieren", 11.9, 0));
        mangas.add(new Manga(04L, "Attack on Titan", 9.9, 2));
        mangas.add(new Manga(05L, "Jujutsu Kaisen", 8.9, 0));
        //Não duplica os elemtos, baseado com oq se tem no equals (por isso é importante sobrescrever).

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
