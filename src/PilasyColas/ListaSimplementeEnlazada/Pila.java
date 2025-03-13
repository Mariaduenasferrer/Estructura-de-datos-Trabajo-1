package PilasyColas.ListaSimplementeEnlazada;

import ListasSimplementeEnlazadas.Elemento;
import ListasSimplementeEnlazadas.Lista;

public class Pila<T> {
    private Lista<T> lista; // Lista simplemente enlazada utilizada como base
    private T cima;         // Último elemento agregado (el tope de la pila)

    public Pila() {
        lista = new Lista<>();
        cima = null;
    }

    // Agregar un elemento a la pila (Push)
    public void push(T elemento) {
        lista.add(elemento); // Añade el elemento al final de la lista
        cima = elemento;     // Actualiza la cima
    }

    // Eliminar y retornar el elemento en la cima de la pila (Pop)
    public T pop() {
        if (lista.getSize() == 0) {
            cima = null; // Si la lista está vacía, la cima también es null
            return null; // No hay elementos para eliminar
        }

        // Recorrer la lista hasta llegar al penúltimo elemento
        T elementoEliminado = cima; // Guardar el valor de la cima actual
        T penultimo = null;         // Variable para almacenar el penúltimo elemento

        T actual = lista.getCabeza(); // Primer elemento de la lista
        for (int i = 0; i < lista.getSize() - 1; i++) {
            penultimo = actual;            // Actualizar el penúltimo
            actual = lista.getIterador().next(); // Mover al siguiente elemento
        }

        lista.delete(elementoEliminado); // Eliminar el último elemento
        cima = penultimo; // Actualizar la cima al penúltimo elemento (nuevo tope)

        return elementoEliminado; // Retornar el valor eliminado
    }

    // Retorna el último elemento sin eliminarlo
    public T peek() {
        return cima; // Devuelve la cima actual sin modificarla
    }

    // Verificar si la pila está vacía
    public boolean isEmpty() {
        return lista.getSize() == 0; // La pila está vacía si la lista lo está
    }

    // Obtener el tamaño de la pila
    public int size() {
        return lista.getSize(); // El tamaño de la pila es el tamaño de la lista
    }
}

