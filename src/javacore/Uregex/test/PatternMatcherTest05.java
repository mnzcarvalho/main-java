package javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // ? zero ou uma ocorrência
        // * zero ou mais
        // + uma ou mais ocorrências
        // {n, m} de n até m
        // () agrupamento
        // | o(v|c)o  ovo, ou oco
        // $ fim da linha
        // . 1.3 = 123, 133, 1@3, 1A3
        // regexr > ^\w+  // [^abc] <- negação
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "yuzu@hotmail.com, jotaro@gmail.com, !@#$%zoro@mail.br, test@gmail.com.br, sakura@mail";
        System.out.println("Email válido");
        System.out.println("!@#$%zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+ " " + matcher.group() + "\n");
        }
    }
}
