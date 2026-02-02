package exercicios.review.a.domain;

public class Material {

    private String codigo;
    private String titulo;
    private int anoPublicacao;


    static {
        System.out.println("Sistema Biblioteca - Carregando materiais...");
    }

    public Material() {
        Biblioteca.incrementarTotalMateriais();
    }

    public Material(String codigo, String titulo, int anoPublicacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;

    }

    public String exibirDetalhes(){
        return  "Código: " + this.codigo +
                ", Título: " + this.titulo +
                ", Ano: " + this.anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
