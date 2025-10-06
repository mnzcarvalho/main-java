package javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        //regra de quantidade de bits (tamanho do espaço em memória)
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean boooleanP = false;


        //classes sendo utilizadas para representar os tipos primitivos
        //regras de polimorfismo. ex: Long long = 10L se tirar o l ele n pode virar inteiro pq tem a ordem de herança
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autoboxing = quando vc tem um tipo primitivo e o Java faz a conversão automática pra um wrapper
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean boooleanW = false;

         int i = intW; //unboxing = qnd vc vai de um wrapper pra um tipo primitivo
        Integer intW2 = Integer.parseInt("11");
        Boolean verdadeiro = Boolean.parseBoolean("TrUe");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));


    }
}
