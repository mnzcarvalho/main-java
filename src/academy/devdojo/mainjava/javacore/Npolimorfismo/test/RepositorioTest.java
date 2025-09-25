package academy.devdojo.mainjava.javacore.Npolimorfismo.test;

import academy.devdojo.mainjava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.mainjava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.mainjava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        //mais genérico >> mais específico
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
