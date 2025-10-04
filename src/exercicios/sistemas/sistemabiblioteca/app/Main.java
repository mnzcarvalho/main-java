package exercicios.sistemas.sistemabiblioteca.app;

import exercicios.sistemas.sistemabiblioteca.algoritmo.ordenacao.BubbleSort;
import exercicios.sistemas.sistemabiblioteca.core.modelo.*;
import exercicios.sistemas.sistemabiblioteca.core.servicos.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivros(new Livro("Java Básico", "João Silva", "123", 2020, Categoria.TECNICO));
        biblioteca.adicionarLivros(new Livro("Estruturas de Dados", "Maria Souza", "456", 2018, Categoria.TECNICO));
        biblioteca.adicionarLivros(new Livro("Senhor dos Anéis", "J.R.R. Tolkien", "789", 1954, Categoria.FICCAO));

        List<Pessoa> pessoas = new ArrayList<>();
        Usuario u1 = new Usuario("yoooo man", "xablau@gmail.com");
        Funcionario f1 = new Funcionario("Uoooooouuu", "arroba@gmail.com", "Bibliotecária");

        pessoas.add(u1);
        pessoas.add(f1);

        System.out.println("Pessoas Registradas");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }


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
