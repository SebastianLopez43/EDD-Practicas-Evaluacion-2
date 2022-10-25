package eva2_5_stack;

/**
 * @author José Sebastian López Ibarra
 * Wednesday October 19 2022
 */

public class Stack {
    private Nodo front;
    private Nodo back;
    private int cont;
    
        public Stack() {
        this.front = null; // No hay nodos en la lista.
        this.back = null;
        this.cont = 0;
    }
    
    // Método que determina si una lista está vacía.
    public boolean isEmpty() {
        if (front == null) { 
            return true; // La lista está vacía.
        } else {
            return false; // La lista no está vacía.
        }
    }
    
    // Método que imprime una lista
    public void printList() {
        if (isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            Nodo temp = front;
            // Mover a temp por cada nodo hasta llegar al final.
            while(temp != null) {
                System.out.print("[" + temp.getValue() + "] ");
                temp = temp.getNext(); // Final de la lista
            }
        }
        System.out.println("");
    }
    
    // Método que determina el número de nodos de una lista.
    public int sizeList() {
        return this.cont;
    }
    
    // Método que borra una lista.
    public void clearList() {
        front = null;
        back = null;
        cont = 0;
    }
    
    // Método que agrega un nodo al final de una lista.
    public void add(int value) {
        Nodo newNode = new Nodo(value);
        
        if (front == null) {
            front = newNode;
            back = newNode;
        }else{
            back.setNext(newNode); 
            newNode.setPrevious(back);
            back = newNode;                       
        }        
        cont++;
    }
    
    public void push(int value) {
        add(value);
    }
    
    //lee pero no borra el primer nodo de la lista
    public Integer peek (){
        if (isEmpty()) {
            return null;
        }else{
            return back.getValue();
        }
    }
    
    //lee y elimina el primer nodo de la lista
    public Integer pop () throws Exception{
        if (isEmpty()) {
            return null;
        }else{
            int value = back.getValue();            
            deleteAt(sizeList() - 1); // Borrar en la cima de la lista
            return value;
        }
    }
    
    public void addAt(int value, int pos) throws Exception {
        
        int valueNodes = sizeList();
        Nodo newNode = new Nodo(value);
        
        if (pos < 0) { // Posiciones negativas
            throw new Exception("No se puede agregar un nodo en una posición negativa.");
        } else if (pos >= valueNodes) { // Posiciones mayores a la cantidad de elementos
            throw new Exception("La posición " + pos + " no es válida en la lista.");
        } else {
            if (pos == 0) { // Insertar un nodo al inicio de la lista
                newNode.setNext(front); // Conectamos el nuevo nodo al primero de la lista
                front.setPrevious(newNode); // Conectamos el que era el primer nodo al nuevo nodo                
                front = newNode;
            } else {
                Nodo temp = front;
                int cont = 0;
            
                // Mover a temp por cada nodo hasta llegar al nodo deseado
                while(cont < pos) {                    
                    temp = temp.getNext();
                    cont++;
                }
                // Conectar el nuevo nodo en la lista.                
                newNode.setNext(temp);                
                newNode.setPrevious(temp.getPrevious());                                
                temp.getPrevious().setNext(newNode);
                temp.setPrevious(newNode);
            }
            this.cont++;
        }        
        System.out.println("");
    }
    
    public void deleteAt(int pos) throws Exception{
        
        int valueNodes = sizeList(), cont = 0;       
        Nodo temp = front;
    
        if (pos < 0) { // Posiciones negativas
            throw new Exception("No se puede agregar un nodo en una posición negativa.");
        } else if (pos >= valueNodes) { // Posiciones mayores a la cantidad de elementos
            throw new Exception("La posición " + pos + " no es válida en la lista.");
        } else {
            if (valueNodes == 1) {
                clearList();
            } else {
                if (pos == 0) {
                    front = front.getNext();
                } else {                    
                    // Mover a temp por cada nodo hasta llegar al nodo deseado
                    while(cont < (pos - 1)) {                    
                        temp = temp.getNext();
                        cont++;
                    }                                     
                    temp.setNext(temp.getNext().getNext());
                    temp.setPrevious(temp.getPrevious());
                    if (pos == (valueNodes - 1)) { // Cantidad de nodos menos el nodo que desconectamos
                        back = temp; // Reconectar a fin
                    } 
                }
            }
            this.cont--;
        }  
        System.out.println("");
    }
}
