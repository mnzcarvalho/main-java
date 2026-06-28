package javacore.Zgenerics.test;

import javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa marota"));
        System.out.println(barcoList);

    }
//    private static <T> void criarArrayComUmObjeto(T t){
//        List<T> list = List.of(t);
//        System.out.println(list);
//    }

//o <T> vem depois do modificador de acesso e antes do tipo de retorno
    // pode adicionar <T extends Comparable>
    private static <T> List<T> criarArrayComUmObjeto(T t) {
        return List.of(t);
    }
}
