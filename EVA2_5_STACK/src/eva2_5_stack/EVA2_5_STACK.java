package eva2_5_stack;

/**
 * @author José Sebastian López Ibarra
 * Wednesday October 19  2022
 */

public class EVA2_5_STACK {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Stack myStack = new Stack();
        
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);         
        System.out.println("Lista: ");
        myStack.printList();
        
        System.out.println("\nCima de la pila: " + myStack.peek());
        myStack.printList();
        
        try {
            System.out.println("Cima de la pila: " + myStack.pop());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        myStack.printList();
    }    
}