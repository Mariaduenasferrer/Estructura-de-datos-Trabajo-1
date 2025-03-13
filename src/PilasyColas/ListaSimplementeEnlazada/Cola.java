package PilasyColas.ListaSimplementeEnlazada;

import ListasSimplementeEnlazadas.Lista;

public class Cola<T> {
    Lista<T> lista;
    T cabeza;
    T cola;

    public Cola(){
        cola = null;
        lista = new Lista<>();
        cabeza = null;
    }
    public void enqueue(T elemento) {
        if (cola == null) {
            lista.add(elemento);
            cola = elemento;  // First element becomes cola
            cabeza = elemento; // First element also becomes cabeza
        } else {
            lista.add(elemento);
            cabeza = elemento;  // Update cabeza to the new last element
        }
    }

    public T dequeue(){
        if (cola == null){
            return null;
        }else{
            lista.delete(cola);
            return cola;
        }
    }
}
