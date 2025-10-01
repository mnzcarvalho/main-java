package javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{


    //Sobrescrita de métodos com exceções, não se é obrigado a passar as mesmas exceções que foram declaradas
    //Exceções do time runtime não forçam você fazer o tratamento na chamada do metodo
    //Não pode adicionar exceções mais genéricas ou do tipo checked que não foi declarada no metodo original (Na sobrescrita)
    public void salvar() throws LoginInvalidoException, ArithmeticException {

    }
}
