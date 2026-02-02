package exercicios.review.a.test;

import exercicios.review.a.domain.Biblioteca;
import exercicios.review.a.domain.Emprestimo;
import exercicios.review.a.domain.Livro;
import exercicios.review.a.domain.Tese;

public class TestMain {
    public static void main(String[] args) {
        Livro livro = new Livro("L001", "Java para Iniciantes", 2020, 350);
        Tese tese = new Tese("T001", "IA na Educação", 2022, "Maria Silva");

        System.out.println("=== Teste 1: Detalhes dos materiais ===");
        System.out.println(livro.exibirDetalhes());
        System.out.println(tese.exibirDetalhes());

        System.out.println("\n=== Teste 2: Sobrecarga (resumido) ===");
        System.out.println("Resumido (true): " + livro.exibirDetalhes(true));
        System.out.println("Resumido (false): " + livro.exibirDetalhes(false));

        Biblioteca.incrementarTotalMateriais();
        System.out.println("\n=== Teste 3: Contador estático ===");
        System.out.println("Total de materiais: " + Biblioteca.getTotalMateriais());

        System.out.println("\n=== Teste 4: Associação (Empréstimo) ===");
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.registrarEmprestimo(livro, "01/03/2024");
        System.out.println(emprestimo.exibirEmprestimo());


    }
}