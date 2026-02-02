package exercicios.review.a.domain;

public class Livro extends Material {
    private int numeroPaginas;

    public Livro(String codigo, String titulo, int anoPublicacao, int numeroPaginas) {
        super(codigo, titulo, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes()
                + ", Páginas: " + numeroPaginas;
    }

    //Sobrescrita != Sobrecarga
    //Sobrecarga significa criar métodos com o mesmo nome mas parâmetros diferentes
    //Sobrescrita (@Override) significa alterar a implementação de um método herdado

    public String exibirDetalhes(boolean resumido){
        if (resumido){
            return "Título: " + this.getTitulo() +
                    ", Ano: " + this.getAnoPublicacao();
        } else {
            return this.exibirDetalhes();
        }
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }


}
