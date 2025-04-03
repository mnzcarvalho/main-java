package academy.devdojo.mainjava.javacore.Dconstrutores.test;


import academy.devdojo.mainjava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("FMA", "TV", 64, "Ação", "Vrau");//variavel de referencia que instancia um objeto atravez do new anime
        anime.imprime();
    }
}
