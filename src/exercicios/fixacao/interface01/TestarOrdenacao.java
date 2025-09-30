package academy.devdojo.mainjava.exercicios.fixacao.interface01;

public class TestarOrdenacao {
    public static void main(String[] args) {
        Livro[] livros = new Livro[4];
        livros[0] = new Livro("Sakurai", "Almoçando com Java");
        livros[1] = new Livro("Cristiano", "Classes Java em fila indiana");
        livros[2] = new Livro("Sakurai", "Java em todo lugar");
        livros[3] = new Livro("Cristiano", "Viajando no Java");

        Ordenar o = new Ordenar();
        o.ordenar(livros);

        for (int i = 0; i < livros.length; i++) {
            System.out.println("Autor: " + livros[i].getAutor());
            System.out.println("Título: " + livros[i].getTitulo());
            System.out.println("\n-------------\n");
        }
    }
}
