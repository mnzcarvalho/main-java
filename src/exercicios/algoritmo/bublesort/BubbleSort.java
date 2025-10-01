package exercicios.algoritmo.bublesort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] v = {5, 2, 4, 3, 0, 9, 7, 8, 1, 6};
        BubbleSort bs = new BubbleSort();
        for (int num : v) {
            System.out.print(num + " ");
        }
        System.out.println("\n===Ordenando Vetor===");
        bs.ordenar(v);

        for (int num : v) {
            System.out.print(num + " ");
        }

    }

    public void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            boolean isControle = true;
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    isControle = false;
                }
            }
            if (isControle) {
                break;
            }
        }
    }


}
