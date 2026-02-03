package exercicios.review.b.test;

import exercicios.review.b.domain.StatusPedido;

public class Teste01{
    public static void main(String[] args) {
        StatusPedido status = StatusPedido.PENDENTE;

        System.out.println("Status: " + status);
        System.out.println("Descrição: " + status.getDescricao());
        System.out.println("Pode cancelar? " + status.podeCancelar());

        status = StatusPedido.ENTREGUE;
        System.out.println("\nStatus: " + status);
        System.out.println("Descrição: " + status.getDescricao());
        System.out.println("Pode cancelar? " + status.podeCancelar());
    }
}