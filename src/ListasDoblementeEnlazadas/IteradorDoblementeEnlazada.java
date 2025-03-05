package ListasDoblementeEnlazadas;

public class IteradorDoblementeEnlazada<T> implements Iterador<T> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public void delete() {
    }
}
