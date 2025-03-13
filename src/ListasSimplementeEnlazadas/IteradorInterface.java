package ListasSimplementeEnlazadas;

public interface IteradorInterface<T> {
    boolean hasNext(); // Comprueba si hay un siguiente elemento
    T next();          // Obtiene el siguiente elemento
    void delete();     // Elimina el elemento actual
}

