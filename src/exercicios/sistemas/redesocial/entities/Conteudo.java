package exercicios.sistemas.redesocial.entities;

import exercicios.sistemas.redesocial.enums.PrivacidadePost;

import java.time.LocalDateTime;

public abstract class Conteudo{
    protected String id;
    protected String text;
    protected LocalDateTime dataCriacao;
    protected Usuario autor;
    protected PrivacidadePost privacidade;
    protected int curtidas;

    {
        this.dataCriacao = LocalDateTime.now();
        this.curtidas = 0;
        this.privacidade = PrivacidadePost.PUBLICO;
    }

    public Conteudo(Usuario autor, String text) {
        this.autor = autor;
        this.text = text;
        this.id = gerarId();
    }

    protected abstract String gerarId();
    public abstract void exibirConteudo();

    public void curtir(){
        this.curtidas++;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public Usuario getAutor() {
        return autor;
    }

    public PrivacidadePost getPrivacidade() {
        return privacidade;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPrivacidade(PrivacidadePost privacidade) {
        this.privacidade = privacidade;
    }
}
