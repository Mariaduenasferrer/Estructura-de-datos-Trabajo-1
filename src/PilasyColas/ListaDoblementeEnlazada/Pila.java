package PilasyColas.ListaDoblementeEnlazada;

import ListasDoblementeEnlazadas.Lista;
import ListasDoblementeEnlazadas.Elemento;

public class Pila<T> {
    private Lista<T> lista;

    public Pila() {
        lista = new Lista<>();
    }

    public void push(T elemento) {
        lista.add(elemento); // Agregar al final
    }

    public T pop() {
        if (lista.getSize() == 0) {
            return null; // Pila vacía
        }

        // Obtener la cola y eliminarla
        Elemento<T> colaElemento = (Elemento<T>) lista.getcola();
        T dato = colaElemento.getDato(); // Obtener el dato directamente
        lista.delete(dato); // Eliminar el elemento
        return dato; // Retornar el dato
    }

    public boolean isEmpty() {
        return lista.getSize() == 0; // Verificar si está vacía
    }

    public int size() {
        return lista.getSize(); // Retornar el tamaño de la pila
    }
}


