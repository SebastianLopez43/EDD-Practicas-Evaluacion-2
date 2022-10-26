package eva2_6_binary_tree;

/**
 * @author José Sebastian López Ibarra
 * Friday October 21 2022
 */

public class Binary_Tree {
    private Nodo root;
    
    public Binary_Tree() {
        this.root = null;
    }        
    
    // Método para el usuario
    public void add(int value) {
        if (root == null) {
           root = new Nodo(value);
        } else {
            recursiveAdd(value, root);
        }
    }
    
    // Método recursivo add
    // Requiere dos parámetros: valor y el nodo actual
    private void recursiveAdd(int value, Nodo actualNode) {
        /*
        Criterios a tomar en cuenta 
        
        - El nodo recibido sea null -> La lista está vacía
        - Decidir si el valor va a la derecha o a la izquierda        
        
        Verificar si el lado (nodo), está vacío
        */
        
        Nodo newNode = new Nodo(value);
        
        if (value < actualNode.getValue()) { // El valor va hacia la izquierda
            if (actualNode.getLeft() == null) {
                actualNode.setLeft(newNode);
            } else {
                recursiveAdd(value, actualNode.getLeft());
            }
        } else if (value > actualNode.getValue()) { // El valor va hacia la derecha
            if (actualNode.getRight() == null) {
                actualNode.setRight(newNode);
            } else {
                recursiveAdd(value, actualNode.getRight());
            }
        } else { // Si el valor es igual
            System.out.println("Elemento repetido.");
        }
    }
    
    /* 
    Imprimir los valores: In Order
    Izquierda - valor - derecha
    */
    
    // Método público
    public void inOrder() {
        recursiveInOrder(root);
        System.out.println("");
    }
    
    // Método privado recusivo
    private void recursiveInOrder(Nodo actualNode) {
        if (actualNode != null) {
            recursiveInOrder(actualNode.getLeft());
            System.out.print(actualNode.getValue() + " ");
            recursiveInOrder(actualNode.getRight());
        }
    }
}
