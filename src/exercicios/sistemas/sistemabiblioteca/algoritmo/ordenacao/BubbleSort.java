package exercicios.sistemas.sistemabiblioteca.algoritmo.ordenacao;

import exercicios.sistemas.sistemabiblioteca.core.modelo.Livro;

import java.util.List;

public class BubbleSort {
    public static void ordenarPorAno(List<Livro> livros){
        int n = livros.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (livros.get(j).getAno() > livros.get(j + 1).getAno()){
                    Livro temp = livros.get(j);
                    livros.set(j, livros.get(j + 1));
                    livros.set(j + 1, temp);
                }
            }
        }
    }
}
