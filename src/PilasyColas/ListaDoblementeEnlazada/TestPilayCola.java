package PilasyColas.ListaDoblementeEnlazada;

import PilasyColas.ListaSimplementeEnlazada.Cola;
import PilasyColas.ListaSimplementeEnlazada.Pila;

public class TestPilayCola {
    public static void main(String[] args) {
        // Prueba de la Pila
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);

        Integer resultadoPop = pila.pop(); // Desapila el último elemento
        if (resultadoPop != null && resultadoPop.equals(2)) {
            System.out.println("Pila: True"); // Salida esperada: True
        } else {
            System.out.println("Pila: False");
        }

        // Prueba de la Cola
        Cola<Integer> cola = new Cola<>();
        cola.enqueue(10);
        cola.enqueue(20);

        Integer resultadoDequeue = cola.dequeue(); // Desencola el primer elemento
        if (resultadoDequeue != null && resultadoDequeue.equals(10)) {
            System.out.println("Cola: True"); // Salida esperada: True
        } else {
            System.out.println("Cola: False");
        }
    }
}