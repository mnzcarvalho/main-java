package academy.devdojo.mainjava.javacore.Gassociacao.test;

import academy.devdojo.mainjava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {

        Jogador Jogador1 = new Jogador("Pelé");
        Jogador Jogador2 = new Jogador("Romário");
        Jogador Jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = new Jogador[]{Jogador1, Jogador2, Jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
