package academy.devdojo.mainjava.javacore.Eblocosinicializacao.dominio;

// 1 - Primeiro é alocado um espaço em memória para o objeto criado
// 2 - Cada atributo de classe é criado e inicializado com valores Default ou o que for passado
// 3 - O bloco de inicialização será executado
// 4 - O construtor será executado

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
