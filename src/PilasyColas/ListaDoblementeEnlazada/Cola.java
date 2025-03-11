package PilasyColas.ListaDoblementeEnlazada;

import ListasDoblementeEnlazadas.Lista;
import ListasDoblementeEnlazadas.Elemento;


public class Cola<T> {
    private Lista<T> lista;

    public Cola() {
        lista = new Lista<>();
    }

    public void enqueue(T elemento) {
        lista.add(elemento); // Agregar al final
    }

    public T dequeue() {
        if (lista.getSize() == 0) {
            return null; // Cola vacía
        }

        // Obtener la cabeza y eliminarla
        Elemento<T> cabezaElemento = (Elemento<T>) lista.getcabeza();
        T dato = cabezaElemento.getDato(); // Obtener el dato directamente
        lista.delete(dato); // Eliminar el elemento
        return dato; // Retornar el dato
    }

    public boolean isEmpty() {
        return lista.getSize() == 0; // Verificar si está vacía
    }

    public int size() {
        return lista.getSize(); // Retornar el tamaño de la cola
    }
}






