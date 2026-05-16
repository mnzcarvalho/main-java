package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] listToArray = numeros.toArray(new Integer[0]); //o zero é para que o java descubra o tamanho do array
        System.out.println(Arrays.toString(listToArray));


        System.out.println("===========================================================================");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray); //Cria um link com o array original.
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("===========================================================================");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(19);
        System.out.println(numerosList);

        //asList com os parâmetros, ao invez de list.add
        List<Integer> integerList = Arrays.asList(0, 1, 2, 3);
        List<String> stringList = Arrays.asList("1", "2");

    }
}
