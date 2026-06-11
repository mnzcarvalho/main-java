package javacore.Zgenerics;

import javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sengoku");
        list.add("any");

        for (String s : list) {
            System.out.println(s);
        }

        add(list, new Consumidor("consumidor"));
        //o uso de generics(<String>) vai fazer a validação em tempo de compilação, não deixando passar para a JVM se o tipo não estiver correto
        //sem generics, o codigo roda, mas apresenta class cast exception
        for (String s : list) {
            System.out.println(s);
        }

    }

    //Type Erasure - o java apaga a definição de tipoo
    private static void add(List list, Consumidor consumidor){
        list.add(consumidor);
    }
}
