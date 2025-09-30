package academy.devdojo.mainjava.javacore.Bintroducaometodos.teste;
// Modificador de acesso private, get e set pt 01

import academy.devdojo.mainjava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Klayton Rasta";

        pessoa.setNome("Klayton Rasta");
        pessoa.setIdade(1);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }

}
