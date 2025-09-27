package academy.devdojo.mainjava.exercicios.exercicioLogica.sistemas.sistemabancario;

public abstract class Conta {
    protected static int totalContas = 0;
    protected final int numero;
    protected double saldo;
    protected final TipoConta tipo;

    static {
        System.out.println("Sistema Bancário Iniciando!");
    }

    public Conta(int numero, TipoConta tipo) {
        this.numero = numero;
        this.saldo = 0.0;
        this.tipo = tipo;
        totalContas++;
    }

    public abstract void aplicarTaxa();

    public final int getNumero() {
        return numero;
    }

    public void depositar(double valor) throws IllegalArgumentException {
        if (valor <= 0){
            throw new IllegalArgumentException("Valor de depósito deve ser positivo");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) throws IllegalArgumentException {
        if (valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente: " + saldo);
        }
        this.saldo -= valor;
    }

    public static int getTotalContas(){ return totalContas; }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", tipo=" + tipo.getDescricao() +
                '}';
    }


}
