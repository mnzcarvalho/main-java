package javacore.Bintroducaometodos.dominio;

//QUANDO SE PASSA OBJETOS COMO ARGUMENTOS ESTÁ SE PASSANDO A REFERÊNCIA A ONDE ELE ESTÁ GUARDADO
public class ImpressoraEstudante {
    public void imprime(Estudante estudante){

        System.out.println("Nome: "+estudante.nome);
        System.out.println("Idade: "+estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
        System.out.println("------------------------------------------------");
    }
}
