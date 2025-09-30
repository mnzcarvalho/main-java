package academy.devdojo.mainjava.exercicios.fixacao.interface01;

public class Ordenar {
    public void ordenar(Comparavel[] objetos){
        for (int i = 0; i < objetos.length; i++) {
            for (int j = i + 1; j < objetos.length; j++) {
                if (objetos[i].comparar(objetos[j])  > 0){
                    Comparavel temp = objetos[i];
                    objetos[i] = objetos[j];
                    objetos[j] = temp;
                }
            }
        }
    }
}
