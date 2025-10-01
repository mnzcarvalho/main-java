package javacore.Minterfaces.domain;

//por padrão, no JAVA, qnd se cria um metodo eles são públicos e abstratos (na interface)
// private -> defautl -> protected -> public
//todos os atributos em uma interface são constantes
//Metodos default não precisam ser implementados obrigatoriamente


public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;

    public abstract void load();
    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
