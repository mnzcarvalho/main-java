package exercicios.sistemas.redesocial.utils;

import exercicios.sistemas.redesocial.interfaces.Validavel;

public class Validador {
    private Validador(){}

    public static boolean validarEmail(String email){
        return  email != null && email.contains("@") && email.contains(".");
    }

    public static boolean validarObjeto(Validavel objeto){
        return objeto.validar();
    }
}
