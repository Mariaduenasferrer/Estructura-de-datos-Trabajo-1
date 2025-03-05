package ListasSimplementerEnlazadas;

public interface Lista<T> {
    boolean add(T element);
    boolean delete(T element);
    Iterador<T> getIterador();
    int getNumElementos();
}
