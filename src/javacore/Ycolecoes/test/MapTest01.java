package javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

// Não pode ter chaves duplicadas. Valores podem se repetir.
// O set n deixa inserir valores duplicados, no hash a ultima chave adicionada sobrescreve a anterior.
public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // "Hash" -> vai ordenar as chaves baseado no hash. Podendo mudar conforme se insere elementos.
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc2", "você");
        System.out.println(map);


        System.out.println("=======================");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("=======================");
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("=======================");
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}