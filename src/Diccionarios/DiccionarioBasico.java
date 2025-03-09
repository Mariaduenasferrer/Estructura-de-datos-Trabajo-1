package Diccionarios;

public class DiccionarioBasico<K,V> implements Diccionario<K,V> {
    ElementoDiccionario<K,V> cabeza;
    ElementoDiccionario<K,V> cola;

    @Override
    public boolean add(K clave, V valor) {
        return false;
    }

    @Override
    public boolean delete(K clave) {
        return false;
    }

    @Override
    public Iterador<ElementoDiccionario<K, V>> getIterador() {
        return null;
    }

    @Override
    public boolean exists(K clave) {
        return false;
    }

    @Override
    public V get(K clave) {
        return null;
    }

    @Override
    public int getNumElementos() {
        return 0;
    }
}
