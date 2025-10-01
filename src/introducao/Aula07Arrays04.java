package introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        int[] numeros2 = {1, 2, 3, 4, 5};
//        for (int i = 0; i < numeros2.length; i++) {
//            System.out.println(numeros2[i]);
//        }
        for(int num:numeros2){                        //Foreach vai percorrer todas as posições do array
            System.out.println(num);
        }
    }
}
