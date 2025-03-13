package ListasSimplementeEnlazadas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListaTest {

    private Lista<Integer> lista;

    @BeforeEach
    public void setUp() {
        lista = new Lista<>();
    }

    @Test
    public void testAddElemento() {
        assertTrue(lista.add(1));
        assertTrue(lista.add(2));
        assertEquals(2, lista.getSize());
        assertEquals(1, lista.getCabeza());
    }

    @Test
    public void testDeleteElementoExistente() {
        lista.add(1);
        lista.add(2);
        lista.add(3);

        assertTrue(lista.delete(2));
        assertEquals(2, lista.getSize());
        assertFalse(lista.delete(4)); // Elemento no existente
    }

    @Test
    public void testDeleteCabeza() {
        lista.add(1);
        lista.add(2);

        assertTrue(lista.delete(1)); // Eliminar la cabeza
        assertEquals(1, lista.getSize());
        assertEquals(2, lista.getCabeza());
    }

    @Test
    public void testDeleteElementoNoExistente() {
        lista.add(1);
        lista.add(2);

        assertFalse(lista.delete(3)); // Elemento no en la lista
        assertEquals(2, lista.getSize());
    }

    @Test
    public void testGetIterador() {
        lista.add(1);
        lista.add(2);
        lista.add(3);

        IteradorInterface<Integer> iterador = lista.getIterador();
        assertNotNull(iterador);
        assertTrue(iterador.hasNext());
        assertEquals(1, iterador.next());
    }

    @Test
    public void testListaVacia() {
        assertEquals(0, lista.getSize());
        assertNull(lista.getCabeza());
    }
}


