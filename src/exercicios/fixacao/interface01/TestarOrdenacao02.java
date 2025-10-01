package exercicios.fixacao.interface01;

public class TestarOrdenacao02 {
    public static void main(String[] args) {
        Animal[] animais = new Animal[4];
        animais[0] = new Animal("Cobra", "Coral");
        animais[1] = new Animal("Cobra", "Jibóia");
        animais[2] = new Animal("Cobra", "Pyhton");
        animais[3] = new Animal("Cobra", "Cascavél");

        Ordenar o = new Ordenar();
        o.ordenar(animais);

        for (int i = 0; i < animais.length; i++) {
            System.out.println("Espécie: " + animais[i].getEspecie());
            System.out.println("Raça: " + animais[i].getRaca());
            System.out.println("\n-------\n");
        }
    }
}
