package eva2_1_lista_simple;

/**
 * @author José Sebastian López Ibarra 
 * Wednesday September 28 2022
 */

/*
 Usar dos clase:
 - Clase nodo.
 Tipo de dato, referencia.
 - Clase lista
 Agregar un nuevo nodo.
 Punto de partida en una lista - Nodo Front
 Asignar la dirección del nodo a Front.
 Front.next = Nuevo nodo
 Front.next.next.next.....
 Agregar un nodo al final de la lista.
 - Tenemos que movernos al final de la lista -> Variable temporal (Tipo nodo)
 */

public class EVA2_1_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception{

        // Creamos nueva lista (Listas vacías).
        Lista myList1 = new Lista();    
        Lista myList2 = new Lista();
        
        System.out.println("Primera lista:");
        myList1.printList();
        System.out.println("Segunda lista:");
        myList2.printList();
        
        // Agregramos elementos a la lista.
        myList1.add(10); // 0
        myList1.add(20); // 1
        myList1.add(30); // 2 Temp debe quedar en esta posición
        myList1.add(40); // 3 <--- Insertar un nuevo nodo
        myList1.add(50); // 4
        myList1.add(60); // 5      
        
        myList2.add(1);
        myList2.add(2);
        myList2.add(3);
        myList2.add(4);
        myList2.add(5);
        myList2.add(6);
        myList2.add(7);
        myList2.add(8);
        myList2.add(9);
        myList2.add(10);

        // Imprimir lista.
        System.out.println("Listas con nodos.");
        System.out.println("Primera lista:");
        myList1.printList();
        System.out.println("Segunda lista:");
        myList2.printList();

         /*
         int[] array = new int[1000000];
         for (int i = 0; i < array.length; i++) {
         array[i] = 1000;
         } //
        
         // Agregamos cantidades grandes de datos.
         for (int i = 0; i < 1000000; i++) { // O(N2)
         myList.add(1000);
         } */
              
        System.out.println("\nConteo de nodos: ");
        System.out.println("Primera lista:");
        System.out.println(myList1.sizeList());        
        System.out.println("Segunda lista:");
        System.out.println(myList2.sizeList());
                        
        // Insertar un nodo al inicio.
        try {
            myList1.addAt(70, 0);
            myList2.addAt(12, 0);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        
        // Imprimimos la lista modificada
        System.out.println("\nListas modificadas (agregamos nodos al principio).");
        System.out.println("Primera lista:");
        myList1.printList();
        System.out.println("Segunda lista:");
        myList2.printList();
        
        System.out.println("\nConteo de nodos:");
        System.out.println("Primera lista:");
        System.out.println(myList1.sizeList());
        System.out.println("Segunda lista:");
        System.out.println(myList2.sizeList());
        
        /*
        // Insertar un nodo en una posición especifica.
        try {
            myList.addAt(90, 3);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        
        // Imprimimos la lista modificada
        System.out.println("Lista modificada.");
        myList.printList(); */
                
        /*
        // Vaciar lista
        System.out.println("\nCuando vacíamos la lista");
        myList.clearList();
        myList.printList(); */
                
        // Eliminar nodo en alguna posición.
        try {
            myList1.deleteAt(5);
            myList2.deleteAt(3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }        
        
        System.out.println("\nListas modificadas.");
        System.out.println("Primera lista");
        myList1.printList();
        System.out.println("Segunda lista:");
        myList2.printList();
        
        System.out.println("\nConteo de nodos:");
        System.out.println("Primera lista:");
        System.out.println(myList1.sizeList());
        System.out.println("Segunda lista:");
        System.out.println(myList2.sizeList());        
        
        // Pedir valor en una posición en específico        
        System.out.println("\nValor de las listas en una posición.");
        System.out.println("Primera lista:");
        myList1.getValueAt(2); 
        System.out.println("Segunda lista:");
        myList2.getValueAt(8);
    }
}