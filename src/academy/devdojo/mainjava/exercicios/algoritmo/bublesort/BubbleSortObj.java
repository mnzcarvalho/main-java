package academy.devdojo.mainjava.exercicios.algoritmo.bublesort;
//Ordenação de Vetor de Objetos
public class BubbleSortObj {
    public static void main(String[] args) {
        Animal bidu = new Animal("Cachorro", "Bidu");
        Animal fred = new Animal("Peixe", "Fred");
        Animal rex = new Animal("Cachorro", "Rex");
        Animal akamaru = new Animal("Cachorro", "Akamaru");
        Animal mingau = new Animal("Gato", "Mingau");

        Animal[] animais = new Animal[] {bidu, fred, rex, akamaru, mingau};
        System.out.println("Lista sem ordem");
        for (Animal animal : animais) {
            System.out.print("Especie: " + animal.getEspecie());
            System.out.print(", nome: " + animal.getNome());
            System.out.print(" \n----------\n");
        }


        System.out.println("\nOrdenando Animais por Nome\n");
        BubbleSortObj nomeAnimal = new BubbleSortObj();
        nomeAnimal.ordenarAnimaisPorNome(animais);
        for (Animal animal : animais) {
            System.out.println("Especie: " + animal.getEspecie());
            System.out.println("Nome: " + animal.getNome());
            System.out.println("----------");
        }
    }

    public void ordenarAnimaisPorNome(Animal[] animais){
        for (int i = 0; i < animais.length - 1; i++) {
            boolean isControle = true;
            for (int j = 0; j < animais.length - 1; j++) {
                if (animais[j].getNome().compareToIgnoreCase(animais[j + 1].getNome()) > 0) {
                    Animal aux = animais[j];
                    animais[j] = animais[j + 1];
                    animais[j + 1] = aux;
                    isControle = false;
                }
            }
            if (isControle){
                break;
            }
        }
    }
}
