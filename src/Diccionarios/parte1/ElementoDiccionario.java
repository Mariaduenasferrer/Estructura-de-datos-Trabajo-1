package Diccionarios.parte1;

public class ElementoDiccionario<K,V> {
    K clave;
    V valor;
    ElementoDiccionario<K,V> siguiente;
    ElementoDiccionario<K,V> anterior;

    public ElementoDiccionario(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
        siguiente = null;
        anterior = null;
    }
}
