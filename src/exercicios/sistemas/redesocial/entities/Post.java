package exercicios.sistemas.redesocial.entities;

import java.util.ArrayList;
import java.util.List;

public class Post  extends Conteudo{
    private String titulo;
    private List<String> hashtags;

    public Post(Usuario autor, String text, String titulo) {
        super(autor, text);
        this.titulo = titulo;
        this.hashtags = new ArrayList<>();
    }



    @Override
    protected String gerarId() {
        return "POST_" + System.currentTimeMillis();
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Título: " + titulo);
        System.out.println("Por: " + autor.getNome());
        System.out.println("Texto: \n" + text);
        System.out.println("Likes: " + curtidas);
        if (!hashtags.isEmpty()){
            System.out.println(" " + String.join(" ", hashtags));
        }
    }

    public void adicionarHashtag(String hashtag){
        this.hashtags.add(hashtag);
    }

    public void adicionarHashtags(String... hashtags){
        for (String hashtag : hashtags) {
            this.hashtags.add(hashtag);
        }

    }
}
