package eva2_1_lista_simple;

/**
 * @author José Sebastian López Ibarra
 * Wednesday September 28 2022
 */

public class Nodo {
    
    private int value;    
    private Nodo next; // Variable de tipo nodo para guardar la dirección de un nodo;
     
    public Nodo() {
        this.next = null; // El nodo se crea vacío (último nodo de la lista) debido a null
    }

    public Nodo(int value) {
        this.value = value; // Constructor que guarda los valores
        this.next = null; 
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
}