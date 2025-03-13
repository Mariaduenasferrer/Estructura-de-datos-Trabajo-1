package PilasyColas.ListaDoblementeEnlazada;

import ListasDoblementeEnlazadas.Lista;
import ListasDoblementeEnlazadas.Elemento;

public class Pila<T> {
    private Lista<Elemento<T>> lista;

    public Pila() {
        lista = new Lista<>();
    }

    public void push(T dato) {
        // Crear un nuevo Elemento<T> y agregarlo al final de la lista
        Elemento<T> nuevoElemento = new Elemento<>(dato);
        lista.add(nuevoElemento);
    }

    public T pop() {
        if (lista.getSize() == 0) {
            return null; // Pila vacía
        }

        // Obtener el último elemento (la "cola") y eliminarlo
        Elemento<T> colaElemento = lista.getcola();
        T dato = colaElemento.getDato(); // Obtener el dato del Elemento
        lista.delete(colaElemento); // Eliminar el Elemento completo de la lista
        return dato; // Retornar el dato
    }

    public boolean isEmpty() {
        return lista.getSize() == 0; // Verificar si está vacía
    }

    public int size() {
        return lista.getSize(); // Retornar el tamaño de la pila
    }
}


