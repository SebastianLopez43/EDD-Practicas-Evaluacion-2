package eva2_2_tipos_datos_genericos;

import java.util.LinkedList;

/**
 * @author José Sebastian López Ibarra
 * Friday October 07 2022
 */

public class EVA2_2_TIPOS_DATOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<Integer>(); // Ttipos de datos genéricos .       
        myList.add(100);
        myList.add(200);
        myList.add(300);
        myList.add(400);
        
        System.out.println(myList);
               
        generalDataTypes<Integer> myObj = new generalDataTypes<Integer>();
        myObj.setValor(100);
        
        System.out.println(myObj.getValue());
        
        LinkedList<String> list =  new LinkedList<String>(); // listas doblemente enlazadas.
    }    
}

class generalDataTypes<T> { // Tipo de dato a sustituir dentro de tu clase.
    private T value; // T es un tipo de dato cualquiera.

    public T getValue() {
        return value;
    }
    public void setValor(T value) {
        this.value = value;
    }        
}