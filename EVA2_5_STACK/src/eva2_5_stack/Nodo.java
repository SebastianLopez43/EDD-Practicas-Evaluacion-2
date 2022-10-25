package eva2_5_stack;

/**
 * @author José Sebastian López Ibarra
 * Wednesday October 19 2022
 */

public class Nodo {
    private int value;    
    private Nodo next; // Variable de tipo nodo para guardar la dirección de un nodo;
    private Nodo previous;
     
    public Nodo() {
        this.next = null; // El nodo se crea vacío (último nodo de la lista) debido a null
        this.previous = null;
    }

    public Nodo(int value) {
        this.value = value; // Constructor que guarda los valores
        this.next = null; 
        this.previous = null;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }      

    public Nodo getPrevious() {
        return previous;
    }
    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }
}
