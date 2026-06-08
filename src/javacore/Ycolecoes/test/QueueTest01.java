package javacore.Ycolecoes.test;

import javacore.Ycolecoes.domain.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

//First in, first out
public class QueueTest01 {
    public static void main(String[] args) {

        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }

        System.out.println(fila);
    }
}
