package ListasDoblementeEnlazadas;


public class TestDoblementeEnlazada {
    Lista<Integer> lista = new ListaDoblementeEnlazada<>();
    lista.add(5);
    lista.add(15);
    lista.add(25);
    lista.delete(15);
    Lista<Integer> resultado = new ArrayLista<>();
    Iterador<Integer> iterador = lista.getIterador();
    while (iterador.hasNext()) {
        resultado.add(iterador.next());
    }
    assertEquals(Lista.of(5, 25), resultado);
}
