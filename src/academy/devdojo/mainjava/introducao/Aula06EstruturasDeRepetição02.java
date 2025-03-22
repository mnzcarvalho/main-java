package academy.devdojo.mainjava.introducao;

//imprima todos os pares até 1,000,000.
public class Aula06EstruturasDeRepetição02 {
    public static void main(String[] args) {
        //int i = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }

        }
    }
}
