package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
//        List nomes = new ArrayList<>(); v1.4 pode ter varios objetos de tipos diferentes.
        List<String> nomes = new ArrayList<>(); // lista com tipo definido
        nomes.add("Eduardo");
        nomes.add("List academy");
//        nomes.add(121); ex: int na list. v1.4

//        for(Object nome: nomes){    v1.4

        for(String nome: nomes){
            System.out.println(nome);
        }

        nomes.add("vrau");
        System.out.println("-------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i));
        }

    }
}
