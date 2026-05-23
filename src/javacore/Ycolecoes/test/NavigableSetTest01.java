package javacore.Ycolecoes.test;

//Interface que extend SortSet, esse que extend Set. Então segue as regras de não ter elementos duplicados.(verificação pelo equals)

import javacore.Ycolecoes.domain.Manga;
import javacore.Ycolecoes.domain.Smartphone;

import java.util.*;

//Classes com o nome "tree" geralmente está linkado com "Sort" (Precisam ter "Comparable")
//ClassCastException, excessão em caso de não ter o comparable

//Opções: Classe implementar comparable, ou implementar Comparator da criação do TreeSet
class SmarthphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{


    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmarthphoneMarcaComparator());
        Smartphone nokia = new Smartphone("123", "Nokia");
        set.add(nokia);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(01L,"Berserk", 19.9, 3));
        mangas.add(new Manga(02L,"Fullmetal Alchemist: Brotherhood", 22.1, 10));
        mangas.add(new Manga(03L,"Frieren", 11.9, 100));
        mangas.add(new Manga(04L,"Attack on Titan",9.9, 2));
        mangas.add(new Manga(05L,"Jujutsu Kaisen", 8.9, 0));

        //Nesse caso, retorna em ordem alfabética porque na classe Manga temos o Comparatle/compareTo, comparando pelo "nome";
        //descendingSet,
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 9.9, 5);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("======================");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // retorna e remove o primeiro elemento da lista
        System.out.println(mangas.pollLast()); // retorna e remove o ultimo elemento da lista

    }
}
