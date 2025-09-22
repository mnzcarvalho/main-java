package academy.devdojo.mainjava.javacore.Gassociacao.testEx;

import academy.devdojo.mainjava.javacore.Gassociacao.dominioEx.Aluno;
import academy.devdojo.mainjava.javacore.Gassociacao.dominioEx.Local;
import academy.devdojo.mainjava.javacore.Gassociacao.dominioEx.Professor;
import academy.devdojo.mainjava.javacore.Gassociacao.dominioEx.Seminario;

public class SistemaSeminarioTest {
    public static void main(String[] args) {
        Local local = new Local("Audiotório Municipal");
        Aluno aluno1 = new Aluno("Pedro", 18);
        Aluno[] alunos = {aluno1};
        Seminario seminario1 = new Seminario("O uso da IA no Desenvolvimento Profeissional", alunos, local);
        Seminario[] seminarios = {seminario1};

        Professor professor1 = new Professor("Eduardo", "Inteligencia Artificial", seminarios);

        professor1.imprime();

        System.out.println("=== === === === === === === === === === === ===");

        Local local2 = new Local("Block D");
        Aluno aluno2 = new Aluno("Sophia", 22);
        Aluno[] alunos2 = {aluno2};
        Seminario seminario2 = new Seminario("Low-Level Programming", alunos2, local2);
        Seminario[] seminarios2 = {seminario2};

        Professor professor2 = new Professor("Eduardo", "Low-Level Programming", seminarios2);

        professor2.imprime();
    }
}
