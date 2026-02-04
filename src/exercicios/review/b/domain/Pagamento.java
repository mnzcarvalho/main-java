package exercicios.review.b.domain;

import java.time.LocalDate;
import java.util.Locale;

public abstract class Pagamento {
    protected double valor;
    protected LocalDate data;

    public Pagamento(double valor) {
        this.valor = valor;
        this.data = LocalDate.now();
    }

    public abstract String processarPagamento();

    public String gerarRecibo() {
        String valorFormatado = String.format(Locale.US,"%.2f", valor);

        return "RECIBO" +
                "\nData: " + data +
                "\nValor: " + valorFormatado +
                "\nStatus: Processado\n";
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }
}
