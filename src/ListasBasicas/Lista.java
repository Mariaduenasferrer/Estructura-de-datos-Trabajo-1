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
    public void setSize(int size) {
        this.size=size;
    }
}

