package ListasDoblementeEnlazadas;

public class Elemento<T> {
    T dato;
    Elemento<T> anterior;
    Elemento<T> siguiente;
    public Elemento(T dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
    public T getDato() {
        return dato;

    }
    public void setDato(T dato) {
        this.dato = dato;

    }
    public Elemento<T> getAnterior() {
        return anterior;

    }
    public void setAnterior(Elemento<T> anterior) {
        this.anterior = anterior;

    }

    public Elemento<T> getSiguiente() {
        return siguiente;

    }
    public void setSiguiente(Elemento<T> siguiente) {
        this.siguiente = siguiente;

    }
}
