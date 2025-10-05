package exercicios.sistemas.redesocial.exceptions;

public class RedeSocialException extends Exception {
    public RedeSocialException(String message) {
        super(message);
    }

    public RedeSocialException(String message, Throwable cause) {
        super(message, cause);
    }
}
