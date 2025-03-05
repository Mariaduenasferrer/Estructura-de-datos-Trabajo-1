package Diccionarios;

public class DiccionarioBasico<K,V> implements Diccionario<K,V> {
    ElementoDiccionario<K,V> cabeza;
    ElementoDiccionario<K,V> cola;
}
