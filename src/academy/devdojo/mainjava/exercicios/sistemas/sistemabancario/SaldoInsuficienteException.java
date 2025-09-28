package academy.devdojo.mainjava.exercicios.sistemas.sistemabancario;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
