package academy.devdojo.mainjava.javacore.Kenumeracao.test;

import academy.devdojo.mainjava.javacore.Kenumeracao.domain.Cliente;
import academy.devdojo.mainjava.javacore.Kenumeracao.domain.Cliente.TipoPagamento;
import academy.devdojo.mainjava.javacore.Kenumeracao.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("YUZU", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("aLLieNn",TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);


        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
