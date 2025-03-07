package ListasBasicas;

public class Iterador <T> implements IteradorInterface<T> {
    private Lista<T> Lista;
    private int indice;

    public Iterador(Lista<T> Lista) {
        this.Lista = Lista;
        this.indice = 0;
    }

    @Override
    public boolean hasNext() {
        return indice < Lista.getSize();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        return Lista.obtener(indice++);
    }


    @Override
    public void delete() {
        if (indice < 0 || indice >= Lista.getSize()) {
            return;
        }

        for (int i = indice; i < Lista.getSize() - 1; i++) {
            Lista.elementos[i] = Lista.elementos[i + 1];
        }
        Lista.elementos[Lista.getSize() - 1] = null;
        Lista.setSize(Lista.getSize() - 1);
        indice--;
    }

}
