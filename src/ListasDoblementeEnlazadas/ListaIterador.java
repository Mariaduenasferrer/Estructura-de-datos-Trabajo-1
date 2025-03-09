package ListasDoblementeEnlazadas;

public interface ListaIterador<T> {
    boolean add(T elemento);
    boolean delete(T elemento);
    IteradorInterface<T> getIterador();
    int getSize() ;
    T getcabeza();
    void setCabeza(T elemento);
    T getcola();
    void setCola(T elemento);
    void setSize(int size);
}
