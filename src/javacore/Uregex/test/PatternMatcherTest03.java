package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = tudo que não for dígito
        // \s = todos os espaços em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-zA-Z, dígitos, _
        // \W = tudo que não for incluso no \w
        // []
//        String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        String texto2 = "12 0x 0X 0XFFABC 0x109 0x1";
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
