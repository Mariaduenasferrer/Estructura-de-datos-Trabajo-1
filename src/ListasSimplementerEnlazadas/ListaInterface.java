package ListasSimplementerEnlazadas;

public interface ListaInterface<T> {
    boolean add(T element);
    boolean delete(T element);
    IteradorInterface<T> getIterador();
    int getSize();
    void setCabeza(Elemento<T> cabeza);
    T getCabeza();
    void setSize(int size);
}
