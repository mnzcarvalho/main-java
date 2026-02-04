package exercicios.review.b.domain;

import java.time.LocalDate;

public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;
    private LocalDate dataVencimento;

    public PagamentoBoleto(double valor, String codigoBarras, LocalDate dataVencimento) {
        super(valor);
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String processarPagamento() {
        return "Boleto gerado com sucesso!\n" +
                "Código de barras: " + codigoBarras + "\n" +
                "Data de vencimento: " + dataVencimento + "\n" +
                "Valor: R$ " + String.format("%.2f", valor) + "\n" +
                "Boleto pendente de pagamento.";
    }

    @Override
    public String gerarRecibo() {
        return super.gerarRecibo() +
                "Forma: Boleto Bancário\n" +
                "Código de barras: " + codigoBarras + "\n" +
                "Vencimento: " + dataVencimento + "\n" +
                "Status: Aguardando pagamento\n";
    }

    public String confirmarPagamento() {
        return "Pagamento do boleto confirmado!\n" +
                "Código: " + codigoBarras + "\n" +
                "Data do pagamento: " + data;
    }


    public String getCodigoBarras() {
        return codigoBarras;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
}
