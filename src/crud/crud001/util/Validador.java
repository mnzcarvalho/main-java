package crud.crud001.util;

import crud.crud001.enums.Sexo;
import crud.crud001.enums.TipoAnimal;

import java.util.regex.Pattern;

public class Validador {
    // Regex que aceita apenas letras (incluindo acentos) e espaços para nomes compostos
    private static final Pattern PATTERN_APENAS_LETRAS = Pattern.compile("^[\\\\p{L}\\\\s]+$");

    // Valida nome: obrigatório, não vazio, apenas letras/espaços
    public static boolean isNomeValido(String nome){
        if (nome == null || nome.trim().isEmpty()) return false;
        return PATTERN_APENAS_LETRAS.matcher(nome.trim()).matches();
    }

    // Valida raça: opcional (vazio é válido, usará NAO_INFORMADO), apenas letras se preenchido
    public static boolean isRacaValida(String raca){
        if (raca == null || raca.trim().isEmpty()) return false;
        return PATTERN_APENAS_LETRAS.matcher(raca.trim()).matches();
    }

    // Valida e converte idade: aceita vírgula/ponto, erro se >20 ou negativo
    public static double validarIdade (String idadeStr) throws IllegalArgumentException {
        if (idadeStr == null || idadeStr.trim().isEmpty())
            throw new IllegalArgumentException("Idade não pode ser vazia.");
        try {
            String formatada = idadeStr.trim().replace(",",".");
            double idade = Double.parseDouble(formatada);
            if (idade < 0 ) throw new IllegalArgumentException("Idade não pode ser negativa.");
            if (idade > 20 ) throw new IllegalArgumentException("Idade máxima é de 20 anos.");
            return idade;
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Idade inválida, use 2,5 ou 2.5.");
        }
    }

    // Valida e converte peso: erro se <0.5 ou >60
    public static double validarPeso (String pesoStr) throws IllegalArgumentException {
        if (pesoStr == null || pesoStr.trim().isEmpty())
            throw new IllegalArgumentException("Peso não pode ser vazio.");
        try {
            String formatada = pesoStr.trim().replace(",",".");
            double peso = Double.parseDouble(formatada);
            if (peso < 0.5) throw new IllegalArgumentException("Peso mínimo é 0.5kg.");
            if (peso > 60) throw new IllegalArgumentException("Peso máximo é 60kg.");
            return peso;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Peso inválido, use 4,2 ou 4.2.");
        }
    }

    // Converte string para enum TipoAnimal (case-insensitive)
    public static TipoAnimal parseTipoAnimal (String tipoStr) {
        if (tipoStr == null || tipoStr.trim().isEmpty())
            throw new IllegalArgumentException("Tipo não pode ser vazio.");
        try {
            return TipoAnimal.valueOf(tipoStr.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Tipo inválido, porfavor use CACHORRO ou GATO.");
        }
    }

    public static Sexo parseSexo(String sexoStr) throws IllegalArgumentException {
        if (sexoStr == null || sexoStr.trim().isEmpty())
            throw new IllegalArgumentException("Sexo não pode ser vazio");
        try {
            return Sexo.valueOf(sexoStr.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Sexo inválido, porfavor use MACHO ou FEMEA.");
        }
    }

    // Valida campos de endereço: rua/bairro/cidade obrigatórios, número opcional
    public static boolean isCampoEnderecoValido(String campo, boolean obrigatorio){
        return obrigatorio ? (campo != null && !campo.trim().isEmpty()) : true;
    }


}
