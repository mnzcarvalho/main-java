package academy.devdojo.mainjava.exercicios.exercicioLogica.sistemas.sistemabancario;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
