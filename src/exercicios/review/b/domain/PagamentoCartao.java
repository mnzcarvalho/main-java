package exercicios.review.b.domain;

import java.time.LocalDate;

public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private String titular;

    public PagamentoCartao(double valor, String numeroCartao, String titular) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.titular = titular;
    }

    @Override
    public String processarPagamento() {
        //Simula processamento do cartão
        String ultimos4Digitos = numeroCartao.substring(numeroCartao.length() - 4);
        return "Pagamento com cartão processado!\n" +
                "Titular: " + titular + "\n" +
                "Cartão final: ****" + ultimos4Digitos + "\n" +
                "Valor: R$" + String.format("%.2f", valor);
    }

    @Override
    public String gerarRecibo() {
        String ultimos4Digitos = numeroCartao.substring(numeroCartao.length() - 4);
        return super.gerarRecibo() +
                "Forma: Cartão de Crédito\n" +
                "Titular: " + titular + "\n" +
                "Cartão final: ****" + ultimos4Digitos + "\n";
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getTitular() {
        return titular;
    }
}
