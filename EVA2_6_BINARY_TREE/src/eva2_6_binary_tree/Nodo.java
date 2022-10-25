package eva2_6_binary_tree;

/**
 * @author José Sebastian López Ibarra
 * Wednesday October 19 2022
 */

public class Nodo {
    private int value;    
    private Nodo right; 
    private Nodo left;
     
    public Nodo() {
        this.right = null; // El nodo se crea vacío (último nodo de la lista) debido a null
        this.left = null;
    }

    public Nodo(int value) {
        this.value = value; // Constructor que guarda los valores
        this.right = null; 
        this.left = null;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getRight() {
        return right;
    }
    public void setRight(Nodo next) {
        this.right = next;
    }      

    public Nodo getLeft() {
        return left;
    }
    public void setLeft(Nodo previous) {
        this.left = previous;
    }
}
