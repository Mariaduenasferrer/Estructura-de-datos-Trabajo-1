package ListasSimplementeEnlazadas;

public class Iterador<T> implements IteradorInterface<T> {
    private Elemento<T> actual; // Nodo actual en la lista
    private Elemento<T> previo; // Nodo previo al actual
    private Elemento<T> cabeza; // Referencia a la cabeza de la lista

    public Iterador(Elemento<T> cabeza) {
        this.cabeza = cabeza; // Inicializar con la cabeza
        this.actual = cabeza; // El nodo actual comienza como la cabeza
        this.previo = null;   // No hay nodo previo al inicio
    }

    @Override
    public boolean hasNext() {
        return actual != null; // Hay más elementos si actual no es null
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null; // Si no hay más elementos, devolver null
        }
        T dato = actual.getDato(); // Obtener el dato del nodo actual
        previo = actual;           // Guardar el nodo actual como previo
        actual = actual.getSiguiente(); // Avanzar al siguiente nodo
        return dato; // Retornar el dato
    }

    @Override
    public void delete() {
        if (actual == null) {
            return; // No se puede eliminar un nodo inexistente
        }

        if (actual == cabeza) {
            // Si el nodo actual es la cabeza, actualizamos la cabeza
            cabeza = actual.getSiguiente();
            actual = cabeza; // Ajustar actual a la nueva cabeza
        } else if (previo != null) {
            // Si no es la cabeza, saltamos el nodo actual
            previo.setSiguiente(actual.getSiguiente());
            actual = previo.getSiguiente(); // Avanzar al siguiente nodo lógico
        }
    }

    public Elemento<T> getCabeza() {
        return cabeza; // Retornar la cabeza de la lista actualizada
    }
}





