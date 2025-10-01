package exercicios.estruturadedados.linkedlist.criandolinkedlist;
//adicionar e pegar elementos de uma lista

public class Programa {
    public static void main(String[] args) {
        ListaLigada<String> lista = new ListaLigada<String>();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro elemento: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo elemento: " + lista.getUltimo().getValor());

        System.out.println("Tamanho: " + lista.getTamanho());
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println("Estado: " + lista.get(i).getValor());
        }

        //remover estado
        System.out.println("Removendo Estado CE...");
        lista.remover("CE");
        System.out.println("Adicionando Estado SP...");
        lista.adicionar("SP");
        lista.remover("AC");
        lista.remover("BA");
        lista.remover("DF");
        lista.remover("SP");
        lista.adicionar("RJ");


        System.out.println("Tamanho da Lista: " + lista.getTamanho());
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println("Estado: " + lista.get(i).getValor());
        }
    }
}
