package javacore.Oexception.exception.test;

import javacore.Oexception.exception.domain.Funcionario;
import javacore.Oexception.exception.domain.LoginInvalidoException;
import javacore.Oexception.exception.domain.Pessoa;

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
