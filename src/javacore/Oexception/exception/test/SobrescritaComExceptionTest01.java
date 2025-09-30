package academy.devdojo.mainjava.javacore.Oexception.exception.test;

import academy.devdojo.mainjava.javacore.Oexception.exception.domain.Funcionario;
import academy.devdojo.mainjava.javacore.Oexception.exception.domain.LoginInvalidoException;
import academy.devdojo.mainjava.javacore.Oexception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();



        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

}
