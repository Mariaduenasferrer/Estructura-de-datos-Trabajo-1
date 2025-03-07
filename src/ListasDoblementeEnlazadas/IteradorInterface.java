package ListasDoblementeEnlazadas;

public interface IteradorInterface<T> {
    boolean hasNext();
    T next();
    void delete();
}
