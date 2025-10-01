package exercicios.estruturadedados.linkedlist.criandolinkedlist;

public class IteratorLinkedList<TIPO> {
    private Elemento<TIPO> elemento;

    public IteratorLinkedList(Elemento<TIPO> elemento) {
        this.elemento = elemento;
    }

    public boolean isTemProximo(){
        if (elemento.getProximo() == null){
            return false;
        } else {
            return true;
        }
    }

    public Elemento<TIPO> getProximo(){
        elemento = elemento.getProximo();
        return elemento.getProximo();
    }
}
