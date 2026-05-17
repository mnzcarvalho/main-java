package javacore.Ycolecoes.test;

import javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
//      List<Manga> mangas = new ArrayList<>(6);
        List<Manga> mangas = new LinkedList<>(); //remoção em lined list é: O(1)
        mangas.add(new Manga(01L, "Berserk", 19.9, 0));
        mangas.add(new Manga(02L, "Fullmetal Alchemist: Brotherhood", 22.1, 5));
        mangas.add(new Manga(03L, "Frieren", 11.9, 0));
        mangas.add(new Manga(04L, "Attack on Titan", 9.9, 2));
        mangas.add(new Manga(05L, "Jujutsu Kaisen", 8.9, 0));

        //não utilizar foreach para fazer remoção
        //ConcurrentModificationException

        //Iterator é uma classe que checa antes de fazer alguma ação.
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0 ){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
