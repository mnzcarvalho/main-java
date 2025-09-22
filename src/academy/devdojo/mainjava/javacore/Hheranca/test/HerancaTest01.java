package academy.devdojo.mainjava.javacore.Hheranca.test;

import academy.devdojo.mainjava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.mainjava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.mainjava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-009");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("111222333");
        pessoa.setEndereco(endereco);

        pessoa.impressora();

        System.out.println("===============================");

        Funcionario funcionario = new Funcionario("Minato");
        funcionario.setCpf("999888777");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.impressora();
    }
}
