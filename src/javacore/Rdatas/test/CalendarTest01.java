package javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

//n pode new Calendar pois ela é abstrata
public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime(); //data formatada, originada do calendário gregoriano (calendar)
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println("Dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do mês: " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do ano: "+c.get(Calendar.DAY_OF_YEAR));
        System.out.println("Dia da semana no mês: " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        c.add(Calendar.DAY_OF_MONTH, 2); // adiciona 2 dias no calendário
        c.roll(Calendar.HOUR, 12); //roll adiciona sem virar o dia: ex 12hrs agr, add + 12, vai pra 0:00hrs sem virar o dia
        System.out.println(c);
        System.out.println(date);
    }
}
