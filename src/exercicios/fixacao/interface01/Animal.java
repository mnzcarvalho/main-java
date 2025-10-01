package exercicios.fixacao.interface01;

public class Animal implements Comparavel{
    private String especie;
    private String raca;

    public Animal(String especie, String raca) {
        this.especie = especie;
        this.raca = raca;
    }

    @Override
    public int comparar(Object o) {
        int comparacao = 0;

        if (o instanceof Animal){
            Animal animal = (Animal) o;
            comparacao = this.getEspecie().compareTo(animal.getEspecie());

            if (comparacao == 0){
                comparacao = this.getRaca().compareTo(animal.getRaca());
            }
        }
        return comparacao;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
