package academy.devdojo.mainjava.javacore.Bintroducaometodos.teste;

import academy.devdojo.mainjava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.mainjava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Hokage";
        estudante01.idade = 274;
        estudante01.sexo = 'H';

        estudante02.nome = "Sensei";
        estudante02.idade = 166;
        estudante02.sexo = 's';

        estudante03.nome = "Eduardo";
        estudante03.idade = 28;
        estudante03.sexo = 'M';


        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        impressora.imprime(estudante03);




    }
}
