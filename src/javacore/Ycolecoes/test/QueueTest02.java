package javacore.Ycolecoes.test;


import javacore.Ycolecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(01L,"Berserk", 19.9, 3));
        mangas.add(new Manga(02L,"Fullmetal Alchemist: Brotherhood", 22.1, 10));
        mangas.add(new Manga(03L,"Frieren", 11.9, 100));
        mangas.add(new Manga(04L,"Attack on Titan",9.9, 2));
        mangas.add(new Manga(05L,"Jujutsu Kaisen", 8.9, 0));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
