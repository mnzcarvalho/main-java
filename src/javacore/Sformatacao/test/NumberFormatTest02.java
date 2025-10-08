package javacore.Sformatacao.test;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
//get e set > getMaximumFractionDigits
public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeEUA = new Locale("en", "US");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat [] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeEUA);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 1000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.print(numberFormat);
            System.out.println(numberFormat.format(valor));
            System.out.println();
        }

        String valorString = "R$ 1.000,21"; // tem q passar o tipo de moeda de acordo com o pais. n pode ser só o número

        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
