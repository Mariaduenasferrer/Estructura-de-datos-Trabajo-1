package ListasSimplementerEnlazadas;

public class ListaSimplementeEnlazada<T> implements Lista<T> {
    private Elemento<T> cabeza;


    @Override
    public boolean add(T element) {
        return false;
    }

    @Override
    public boolean delete(T element) {
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
