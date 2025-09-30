package academy.devdojo.mainjava.javacore.Isobrescrita.domain;

public class Anime extends Object{
    private String nome;

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }
    public Anime(String nome) { //nome.toString()
        this.nome = nome;       //getClass().getName() + '@' + Integer.toHexString(hashCode())
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
