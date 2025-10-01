package exercicios.fixacao.interface01;

public class Livro implements Comparavel{
    private String autor;
    private String titulo;

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int comparar(Object o) {
        int comparacao =  0;

        if (o instanceof Livro){
            Livro livro = (Livro) o;
            comparacao = this.getAutor().compareTo(livro.getAutor());

            if (comparacao == 0){
                comparacao = this.getTitulo().compareTo(livro.getTitulo());
            }
        }
        return comparacao;
    }
}
