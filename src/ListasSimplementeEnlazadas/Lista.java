package ListasSimplementeEnlazadas;

public class Lista<T> implements ListaInterface<T> {
    private Elemento<T> cabeza; // Referencia al inicio de la lista
    private int size; // Número de elementos en la lista

    // Constructor
    public Lista() {
        this.cabeza = null;
        this.size = 0;
    }

    @Override
    public boolean add(T elemento) {
        Elemento<T> nuevoElemento = new Elemento<>(elemento);
        if (this.cabeza == null) {
            this.cabeza = nuevoElemento; // Si la lista está vacía, el nuevo elemento es la cabeza
        } else {
            Elemento<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente(); // Avanzar al final de la lista
            }
            actual.setSiguiente(nuevoElemento); // Añadir el nuevo elemento al final
        }
        this.size++; // Incrementar el tamaño de la lista
        return true;
    }

    @Override
    public boolean delete(T elemento) {
        if (this.cabeza == null) {
            return false; // Lista vacía, no se puede eliminar
        }
        if (this.cabeza.getDato().equals(elemento)) {
            // Si el elemento a eliminar es la cabeza
            this.cabeza = this.cabeza.getSiguiente(); // Actualizar la cabeza
            this.size--; // Reducir el tamaño de la lista
            return true;
        }

        // Buscar el elemento en la lista
        Elemento<T> actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getDato().equals(elemento)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente()); // Saltar el elemento eliminado
                this.size--; // Reducir el tamaño
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false; // Elemento no encontrado
    }

    @Override
    public IteradorInterface<T> getIterador() {
        // Devuelve un iterador para esta lista, basado en la cabeza de la lista
        return new Iterador<>(this.cabeza);
    }

    @Override
    public int getSize() {
        return this.size; // Retorna el tamaño actual de la lista
    }

    @Override
    public void setCabeza(Elemento<T> cabeza) {
        this.cabeza = cabeza; // Establecer un nuevo nodo como cabeza de la lista
    }

    @Override
    public T getCabeza() {
        // Retorna el dato contenido en la cabeza de la lista, o null si la lista está vacía
        return this.cabeza != null ? this.cabeza.getDato() : null;
    }

    @Override
    public void setSize(int size) {
        this.size = size; // Ajustar el tamaño de la lista (en situaciones específicas)
    }
}

