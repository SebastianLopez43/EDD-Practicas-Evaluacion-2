package eva2_7_collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author José Sebastian López Ibarra
 * Thursday October 27 2022
 */

public class EVA2_7_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        /*        
        Estructuras de datos:
        - Listas
        - ArrayList
        - Queues
        - Stacks
        - Set
        */
        
        // LinkedList
        LinkedList <String> linkList = new LinkedList();
        linkList.add("Hello");
        linkList.add(" ");
        linkList.add("World");
        linkList.add("!!");
                
        System.out.println("Lista Enlazada: " + linkList); // Imprimir lista
        
        System.out.println("Elemento en la primera posición: " + linkList.get(0)); // Recuperar elementos en una posición de la lista
        
        linkList.remove(0); // Eliminar elemento en una posición de la lista
        System.out.println("Remover elemento en una posición.");
        System.out.println(linkList);
        
        linkList.addFirst("Hello"); // Insertar elemento al inicio de la lista
        System.out.println("Insertar elemento al inicio de la lista: ");
        System.out.println(linkList);
        
        // Recorrer cada uno de lo elementos de la lista e imprimirlos
        for (int i = 0; i < linkList.size(); i++) {
            System.out.print(linkList.get(i) + " ");
        }
        System.out.println("");
        
        // ArrayList
        ArrayList <Integer> arrayList = new ArrayList(); // Arreglos que pueden cambiar de tamaño.
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        
        System.out.println("\nLista de arreglo: " + arrayList);
        
        arrayList.add(2, 250); // Insertar elemento en una posición
        System.out.println(arrayList);
        
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print("[ " + arrayList.get(i) + " ]");
        }
    }
    
}
