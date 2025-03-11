package Diccionarios;

import java.util.ArrayList;
import java.util.List;

public class DiccionarioOrdenado<K, V> implements Diccionario<K, V> {
    private List<ElementoDiccionario<K, V>> elementos = new ArrayList<>();

    @Override
    public void add(ElementoDiccionario<K, V> elemento) {
        elementos.add(elemento);
    }

    @Override
    public void delete(ElementoDiccionario<K, V> elemento) {
        elementos.removeIf(e -> e.getClave().equals(elemento.getClave()));
    }

    @Override
    public Iterador<ElementoDiccionario<K, V>> getIterador() {
        return new Iterador<>(elementos);
    }
}


