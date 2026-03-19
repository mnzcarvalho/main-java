package javacore.Ycolecoes.test;

import javacore.Ycolecoes.domain.Smartphone;

//O valor da referencia que está sendo comparado
// O equals compara o valor da String. E tbm tem o equals Object que compara objetos.
// equals object compara o valor em memória, então variáveis de referências diferentes irão dar "false"
public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone");
        Smartphone s3 = s1;

        System.out.println(s1.equals(s2));  //false
        System.out.println(s1.equals(s3));  //true
    }
}
