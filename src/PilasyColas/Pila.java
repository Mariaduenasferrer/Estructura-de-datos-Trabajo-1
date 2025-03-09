package PilasyColas;

import ListasSimplementerEnlazadas.Lista;

public class Pila<T> {
    Lista<T> lista;
    T cima;

    public Pila(){
        cima = null;
        lista = new Lista<>();
    }
    public void push(T elemento){
        lista.add(elemento);
        cima = elemento;
    }
    public T pop(){
        if(cima != null){
            lista.delete(cima);
            return cima;
        }else{
            return null;
        }
    }
}
