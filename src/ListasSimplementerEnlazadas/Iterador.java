package ListasSimplementerEnlazadas;

public class Iterador<T> implements IteradorInterface<T> {
    private Lista<T> lista;
    private Elemento<T> actual;
    private Elemento<T> previo;


    public Iterador(Lista<T> lista) {
        this.lista = lista;
        this.actual = (Elemento<T>) lista.getCabeza();
    }

    @Override
    public boolean hasNext() {

        return actual != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;

        }
        T dato = actual.getDato();
        actual = actual.getSiguiente();
        return dato;
    }

    @Override
    public void delete() {
        if (actual == null) {
            return;
        }
        if (previo == null) {
            lista.setCabeza(actual.getSiguiente());
        } else {
            previo.setSiguiente(actual.getSiguiente());
        }
        actual = actual.getSiguiente();
        lista.setSize(lista.getSize() - 1);
    }
}




