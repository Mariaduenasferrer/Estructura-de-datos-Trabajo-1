package ListasDoblementeEnlazadas;

public interface IteradorInterface<T> {
    boolean hasNext();   // Verifica si hay un siguiente elemento
    T next();            // Devuelve el elemento actual y avanza al siguiente
    void delete();       // Elimina el elemento actual de la lista
}


