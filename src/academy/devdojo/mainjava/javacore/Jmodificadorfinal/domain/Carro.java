package academy.devdojo.mainjava.javacore.Jmodificadorfinal.domain;

//Constantes no java tem uma convenção própria: em UPPER CASE e separado por _ qnd preciso
//pode ser inicializada dando o valor diretamente, nos blocos de inicialização, ou no construtor.
public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; //CONVENÇÃO_DE_CODIGO

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
