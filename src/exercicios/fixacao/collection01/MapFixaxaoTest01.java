package exercicios.fixacao.collection01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MapFixaxaoTest01 {
    public static void main(String[] args) {
    Consumidor consumidor1 = new Consumidor("Eduardo");
    Consumidor consumidor2 = new Consumidor("Menezes");
        Manga manga1 = new Manga(1L, "exercício 1");
        Manga manga2 = new Manga(2L, "exercício 2");
        Manga manga3 = new Manga(3L, "exercício 3");
        Manga manga4 = new Manga(1L, "exercício 1"); // Igual manga1

        List<Manga> mangaListConsumidor1 = List.of(manga1, manga2, manga3);
        List<Manga> mangaListConsumidor2 = List.of(manga1, manga2, manga4);

        Map<Consumidor, List<Manga>> consumidorListMap = new HashMap<>();
        consumidorListMap.put(consumidor1, mangaListConsumidor1);
        consumidorListMap.put(consumidor2, mangaListConsumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorListMap.entrySet()) {
            System.out.println(entry.getKey());
            for (Manga manga : entry.getValue()){
                System.out.println(manga.getNome());
            }
        }
    }
}

class Consumidor {
    private String nome;

    public Consumidor(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

class Manga {
    private Long id;
    private String nome;

    public Manga(Long id, String nome) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int compareTo(Manga outroManga) {
        return this.nome.compareTo(outroManga.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
