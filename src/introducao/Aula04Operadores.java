package introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //  + - / *
        int numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 / numero2;
        System.out.println(resultado);

        // % resoto da divisão
        double resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == != (op lógicos)
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        // && (AND), || (OR) !, (NOT)
        double idadeImigrante = 28;
        float salarioImigrante = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idadeImigrante >= 30 && salarioImigrante >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idadeImigrante < 30 && salarioImigrante >= 3381;
        System.out.println(isDentroDaLeiMenorQueTrinta);
        System.out.println(isDentroDaLeiMaiorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000f;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlayStation || valorTotalContaPoupanca >= valorPlayStation;
        System.out.println("O playstation 5 é compravel? "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 2000;
        System.out.println(bonus);

        //
        int contador = 1;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++); //++ depois, executa depois incrementa
        System.out.println(contador2);

    }
}
