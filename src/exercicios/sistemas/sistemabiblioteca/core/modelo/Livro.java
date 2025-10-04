package exercicios.sistemas.sistemabiblioteca.core.modelo;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int ano;
    private boolean isDisponivel = true;
    private Categoria categoria;

    public Livro(String titulo, String autor, String isbn, int ano, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
        this.categoria = categoria;
    }

    public void emprestar() throws Exception {
        if (!isDisponivel){
            throw new Exception("Livro indisponível para emprestimo: " + this.titulo);
        }
        isDisponivel = false;
    }

    public Categoria getCategoria() {
        return categoria;
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
        return "Livro:" +
                " " + this.titulo + '\'' +
                ", autor: '" + this.autor + '\'' +
                ", ano: " + this.ano +
                ", Categoria: " + this.categoria +
                ", Disponivel: " + this.isDisponivel +
                '}';
    }
}
