package eva2_1_lista_simple;

/**
 * @author José Sebastian López Ibarra
 * Wednesday September 28 2022
 */

public class Lista {    
    private Nodo  front; // Punto de partida de nuestra lista.
    private Nodo back; // Punto final de nuestra lista
    private int cont;
    
    // Constructor que inicializa una lista vacía.
    public Lista(){
        this.front = null; // No existen nodos en la lista.
        this.back = null;
        this.cont = 0; // No hay nodos en la lista.
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
        
    // Método que agrega un nodo al final de una lista.
    // Solución 1: O(N)
    public void add(int value) { // Recibo valor, creo un nodo y lo pongo en una lista.
        Nodo newNode = new Nodo(value); // Agregar valor a un nodo.
        
        // Verificar si hay nodo en la lista.
        if (front == null) { // No hay nodos en la lista.
            front = newNode; // Agregamos un nodo a la lista vacía.
            back = newNode; // front y back se conectan al nuevo nodo.
        }else{ // Si tenemos nodos en la lista.
            /*
            // Tenemos que movernos por cada nodo hasta
            // llegar al final de la lista (último nodo) .                       
            Nodo temp = front;
            
            // Mover a temp por cada nodo hasta llegar al final.
            while(temp.getNext() != null) {
                temp = temp.getNext(); // Final de la lista.
            }
            
            // Agregar un nuevo nodo al final de la lista.
            temp.setNext(newNode); */
                        
            back.setNext(newNode); // Cambiar direcciones de variables.
            back = newNode; // Dirección del nuevo nodo se asigna a back.                                   
        }
        cont++;
    }
    
    public int sizeList() {
        
        /*
        Cada vez que agreguemos o quitemos un nodo, debemos
        incrementar o decrementar.
        */
        
        /* 
        int cont = 0; // Contador
        Nodo temp = front;
            
        // Mover a temp por cada nodo hasta llegar al final
        while(temp != null) {
            cont++;
            temp = temp.getNext(); // Final de la lista
        } */
        return this.cont;
    }
    
    public void addAt(int valor, int pos) throws Exception {
        
        int valueNodes = sizeList();
        Nodo newNode = new Nodo(valor);
        
        /* 
        Debemos validar:
        - Insertar en una posición no válida
        - Posicones negativas
        - Posiciones mayores a la cantidad de elementos
        */
                
        if (pos < 0) { // Posiciones negativas
            throw new Exception("No se puede agregar un nodo en una posición negativa.");
        } else if (pos >= valueNodes) { // Posiciones mayores a la cantidad de elementos
            throw new Exception("La posición " + pos + " no es válida en la lista.");
        } else {
            if (pos == 0) { // Insertar un nodo al inicio de la lista                
                newNode.setNext(front);
                front = newNode;
            } else {
                Nodo temp = front;
                int cont = 0;
            
                // Mover a temp por cada nodo hasta llegar al nodo deseado
                while(cont < (pos - 1)) {                    
                    temp = temp.getNext();
                    cont++;
                }                                           
                // Conectar el nuevo nodo en la lista.
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
            }
            this.cont++;
        }        
    }
    
    public void clearList() {
        front = null;
        back = null;
        cont = 0;
    }
    
    public void deleteAt(int pos) throws Exception{
        
        int valueNodes = sizeList(), cont = 0;       
        Nodo newNode = new Nodo();
        Nodo temp = front;
        
        /* 
        Debemos validar:
        - Insertar en una posición no válida
        - Posicones negativas
        - Posiciones mayores a la cantidad de elementos
        */
                
        if (pos < 0) { // Posiciones negativas
            throw new Exception("No se puede agregar un nodo en una posición negativa.");
        } else if (pos >= valueNodes) { // Posiciones mayores a la cantidad de elementos
            throw new Exception("La posición " + pos + " no es válida en la lista.");
        } else {
            if (valueNodes == 1) {
                clearList();
            } else {
            /*
            Borrar el primer nodo
            Borrar el nodo intermedio
            Borrar el último nodo
            */
                if (pos == 0) {
                    front = front.getNext();
                } else {                    
                    // Mover a temp por cada nodo hasta llegar al nodo deseado
                    while(cont < (pos - 1)) {                    
                    temp = temp.getNext();
                    cont++;
                    }
                    // Legibilidad en el código
                    Nodo objNext = temp.getNext();
                    temp.setNext(objNext.getNext());
                                        
                    /*
                    "." Operador de resferenciación.
                    Llamada a función -> Valor que regresa
                    */
                    if (pos == (valueNodes - 1)) { // Cantidad de nodos menos el nodo que desconectamos
                        back = temp; // Reconectar a fin
                    }
                }
            }
            this.cont--;
        }        
    }
       
    public int getValueAt(int pos) throws Exception {
        
        int valueNodes = sizeList(), cont = 0, valor = 0;
        Nodo temp = front;
        
        if (pos < 0) { // Posiciones negativas
            throw new Exception("No se puede agregar un nodo en una posición negativa.");
        } else if (pos >= valueNodes) { // Posiciones mayores a la cantidad de elementos
            throw new Exception("La posición " + pos + " no es válida en la lista.");
        } else {
            // Mover a temp por cada nodo hasta llegar al nodo deseado
            while(cont < pos) {    
            temp = temp.getNext();
            cont++;
            }
            valor = temp.getValue();
            System.out.println("El valor en la posición " + pos + " es: " + valor);
        }
        return valor;
    }
}