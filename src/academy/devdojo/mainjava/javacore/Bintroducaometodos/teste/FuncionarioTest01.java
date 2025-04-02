package academy.devdojo.mainjava.javacore.Bintroducaometodos.teste;
import academy.devdojo.mainjava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Eduardo";
        funcionario.idade = 28;
        funcionario.salarios = new double[]{2000.0, 3000.0, 4000.0};
    //    funcionario.media = (funcionario.salarios[0] + funcionario.salarios[1] + funcionario.salarios[2]) / 3;
        funcionario.imprime();
//        funcionario.imprimeMediaSalarial();
    }
}
