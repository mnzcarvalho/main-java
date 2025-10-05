package exercicios.sistemas.redesocial.services;

import exercicios.sistemas.redesocial.entities.Usuario;
import exercicios.sistemas.redesocial.exceptions.UsuarioNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorUsuarios {
    private static int totalUsuarios = 0;
    private static List<Usuario> usuarios = new ArrayList<>();

    static {
        System.out.println("Rede Social iniciando!");
    }

    public static int getTotalUsuarios() {
        return totalUsuarios;
    }

    public static void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        totalUsuarios++;
        System.out.println("Usuário: " + usuario.getNome() + " cadastrado!");
    }

    public static Usuario buscarUsuario (String id) throws UsuarioNaoEncontradoException{
        return usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new UsuarioNaoEncontradoException(id));
    }

    public static List<Usuario> listarUsuarios(){
        return new ArrayList<>(usuarios);
    }

}
