package academy.devdojo.mainjava.introducao;

// Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
// A condição é que o valor da parcela tem que ser >= 1000.
public class Aula06EstruturasDeRepetição04 {
    public static void main(String[] args) {
        float valorTotal = 30000;
        for (float parcela = 1; parcela <= valorTotal; parcela++) {
            float valorParcela = valorTotal / parcela;
            System.out.println("Primeira parcela: "+parcela+" x R$"+valorParcela);
            if (valorParcela == 1000){
                break;
            }
        }
    }
}

