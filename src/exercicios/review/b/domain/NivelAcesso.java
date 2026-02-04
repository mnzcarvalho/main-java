package exercicios.review.b.domain;

public enum NivelAcesso {
    VISITANTE ("Apenas leitura pública."),
    USUARIO ("Leitura e escrita própria."),
    MODERADOR ("Leitura, escrita própria e moderação de conteúdo."),
    ADMINISTRADOR ("Todas as permissões.");

    private final String descricao;

    private NivelAcesso(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean podeLer(){
        return true;
    }

    public boolean podeEscrever(){
        return this == USUARIO || this == MODERADOR || this == ADMINISTRADOR;
    }

    public boolean podeModerar(){
        return this == MODERADOR || this == ADMINISTRADOR;
    }

    public boolean podeAdministrar(){
        return this == ADMINISTRADOR;
    }
}
