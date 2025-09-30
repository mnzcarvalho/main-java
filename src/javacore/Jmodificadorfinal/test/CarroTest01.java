package academy.devdojo.mainjava.javacore.Jmodificadorfinal.test;

//Não é correto acessar variáveis estáticas atravez de variáveis de referências
//ex:
//  carro.VELOCIDADE_LIMITE : errado
//  Carro.VELOCIDADE_LIMITE : certo
import academy.devdojo.mainjava.javacore.Jmodificadorfinal.domain.Carro;
import academy.devdojo.mainjava.javacore.Jmodificadorfinal.domain.Comprador;
import academy.devdojo.mainjava.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Eduardo");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("m1");
        ferrari.impprime();


    }
}
