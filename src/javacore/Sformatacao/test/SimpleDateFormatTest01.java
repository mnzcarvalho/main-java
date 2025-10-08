package javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Arcoverde: 'yyyy.MM.dd G 'at' HH:mm:ss z";
        pattern = "'Arcoverde: ' dd 'de' MMMM 'de 'yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println("Dentro do parse>>> "+sdf.parse("Arcoverde:  08 de outubro de 2025"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
