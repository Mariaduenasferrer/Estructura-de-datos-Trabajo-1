package ListasBasicas;

public class TestLista {
    public static void main(String[] args) {
        Lista<Integer> lista = new ListaBasica<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.delete(2);
        Lista<Integer> resultado = new ArrayLista<>();
        Iterador<Integer> iterador = lista.getIterador();
        while (iterador.hasNext()) {
            resultado.add(iterador.next());
        }
        assertEquals(Lista.of(1, 3), resultado);
    }
}
