package introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 19;
        boolean maiorIdade = idade >= 18;
        if (maiorIdade){
            System.out.println("Maior de idade.");
        }
        if (!maiorIdade){
            System.out.println("Você é menor de idade.");
        }else{
            System.out.println("Maior de idade 2.");
        }

    }
}
