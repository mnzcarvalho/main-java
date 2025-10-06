package javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Eduardo";                   //cria uma string imutavel
        String nome2 = "Eduardo";                  //nome2 faz referência ao mesmo objeto em memória (que está no pool de String do Java)
        System.out.println(nome == nome2);         // == referência // .equals() strings
        nome.concat(" Menezes");
        System.out.println(nome);
        System.out.println(nome == nome2);         //ainda continua igual, pq quando concatenei ele criou mais duas Strings na pool de strin
                                                   // 1 = " Menezes";  2 = "Eduardo Menezes";

        nome = nome.concat(" Menezes");
        System.out.println(nome);                   //agora alterou
        System.out.println(nome2);
        System.out.println(nome == nome2);

        //não recomendado o uso
        String nome3 = new String("Eduardo");   // faz referência a um objeto em memória, q esse objeto pega a string que está na pool de strings
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); // comparando se os valores sao o mesmo dentro da pool de strings

    }
}
