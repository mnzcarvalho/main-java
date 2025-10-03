package exercicios.sistemas.sistemabiblioteca.core.servicos;

import exercicios.sistemas.sistemabiblioteca.core.modelo.Livro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivros(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        livros.forEach(System.out::println);
    }

    public Livro buscarPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Livro buscarPorISBN(String isbn){
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)){
                return livro;
            }
        }
        return null;
    }

    public List<Livro> getLivros() {
        return livros;
    }
}
