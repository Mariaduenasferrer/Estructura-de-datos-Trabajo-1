package ListasDoblementeEnlazadas;

public class ListaDoblementeEnlazada<T> implements Lista<T> {
    private ElementoDoble<T> cabeza;
    private ElementoDoble<T> cola;

    public ListaDoblementeEnlazada() {
        cabeza = null;
        cola = null;
    }

    @Override
    public boolean add(T elemento) {
        return false;
    }

    @Override
    public boolean delete(T elemento) {
        return false;
    }

    @Override
    public Iterador<T> getIterador() {
        return null;
    }

    @Override
    public int getNumElementos() {
        return 0;
    }
}
