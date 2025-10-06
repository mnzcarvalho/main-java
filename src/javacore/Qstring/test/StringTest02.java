package javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = " Minato";
        String numeros = "012345";
        System.out.println(nome.charAt(5));
        int[] nums = {1, 2, 3};
        System.out.println(nums.length);    //esse lenght é um atributo
        System.out.println(nome.length());  // esse lenght() é um metodo
        System.out.println(nome.replace("o", "OOOOWww"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, numeros.length())); //o segundo indice é exclusivo, só percorre de x a y-1; o .lenght percorre tudo
        System.out.println(nome.trim()); // remove valores em branco no inicio e no fim da string

    }
}
