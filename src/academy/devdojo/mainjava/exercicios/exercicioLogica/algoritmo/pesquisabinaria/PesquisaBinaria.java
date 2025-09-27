package academy.devdojo.mainjava.exercicios.exercicioLogica.algoritmo.pesquisabinaria;

//Algoritmo de Busca - Pesquisa Binária

public class PesquisaBinaria {
    public static void main(String[] args) {

        int [] array = {1, 5, 8, 10, 12, 15, 20};

        int numeroProcurado = 8;

        int posicao = buscaBinaria(array, numeroProcurado);

        System.out.println("O número procurado está na posição: " + posicao);

    }

    private static int buscaBinaria(int[] array, int numeroProcurado) {

        int inicio = 0;
        int fim = array.length -1;
        while (inicio <= fim){

            int meio = (inicio + fim) / 2;

            if (array[meio] == numeroProcurado){
                return meio;
            } else if (array[meio] >= numeroProcurado) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }

        }
        return  -1;
    }
}
