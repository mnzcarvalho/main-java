package academy.devdojo.mainjava.javacore.Npolimorfismo.servico;

import academy.devdojo.mainjava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
