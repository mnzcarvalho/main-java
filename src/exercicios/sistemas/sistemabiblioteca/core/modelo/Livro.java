package exercicios.sistemas.sistemabiblioteca.core.modelo;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int ano;
    private boolean isDisponivel = true;

    public Livro(String titulo, String autor, String isbn, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
    }

    public void emprestar() throws Exception {
        if (!isDisponivel){
            throw new Exception("Livro indisponível para emprestimo: " + this.titulo);
        }
        isDisponivel = false;
    }

    public void devolver(){
        isDisponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return isDisponivel;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + this.titulo + '\'' +
                ", autor='" + this.autor + '\'' +
                ", ano=" + this.ano +
                ", Disponivel=" + this.isDisponivel +
                '}';
    }
}
