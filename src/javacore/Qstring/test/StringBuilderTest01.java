package javacore.Qstring.test;

// a performance da SB é maior porque faz a mudança direto na string sem alocar um novo espaço na pool de strings
//substring() não funciona no string builder pq retorna uma String
public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Eduardo Menezes";
        nome.concat(" JAVA++");
        nome.substring(0, 3);
        System.out.println(nome);
        nome = nome.substring(0, 6);
        System.out.println(nome);
        //String build não é imutávelé como a String, é uma classe
        //String, stringBuilder e stringBuffer são objetos diferentes
        //sb.append() para adicionar elementos
        StringBuilder sb = new StringBuilder("Eduardo Menezes");
        sb.append(" JAVA").append("++");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
    }
}
