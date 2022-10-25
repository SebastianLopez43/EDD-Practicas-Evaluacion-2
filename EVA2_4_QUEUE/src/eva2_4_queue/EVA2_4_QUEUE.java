package eva2_4_queue;

/**
 * @author José Sebastian López Ibarra
 * Wednesday October 19 2022
 */

public class EVA2_4_QUEUE {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        
        //First Int, First Out
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        myQueue.add(50);
        
        System.out.println("Primer valor en llegar: " + myQueue.peek());
        myQueue.printList();
        
        try {
        System.out.println("primer valor es: " + myQueue.poll());
        myQueue.printList();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }    
}