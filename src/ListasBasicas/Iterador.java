package ListasBasicas;

public class Iterador<T> implements IteradorInterface<T> {
    private Lista<T> Lista;
    private int indice;

    public Iterador(Lista<T> Lista) {
        this.Lista = Lista;
        this.indice = 0; // Inicializamos el índice en 0
    }

    @Override
    public boolean hasNext() {
        return indice < Lista.getSize(); // Comprueba si hay más elementos
    }

    @Override
    public T next() {
        // Validamos si hay más elementos
        if (hasNext()) {
            return Lista.obtener(indice++); // Retorna el elemento actual y avanza el índice
        } else {
            return null; // Si no hay más elementos, devolvemos null
        }
    }

    @Override
    public void delete() {
        // Validamos que el índice esté dentro de los límites válidos
        if (indice <= 0 || indice > Lista.getSize()) {
            return; // Salimos del método si el índice está fuera de los límites
        }

        // Eliminamos el elemento en el índice actual - 1 (el último retornado por next)
        int eliminarIndice = indice - 1;
        for (int i = eliminarIndice; i < Lista.getSize() - 1; i++) {
            Lista.elementos[i] = Lista.elementos[i + 1]; // Desplazamos los elementos hacia la izquierda
        }
        Lista.elementos[Lista.getSize() - 1] = null; // Limpiamos el último elemento
        Lista.setSize(Lista.getSize() - 1); // Reducimos el tamaño de la lista
        indice--; // Ajustamos el índice para reflejar el cambio
    }
}



