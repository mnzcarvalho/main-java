package javacore.Csobrecargametodos.test;

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();//variavel de referencia que instancia um objeto atravez do new anime
        anime.init("Fullmetal Alchemist: Brotherhood", "TV", 64, "Ação");
        anime.imprime();
    }
}
