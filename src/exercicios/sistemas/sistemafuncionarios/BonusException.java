package exercicios.sistemas.sistemafuncionarios;

public class BonusException extends Exception {
    public BonusException() {
        System.out.println("Bonus calculado negativo.");
    }
}
