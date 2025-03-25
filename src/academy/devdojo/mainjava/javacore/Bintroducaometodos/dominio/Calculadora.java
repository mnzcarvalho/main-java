package academy.devdojo.mainjava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 2);
    }

    //dentro do domínio se chama parâmetro, qnd chama vira argumento
    public void multiplicaDoisNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }
}
