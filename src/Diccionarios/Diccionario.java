package Diccionarios;

public interface Diccionario<K,V> {
    boolean add (K clave, V valor);
    boolean delete (K clave);
    Iterador<ElementoDiccionario<K,V>> getIterador ();
    boolean exists(K clave);
    V get(K clave);
    int getNumElementos();
}
