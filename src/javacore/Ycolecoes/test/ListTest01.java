package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
//      List nomes = new ArrayList<>(); v1.4 pode ter varios objetos de tipos diferentes.
        List<String> nomes = new ArrayList<>(16); // lista com tipo definido (tem que ser um objeto). usar os Wrappers (Integer, Boolean...)
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Eduardo");
        nomes.add("List academy");
        nomes2.add("Menezes");
        nomes2.add("List parte 2");
        System.out.println("Retorno do equals dentro do \"remove\": " + nomes.remove("eduardo"));

//      nomes.remove(0);
//      nomes.add(121); ex: int na list. v1.4
//      for(Object nome: nomes){    v1.4

        nomes.addAll(nomes2);
        for(String nome: nomes){
            System.out.println(nome);
        }

        nomes.add("vrau");
        System.out.println("-------------");
        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.printf("Nome[%s]: " + nomes.get(i) + "\n", i+1);
            nomes.add("vrau");
        }

        System.out.println("Lista completa: " + nomes);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1); //autoboxin e unboxing > conversão entre tipo primitivo e wrapper.

    }
}
