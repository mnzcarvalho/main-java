package academy.devdojo.mainjava.javacore.Lclassesabstratas.test;

import academy.devdojo.mainjava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import academy.devdojo.mainjava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Luffy", 10000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
