package exercicios.review.a.domain;

public class Tese extends Material {
    private final String autor;

    public Tese(String codigo, String titulo, int anoPublicacao, String autor) {
        super(codigo, titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes()
                + ", Autor: " + this.autor;
    }

    public String getAutor() {
        return autor;
    }
}
