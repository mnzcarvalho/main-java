package academy.devdojo.mainjava.javacore.Hheranca.test;

import academy.devdojo.mainjava.javacore.Hheranca.domain.Funcionario;
//Sequencia de inicialização
//Quando se tem herança a SUPER-CLASSE sempre precisa ser inicializada primeiro

// 0 - Bloco de inicialização estático da superclasse é exucutado qnd a JVM  carregar a superclasse
// 1 - Bloco de inicialização estático da subclasse é executado qnd a JVM carregar a classe filha
// 2 - Alocado o espaço em memória para o objeto da superclasse
// 4 - Cada atributo da superclasse é inicializado com os valores padrões ou o que for passado
// 5 - Bloco de inicialização da superclasse é executado na ordem em que aparece
// 6 - O construtor da subclasse é executado
// 7 - Alocado o espaço em memória para o objeto da subclasse
// 8 - Cada atributo da subclasse é inicializado com os valores padrões ou o que for passado
// 9 - Bloco de inicialização da subclasse é executado na ordem em que aparece
// 10 - O construtor da superclasse é executado

public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Olá Mundo");
    }
}
