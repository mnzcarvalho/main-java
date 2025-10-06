package javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();

        long result = fim - inicio;
        System.out.println("Tempo gasto para String " + result + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_0000);
        fim = System.currentTimeMillis();

        result = fim - inicio;
        System.out.println("Tempo gasto para StringBuilder " + result + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_0000);
        fim = System.currentTimeMillis();

        result = fim - inicio;
        System.out.println("Tempo gasto para StringBuffer " + result + " ms");

    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) { //Strings imutaveis, cada iteração do for será criando uma stringo na pool de strings
            texto += i;       //0, 01, 012, 0123
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) { //Strings imutaveis, cada iteração do for será criando uma stringo na pool de strings
            sb.append(i);      //0, 01, 012, 0123
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) { //Strings imutaveis, cada iteração do for será criando uma stringo na pool de strings
            sbf.append(i);      //0, 01, 012, 0123
        }
    }

}
