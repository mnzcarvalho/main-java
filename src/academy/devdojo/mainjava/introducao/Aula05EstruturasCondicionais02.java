package academy.devdojo.mainjava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 18;
        if(idade < 15){
            System.out.println("Categoria infantil.");
        } else if (idade < 18) {
            System.out.println("Categoria juvenil.");
        }else {
            System.out.println("Categoria Adulto.");
        }
    }
}
