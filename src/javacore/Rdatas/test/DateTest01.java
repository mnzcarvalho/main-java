package javacore.Rdatas.test;

import java.util.Date;
//java 8 sistemas legado
//Date conta o tempo desde 1970 em ms
public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1759848077352L); //long, ms
        Date date2 = new Date(); //long, ms

        date.setTime(date.getTime() + 3600000); // adiciona 1 hora
        System.out.println(date);
        System.out.println(date2);
        System.out.println(date2.getTime()); // mostra o long que representa hoje
    }
}
