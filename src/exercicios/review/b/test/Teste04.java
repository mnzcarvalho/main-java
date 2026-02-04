package exercicios.review.b.test;

import exercicios.review.b.domain.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teste04 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PAGAMENTO ===\n");

        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new PagamentoCartao(150.75, "1234567812345678", "João Silva"));

        pagamentos.add(new PagamentoBoleto(299.90, "00193373700000010000500940144816060680935031",
                LocalDate.now().plusDays(5)));

        pagamentos.add(new PagamentoPix(89.50, "joao.silva@email.com"));

        for (Pagamento pagamento : pagamentos) {
            System.out.println("=".repeat(40));
            System.out.println(pagamento.processarPagamento());
            System.out.println("\n" + pagamento.gerarRecibo());

            // Exemplo de uso específico para cada tipo
            if (pagamento instanceof PagamentoBoleto) {
                PagamentoBoleto boleto = (PagamentoBoleto) pagamento;
                System.out.println("Info boleto: " + boleto.confirmarPagamento());
            } else if (pagamento instanceof PagamentoPix) {
                PagamentoPix pix = (PagamentoPix) pagamento;
                System.out.println("Transação PIX ID: " + pix.getIdentificadorTransacao());
            }

            System.out.println();
        }

        System.out.println("=".repeat(40));
        System.out.println("Total de pagamentos: " + pagamentos.size());
    }
}