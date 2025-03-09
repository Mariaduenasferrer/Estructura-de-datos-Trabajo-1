package ListasSimplementerEnlazadas;

public class Lista<T> implements ListaInterface<T> {
    private Elemento<T> cabeza;
    private int size;

    public Lista() {
        this.size = 0;
        this.cabeza = null;
    }

    public T getCabeza(){
       return (T) cabeza;
    }
    public void setCabeza(Elemento<T> cabeza){
        this.cabeza = cabeza;
    }

    @Override
    public boolean add(T elemento) {
        Elemento<T> nuevoElemento = new Elemento<>(elemento);
        if (this.cabeza == null) {
            this.cabeza = nuevoElemento;

        }else{
            nuevoElemento.setSiguiente(this.cabeza);
            this.cabeza = nuevoElemento;
        }
        this.size++;
        return true;
    }

    @Override
    public boolean delete(T element) {
        if (this.cabeza == null) {
            return false;

        }
        if (cabeza.dato.equals(element)) {
            cabeza=cabeza.siguiente;
            this.size--;
            return true;
        }
        Elemento<T> actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.equals(element)) {
                actual.siguiente = actual.siguiente.siguiente;
                this.size--;
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
    public void setSize(int size){
        this.size = size;

    }
}
