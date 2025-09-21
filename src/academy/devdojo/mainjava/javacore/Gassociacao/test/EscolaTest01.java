package academy.devdojo.mainjava.javacore.Gassociacao.test;

import academy.devdojo.mainjava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.mainjava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Minato Sensei");
        Professor [] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
