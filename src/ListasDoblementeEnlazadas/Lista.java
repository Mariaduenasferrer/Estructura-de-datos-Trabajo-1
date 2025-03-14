package ListasDoblementeEnlazadas;

public class Lista<T> implements ListaIterador<T> {
    private Elemento<T> cabeza;
    private Elemento<T> cola;
    private int size;

    public Lista() {
        cabeza = null;
        cola = null;
        size = 0;
    }

    @Override
    public boolean add(T elemento) {
        Elemento<T> nuevoElemento = new Elemento<>(elemento);
        if (cabeza == null) {
            cabeza = nuevoElemento;
            cola = nuevoElemento;
        } else {
            cola.siguiente = nuevoElemento;
            nuevoElemento.anterior = cola;
            cola = nuevoElemento;
        }
        size++;
        return true;
    }

    @Override
    public boolean delete(T elemento) {
        if (cabeza == null) {
            return false;
        }
        Elemento<T> actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(elemento)) {
                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                    if (cabeza != null) {
                        cabeza.anterior = null;
                    }
                } else if (actual == cola) {
                    cola = actual.anterior;
                    if (cola != null) {
                        cola.siguiente = null;
                    }
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                size--;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    @Override
    public IteradorInterface<T> getIterador() {
        return new Iterador<>(this);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public T getcabeza() {
        return (cabeza != null) ? (T) cabeza : null;
    }

    @Override
    public void setCabeza(T elemento) {
        if (cabeza != null) {
            cabeza.dato = elemento;
        } else {
            cabeza = new Elemento<>(elemento);
            if (cola == null) {
                cola = cabeza;
            }
        }
    }

    @Override
    public T getcola() {
        return (cola != null) ? (T) cola: null;
    }

    @Override
    public void setCola(T elemento) {
        if (cola != null) {
            cola.dato = elemento;
        } else {
            cola = new Elemento<>(elemento);
            if (cabeza == null) {
                cabeza = cola;
            }
        }
    }
}

