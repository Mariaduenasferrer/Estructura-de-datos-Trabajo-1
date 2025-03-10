package Diccionarios.parte2;

import java.util.Iterator;
import java.util.List;

public class Iterador<T> {
    private Iterator<T> iterator;

    public Iterador(List<T> elementos) {
        this.iterator = elementos.iterator();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public T next() {
        return iterator.next();
    }
}

