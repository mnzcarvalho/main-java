package crud.crud001.util;

import crud.crud001.enums.Sexo;
import crud.crud001.enums.TipoAnimal;

public class Validador {

    // Valida nome/sobrenome: obrigatório, apenas letras e espaços.
    public static boolean validarNomeSobrenome(String nome) {
        if (nome == null || nome.trim().isEmpty()) return false;
        return nome.matches("[\\p{L} ]+");
    }

    // Converte string para TipoAnimal. Retorna null se inválido.
    public static TipoAnimal parseTipo(String input) {
        try { return TipoAnimal.valueOf(input.trim().toUpperCase()); }
        catch (Exception e) { return null; }
    }

    // Converte string para Sexo. Retorna null se inválido.
    public static Sexo parseSexo(String input) {
        try { return Sexo.valueOf(input.trim().toUpperCase()); }
        catch (Exception e) { return null; }
    }

    // Valida idade: deve estar entre 0 e 20 (inclusive).
    public static boolean validarIdade(double idade) {
        return idade >= 0 && idade <= 20;
    }

    // Valida peso: deve estar entre 0.5 e 60 (inclusive).
    public static boolean validarPeso(double peso) {
        return peso >= 0.5 && peso <= 60;
    }

    // Valida raça: se vazio = ok (opcional), senão apenas letras.
    public static boolean validarRaca(String raca) {
        if (raca == null || raca.isEmpty()) return true;
        return raca.matches("[\\p{L} ]+");
    }
}
