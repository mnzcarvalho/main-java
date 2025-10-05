package exercicios.sistemas.redesocial;

import exercicios.sistemas.redesocial.entities.*;
import exercicios.sistemas.redesocial.enums.TipoUsuario;
import exercicios.sistemas.redesocial.services.GerenciadorUsuarios;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Usuario usuario1 = new Usuario("Jao", "jao@gmail.com");
            Usuario usuario2 = new Usuario("Sofia", "mariana222@gmail.com");
            usuario2.setTipo(TipoUsuario.USUARIO_VERIFICADO);

            GerenciadorUsuarios.adicionarUsuario(usuario1);
            GerenciadorUsuarios.adicionarUsuario(usuario2);

            Post post1 = new Post(usuario1, "Meu primeiro post!", "Xablauu");
            post1.adicionarHashtag("#programming");

            Post post2 = new Post(usuario2, "Codar codar codarrrr...", "CODAR");
            post2.adicionarHashtag("#codar");
            post2.adicionarHashtag("#java");

            post1.curtir();
            post1.curtir();
            post1.curtir();

            post2.curtir();
            post2.curtir();
            post2.curtir();
            post2.curtir();

            Comentario comentario = new Comentario(usuario2, "Cuyda q é mey dya!", post1);
            comentario.curtir();

            // Polimorfismo - tratar diferentes tipos de conteúdo igualmente
            List<Conteudo> conteudos = List.of(post1, post2, comentario);

            System.out.println("= = =  FEED REDE SOCIAL  = = =");
            for (Conteudo conteudo : conteudos) {
                conteudo.exibirConteudo();
                System.out.println("--------");
            }

            Amizade amizade = new Amizade(usuario1, usuario2);
            amizade.aceitar();

            System.out.println("Total usuários: " + GerenciadorUsuarios.getTotalUsuarios());
        } catch (Exception e){
            System.err.println("Erro inesperado: " );
        }
    }
}