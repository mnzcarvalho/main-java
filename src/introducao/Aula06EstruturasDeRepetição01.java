package introducao;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        // while, do while, for
        //++count
        int numero = 0;
        while (numero < 10) {
            System.out.println(++numero);
            //numero += 1;
        }
        numero = 0;
        do {
            System.out.println("dentro do do-while " + ++numero);
        } while (numero < 10);

        for (int i = 0; i <= 10; i++) {
            System.out.println("For "+i);
        }
    }
}
