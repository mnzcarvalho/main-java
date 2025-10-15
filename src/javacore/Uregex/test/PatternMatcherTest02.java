package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo que não for dígito
        // \s = todos os espaços em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-zA-Z, dígitos, _
        // \W = tudo que não for incluso no \w
        String regex = "\\W";
        String texto = "abaaba";
        String texto2 = "@a65sd4f\t_a8sd4f!";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+ " " + matcher.group() + "\n");
        }
    }
}
