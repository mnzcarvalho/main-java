package javacore.Aintroducaoclasses.test;
//coesão

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Jiraya";
        professor.idade = 999;
        professor.sexo = 'X';
        System.out.println("Nome: " + professor.nome + ", idade: " + professor.idade + ", sexo: " + professor.sexo);
    }
}
