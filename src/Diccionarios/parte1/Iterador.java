package Diccionarios.parte1;

public interface Iterador<T> {
    boolean hasNext();
    T next();
    void delete();
}
