package ListasDoblementeEnlazadas;

public class Iterador<T> implements IteradorInterface<T> {
    private ListaIterador<T> lista;
    private Elemento<T> actual;

    public Iterador(ListaIterador<T> lista) {
        this.lista = lista;
        this.actual = (Elemento<T>) lista.getcabeza();
    }
    @Override
    public boolean hasNext() {
        return actual!=null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        T dato= actual.getDato();
        actual= actual.getSiguiente();
        return dato;
    }

    @Override
    public void delete() {
        if( actual==null ) {
            return;
        }
        if( actual.getDato()!=null ) {
            actual.getAnterior().setSiguiente(actual.getSiguiente());
        }else {
            lista.setCabeza((T) actual.getSiguiente());
        }
        if (actual.getSiguiente()!=null) {
            actual.getSiguiente().setAnterior(actual.getAnterior());
        }else{
            lista.setCola((T) actual.getSiguiente());
            lista.setSize(lista.getSize() - 1);
        }
    }
}
