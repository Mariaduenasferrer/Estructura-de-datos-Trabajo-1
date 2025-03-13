package ListasBasicas;

class Lista<T> implements ListaInterface<T> {
    private int maxElementos;
    Object[] elementos;
    private int size;

    public Lista(){
        maxElementos=10;
        elementos=(T[])new Object[maxElementos];
        size=0;
    }

    @Override
    public boolean add(T elemento) {
        if (size== elementos.length){
            Object[] nuevaLista = (T[]) new Object[elementos.length * 2];
            for (int i=0;i<elementos.length;i++){
                nuevaLista[i]= (T) elementos[i];
            }
            elementos=nuevaLista;
        }
        elementos[size]=elemento;
        size++;
        return true;
    }

    @Override
    public boolean delete(T elemento) {
        for (int i=0;i<size ;i++){
            if (elementos[i].equals(elemento)){
                for (int j=i;j<size-1;j++){
                    elementos[j]=elementos[j+1];
                }
                elementos[size-1]=null;
                size--;
                return true;
            }
        }
        return false;
    }

    // Obtener la cabeza
    public T getCabeza() {
        if (size > 0) {
            return (T) elementos[0]; // Devuelve el primer elemento
        }
        return null; // Devuelve null si la lista está vacía
    }

    // Establecer la cabeza
    public void setCabeza(T nuevoValor) {
        if (size > 0) {
            elementos[0] = nuevoValor; // Actualiza el primer elemento
        }
    }

    // Obtener la cola
    public T getCola() {
        if (size > 0) {
            return (T) elementos[size - 1]; // Devuelve el último elemento
        }
        return null; // Devuelve null si la lista está vacía
    }

    // Establecer la cola
    public void setCola(T nuevoValor) {
        if (size > 0) {
            elementos[size - 1] = nuevoValor; // Actualiza el último elemento
        }
    }


    @Override
    public Iterador<T> getIterador() {

        return new Iterador<T>(this) {};
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T obtener(int indice) {
        if( indice>=0 && indice<size){
            return (T) elementos[indice];
        }
        return null;
    }
    @Override
    public void setSize(int size) {
        this.size=size;
    }
}

