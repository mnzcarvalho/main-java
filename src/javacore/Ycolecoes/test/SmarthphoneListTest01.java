package javacore.Ycolecoes.test;

import javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmarthphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);


        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("22222", "Pixel");


        System.out.println(smartphones.contains(s4));
        int indexSmarthphone4 = smartphones.indexOf(s4); //-1 caso n exista
        //System.out.println(indexSmarthphone4); mantem a ordem do indice. s4 está no mesmo indice que o s2
        System.out.println(smartphones.get(indexSmarthphone4)); // pega o objeto
    }
}
