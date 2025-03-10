package Diccionarios.parte2;

public class ElementoDiccionario<K, V> {
    private K clave;
    private V valor;

    public ElementoDiccionario(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public V getValor() {
        return valor;
    }
}

