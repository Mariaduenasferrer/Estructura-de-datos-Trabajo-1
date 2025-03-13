package PilasyColas.ListaDoblementeEnlazada;

import ListasDoblementeEnlazadas.Lista;
import ListasDoblementeEnlazadas.Elemento;

public class Cola<T> {
    private Lista<Elemento<T>> lista;

    public Cola() {
        lista = new Lista<>();
    }

    public void enqueue(T dato) {
        // Crear un nuevo Elemento<T> y agregarlo a la lista
        Elemento<T> nuevoElemento = new Elemento<>(dato);
        lista.add(nuevoElemento); // Agrega al final de la lista
    }

    public T dequeue() {
        if (lista.getSize() == 0) {
            return null; // Cola vacía
        }

        // Obtener el primer elemento y eliminarlo
        Elemento<T> cabezaElemento = lista.getcabeza();
        T dato = cabezaElemento.getDato(); // Obtener el dato del elemento
        lista.delete(cabezaElemento); // Eliminar el Elemento completo de la lista
        return dato; // Retornar el dato
    }

    public boolean isEmpty() {
        return lista.getSize() == 0; // Verificar si está vacía
    }

    public int size() {
        return lista.getSize(); // Retornar el tamaño de la cola
    }
}







