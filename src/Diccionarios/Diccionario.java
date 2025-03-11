package Diccionarios;

public interface Diccionario<K, V> {
    void add(ElementoDiccionario<K, V> elemento);
    void delete(ElementoDiccionario<K, V> elemento);
    Iterador<ElementoDiccionario<K, V>> getIterador();
}

