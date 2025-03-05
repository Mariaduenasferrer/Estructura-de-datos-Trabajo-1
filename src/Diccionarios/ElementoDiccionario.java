package Diccionarios;

public class ElementoDiccionario<K,V> {
    K clave;
    V valor;
    ElementoDiccionario<K,V> siguiente;
    ElementoDiccionario<K,V> anterior;
}
