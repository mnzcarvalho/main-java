package academy.devdojo.mainjava.exercicios.exercicioLogica.sistemas.sistemabancario;

public class ContaPoupanca extends Conta implements Rentavel{


    public ContaPoupanca(int numero) {
        super(numero, TipoConta.POUPANCA);
    }

    @Override
    public void aplicarTaxa() {
        //Poupança não tem taxa
    }

    @Override
    public double calcularRendimento() {
        return this.saldo * tipo.getTaxa();
    }

    public void aplicarRendimento(){
        this.saldo += calcularRendimento();
    }
}
