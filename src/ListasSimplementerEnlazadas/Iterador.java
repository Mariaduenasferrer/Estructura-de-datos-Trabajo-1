package ListasSimplementerEnlazadas;

public class Iterador<T> implements IteradorInterface<T> {
    private Lista<T> lista;
    private Elemento<T> actual;

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
        if (actual == null || lista.getCabeza() == null) {
            return;
        }
        if (actual == lista.getCabeza()) {
            lista.setCabeza(actual.getSiguiente());
        } else {
            Elemento<T> actualTemp = (Elemento<T>) lista.getCabeza();
            while (actualTemp != null && actualTemp.getSiguiente() != actual) {
                actualTemp = actualTemp.getSiguiente();
            }
            if (actualTemp != null) {
                actualTemp.setSiguiente(actual.getSiguiente());
            }
        }

        lista.setSize(lista.getSize() - 1);
    }

}




