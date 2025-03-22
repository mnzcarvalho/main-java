package academy.devdojo.mainjava.introducao;

//break
public class Aula06EstruturasDeRepetição03 {
    //imprimir os primeiros 25 números entre 0 e 50.

    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25){
                break; //o break quebra o laço, e não o if
            }
            System.out.println(i);
        }
    }
}
