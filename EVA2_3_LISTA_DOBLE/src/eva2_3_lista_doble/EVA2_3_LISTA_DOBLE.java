package eva2_3_lista_doble;

/**
 * @author José Sebastian López Ibarra
 * Friday October 07 2022
 */

public class EVA2_3_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Lista_Doble myList = new Lista_Doble();
        
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);        
        myList.printList();                
        
        System.out.println("\nConteo de nodos.");
        System.out.println(myList.sizeList());
        
        // Insertar un nodo al inicio de la lista
        try {
            myList.addAt(100, 0);
        } catch(Exception ex) {
            ex.printStackTrace();
        }        
        
        System.out.println("Agregar un nodo al inicio de la lista:");
        myList.printList();
                
        try {
            myList.deleteAt(0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Eliminar un nodo en la primera posición: ");
        myList.printList();
        
        // Eliminar un nodo en una posición específica
        try {
            myList.deleteAt(4);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Eliminar un nodo en una posición específica:");
        myList.printList();
        
        
        try {
            myList.deleteAt(1);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Eliminar un nodo en una posición específica:");
        myList.printList();
                
        // Insertar un nodo en una posición específica
        try {
            myList.addAt(70, 2);
        } catch(Exception ex) {
            ex.printStackTrace();
        }        
        System.out.println("Agregar un nodo en una posición específica:");
        myList.printList();
    }    
}