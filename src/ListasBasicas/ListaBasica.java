package ListasBasicas;

class ListaBasica<T> implements Lista<T> {
    int maxElementos;
    int numElementos;
    <T>[] elementos;

    @Override
    public boolean add(T elemento) {
        return false;
    }

    @Override
    public boolean delete(T elemento) {
        return false;
    }

    @Override
    public Iterador<T> getIterador() {
        return null;
    }

    @Override
    public int getNumElementos() {
        return 0;
    }
}



