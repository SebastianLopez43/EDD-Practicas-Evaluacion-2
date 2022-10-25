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
       recursiveAdd(value, root);
    }
    
    // Método recursivo de add
    // Requiere dos parámetros: valor y el nodo actual
    private void recursiveAdd(int value, Nodo actualNode) {
        if (actualNode.getLeft() == null) {
            
        } else if (actualNode.getRight() == null){
            
        }
    }
    
}