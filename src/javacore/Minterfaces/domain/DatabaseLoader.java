package academy.devdojo.mainjava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Fazendo checagem de permissão no banco de dados");

    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
