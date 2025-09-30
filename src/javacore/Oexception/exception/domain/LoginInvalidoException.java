package academy.devdojo.mainjava.javacore.Oexception.exception.domain;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login inválido!");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
