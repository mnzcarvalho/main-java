package academy.devdojo.mainjava.javacore.Gassociacao.test;

import academy.devdojo.mainjava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.mainjava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafú");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador[] jogadores = {jogador1, jogador2};
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
//        jogador2.setTime(time);                //o time tem o jogador, mas o jogador n está no time
        time.setJogadores(jogadores);

        System.out.println("====Jogador1=====");
        jogador1.imprime();
        System.out.println("====Jogador2=====");
        jogador2.imprime();

        System.out.println("====Time=====");
        time.imprime();


    }
}
