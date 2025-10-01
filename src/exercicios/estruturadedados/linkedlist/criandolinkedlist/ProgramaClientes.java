package exercicios.estruturadedados.linkedlist.criandolinkedlist;

public class ProgramaClientes {
    public static void main(String[] args) {
        ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
        clientes.adicionar(new Cliente("123", "yooo"));
        clientes.adicionar(new Cliente("124", "yooo2"));
        clientes.adicionar(new Cliente("125", "yooo10"));

        System.out.println("Tamanho: " + clientes.getTamanho());
        for (int i = 0; i < clientes.getTamanho(); i++) {
            System.out.println("Nome do Cliente: " + clientes.get(i).getValor());
        }
    }
}
