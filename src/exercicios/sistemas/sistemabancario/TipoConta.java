package academy.devdojo.mainjava.exercicios.sistemas.sistemabancario;

public enum TipoConta {
    CORRENTE("Conta Corrente", 0.01),
    POUPANCA("Conta Poupança", 0.05),
    SALARIO("Conta Salário", 0.0);

    private final String descricao;
    private final double taxa;

    TipoConta(String descricao, double taxa) {
        this.descricao = descricao;
        this.taxa = taxa;
    }

    public static TipoConta buscarPorDescricao(String descricao) {
        for (TipoConta tipo : values()) {
            if (tipo.descricao.equalsIgnoreCase(descricao)){
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo de conta não encontrado: " + descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public double getTaxa() {
        return taxa;
    }
}
