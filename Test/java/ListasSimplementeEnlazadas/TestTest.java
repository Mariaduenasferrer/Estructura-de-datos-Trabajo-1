package ListasSimplementeEnlazadas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTest {

    private Lista<Integer> lista;

    @BeforeEach
    public void setUp() {
        lista = new Lista<>();
    }

    @Test
    public void testAddAndGetSize() {
        lista.add(1);
        lista.add(2);
        lista.add(3);
        assertEquals(3, lista.getSize(), "El tamaño de la lista debería ser 3");
    }

    @Test
    public void testIteradorBeforeAndAfterDelete() {
        // Agregar elementos a la lista
        lista.add(1);
        lista.add(2);
        lista.add(3);

        // Validar los elementos en la lista antes de eliminar
        Iterador<Integer> iterador = (Iterador<Integer>) lista.getIterador();
        assertTrue(iterador.hasNext(), "El iterador debería tener más elementos");
        assertEquals(1, iterador.next(), "El primer elemento debería ser 1");
        assertEquals(2, iterador.next(), "El segundo elemento debería ser 2");
        assertEquals(3, iterador.next(), "El tercer elemento debería ser 3");

        // Eliminar un elemento
        lista.delete(2);

        // Validar los elementos en la lista después de eliminar
        iterador = (Iterador<Integer>) lista.getIterador();
        assertTrue(iterador.hasNext(), "El iterador debería tener más elementos después de eliminar");
        assertEquals(1, iterador.next(), "El primer elemento debería seguir siendo 1");
        assertEquals(3, iterador.next(), "El segundo elemento ahora debería ser 3");
    }

    @Test
    public void testDeleteAndSize() {
        lista.add(1);
        lista.add(2);
        lista.add(3);

        // Validar eliminación
        assertTrue(lista.delete(2), "Debería poder eliminar el elemento 2");
        assertEquals(2, lista.getSize(), "El tamaño de la lista después de eliminar debería ser 2");

        assertFalse(lista.delete(4), "No debería poder eliminar un elemento inexistente");
        assertEquals(2, lista.getSize(), "El tamaño de la lista no debería cambiar al intentar eliminar un elemento inexistente");
    }

    @Test
    public void testEmptyList() {
        assertEquals(0, lista.getSize(), "El tamaño de una lista vacía debería ser 0");
        Iterador<Integer> iterador = (Iterador<Integer>) lista.getIterador();
        assertFalse(iterador.hasNext(), "El iterador no debería tener elementos en una lista vacía");
    }
}

