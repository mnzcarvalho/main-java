package exercicios.sistemas.sistemabiblioteca.app;

import exercicios.sistemas.sistemabiblioteca.algoritmo.ordenacao.BubbleSort;
import exercicios.sistemas.sistemabiblioteca.core.modelo.Livro;
import exercicios.sistemas.sistemabiblioteca.core.servicos.Biblioteca;

public class Main {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivros(new Livro("Java Básico", "João Silva", "123", 2020));
        biblioteca.adicionarLivros(new Livro("Estruturas de Dados", "Maria Souza", "456", 2018));
        biblioteca.adicionarLivros(new Livro("Algoritmos", "Carlos Lima", "789", 2022));

        System.out.println("Listar livros");
        biblioteca.listarLivros();

        System.out.println("\nBuscar por título: ");
        System.out.println(biblioteca.buscarPorTitulo("Java Básico"));

        System.out.println("\nOrdenando livros por ano");
        BubbleSort.ordenarPorAno(biblioteca.getLivros());
        biblioteca.listarLivros();

        //Emprestimo
        Livro l = biblioteca.buscarPorISBN("123");
        l.emprestar();
        System.out.println("\nApós empréstimo:");
        biblioteca.listarLivros();
    }
}
