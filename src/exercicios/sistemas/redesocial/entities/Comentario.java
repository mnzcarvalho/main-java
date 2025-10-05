package exercicios.sistemas.redesocial.entities;

public class Comentario extends Conteudo{
    private Post postPai;

    public Comentario(Usuario autor, String text, Post postPai) {
        super(autor, text);
        this.postPai = postPai;
    }

    @Override
    protected String gerarId() {
        return "COMMENT_" + System.currentTimeMillis();
    }

    @Override
    public void exibirConteudo() {
        System.out.println("💬 " + autor.getNome() + ": " + text);
        System.out.println("   👍 " + curtidas + " curtidas");
    }
}
