package ListasDoblementeEnlazadas;


public class TestDoblementeEnlazada {
    Lista<Integer> Lista = new Lista<>();
    Lista.add(5);
    Lista.add(15);
    Lista.add(25);
    Lista.delete(15);
    Lista<Integer> resultado = new ArrayLista<>();
    Iterador<Integer> iterador = Lista.getIterador();
    while (iterador.hasNext()) {
        resultado.add(iterador.next());
    }
    assertEquals(Lista.of(5, 25), resultado);
}
