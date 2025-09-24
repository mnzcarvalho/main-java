package academy.devdojo.mainjava.javacore.Kenumeracao.test;

import academy.devdojo.mainjava.javacore.Kenumeracao.domain.Cliente;
import academy.devdojo.mainjava.javacore.Kenumeracao.domain.TipoCliente;
import academy.devdojo.mainjava.javacore.Kenumeracao.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("YUZU", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("aLLieNn",TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
