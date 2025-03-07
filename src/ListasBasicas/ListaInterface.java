package ListasBasicas;

interface ListaInterface<T> {
    boolean add(T elemento);
    boolean delete(T elemento);
    Iterador<T> getIterador();
    int getSize();
    T obtener(int indice);
    void setSize(int size);
}


