package exercicios.estruturadedados.linkedlist.criandolinkedlist;

import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<Integer>();

        ArrayList<Integer> veotor = new ArrayList<Integer>();

        //Adicionar elementos
        int limite = 100000;
        long tempoInicial = System.currentTimeMillis(); // tempo atual em milisegundos
        long tempoFinal;
        for (int i = 0; i < limite; i++) {
            veotor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou " + limite + " elementos no vetor.");
        System.out.println(tempoFinal - tempoInicial);


        tempoInicial = System.currentTimeMillis(); // tempo atual em milisegundos
        for (int i = 0; i < limite; i++) {
            lista.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis(); //O codigo cria objetos novos e muda areferência entro os objetos = + processamento
        System.out.println("\n\nAdicionou " + limite + " elementos na lista.");
        System.out.println(tempoFinal - tempoInicial);

        //ler valores
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < veotor.size(); i++) {
            veotor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor");
        System.out.println(tempoFinal - tempoInicial);

        //ler valores
        tempoInicial = System.currentTimeMillis();
        IteratorLinkedList<Integer> iterator = lista.getIterator();
        while (iterator.isTemProximo()){                    //iterator
            iterator.getProximo();
        }
        tempoFinal = System.currentTimeMillis();             //percorredo lista com for:
        System.out.println("\n\nTempo de leitura da lista"); //o problema da lista é q quando se quer ler um elemento
        System.out.println(tempoFinal - tempoInicial);       //se começa do primeiro e vai a te a posição, e repete
                                                             //O jeito certo pra pegar um elemento é com um iterador
    }
}
