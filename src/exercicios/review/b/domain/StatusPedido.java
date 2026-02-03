package exercicios.review.b.domain;

public enum StatusPedido {
    PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE, CANCELADO;

    public String getDescricao() {
        switch (this) {
            case PENDENTE: {
                return "Pedido aguardando processamento";
            }
            case PROCESSANDO: {
                return "Pedido em processamento";
            }
            case ENVIADO: {
                return "Pedido enviado para entrega";
            }
            case ENTREGUE: {
                return "Pedido entregue ao cliente";
            }
            case CANCELADO: {
                return "O pedido foi cancelado.";
            }
            default:
                return "Status desconhecido";
        }
    }

    public boolean podeCancelar() {
        // Retorna true apenas para PENDENTE e PROCESSANDO
        return this == PENDENTE || this == PROCESSANDO;
    }
}
