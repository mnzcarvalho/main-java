package academy.devdojo.mainjava.exercicios.exercicioLogica.sistemas.sistemabancario;

public class ContaCorrente extends Conta implements Tributavel{
    private static final double LIMITE_SAQUE = 2000;

    public ContaCorrente(int numero) {
        super(numero, TipoConta.CORRENTE);
    }

    @Override
    public void sacar(double valor) throws IllegalArgumentException {
        if (valor > LIMITE_SAQUE){
            throw new LimiteExcedidoException("Limite de saque excedido: " + LIMITE_SAQUE);
        }
        super.sacar(valor);
    }

    @Override
    public void aplicarTaxa() {
        this.saldo -= 10; // Taxa de manutenção
    }

    @Override
    public double calcularTributo() {
        return this.saldo * TAXA_BASE;
    }
}
