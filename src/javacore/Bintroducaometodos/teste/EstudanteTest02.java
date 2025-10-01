package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Estudante;

//Referência THIS
public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();

        estudante01.nome = "Hokage";
        estudante01.idade = 274;
        estudante01.sexo = 'H';

        estudante02.nome = "Sensei";
        estudante02.idade = 166;
        estudante02.sexo = 's';

        estudante03.nome = "Eduardo";
        estudante03.idade = 28;
        estudante03.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
        estudante03.imprime();

    }
}
