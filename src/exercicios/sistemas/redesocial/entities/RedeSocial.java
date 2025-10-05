package exercicios.sistemas.redesocial.entities;

import java.util.ArrayList;
import java.util.List;

public class RedeSocial {
    private String nome;
    private List<Usuario> usuarios;
    private List<Post> posts;
    private List<Amizade> amizades;

    public RedeSocial(String nome) {
        this.nome = nome;
        this.usuarios = new ArrayList<>();
        this.posts = new ArrayList<>();
        this.amizades = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    public void adicionarPost(Post post){
        this.posts.add(post);
    }

    public void adicionarAmizade(Amizade amizade){
        this.amizades.add(amizade);
    }

    public String getNome() {
        return nome;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<Amizade> getAmizades() {
        return amizades;
    }
}
