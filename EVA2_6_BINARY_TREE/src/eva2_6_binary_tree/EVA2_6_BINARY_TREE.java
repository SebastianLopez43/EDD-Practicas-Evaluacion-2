package eva2_6_binary_tree;

/**
 * @aUthor José Sebastian López Ibarra
 * Friday October 21 2022
 */

public class EVA2_6_BINARY_TREE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Binary_Tree binTree = new Binary_Tree();
        
        binTree.add(13);
        binTree.add(10);
        binTree.add(18);
        binTree.add(2);
        binTree.add(11);
        binTree.add(17);
        binTree.add(20);
        binTree.add(16);                
        binTree.add(16);
        
        // Imprimir el árbol In Order
        binTree.inOrder();
    }    
}
