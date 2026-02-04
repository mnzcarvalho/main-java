package exercicios.review.b.domain;

import java.util.UUID;

public class PagamentoPix extends Pagamento {
    private String chavePix;
    private String identificadorTransacao;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
        this.identificadorTransacao = gerarIdentificador();
    }

    //Gera um identificador único para a transação PIX.
    private String gerarIdentificador() {
        return "PIX-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    @Override
    public String processarPagamento() {
        return "Pagamento PIX processado instantaneamente!\n" +
                "Chave PIX: " + chavePix + "\n" +
                "ID da transação: " + identificadorTransacao + "\n" +
                "Valor: R$ " + String.format("%.2f", valor) + "\n" +
                "Status: Concluído";
    }

    @Override
    public String gerarRecibo() {
        return super.gerarRecibo() +
                "Forma: PIX\n" +
                "Chave PIX: " + chavePix + "\n" +
                "ID Transação: " + identificadorTransacao + "\n" +
                "Status: Concluído instantaneamente\n";
    }

    public String getChavePix() {
        return chavePix;
    }

    public String getIdentificadorTransacao() {
        return identificadorTransacao;
    }
}
