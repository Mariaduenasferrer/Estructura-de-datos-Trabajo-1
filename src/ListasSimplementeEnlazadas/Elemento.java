package ListasSimplementeEnlazadas;

public class Elemento<T> {
    public T dato;
    public Elemento<T> siguiente;

    public Elemento(T elemento) {
        dato = elemento;
        siguiente = null;
    }
    public T getDato() {
        return dato;

    }
    public void setDato(T elemento) {
        dato = elemento;

    }
    public Elemento<T> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Elemento<T> siguiente) {
        this.siguiente = siguiente;
    }
}
