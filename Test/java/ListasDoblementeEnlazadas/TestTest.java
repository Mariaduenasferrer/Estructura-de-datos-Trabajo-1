package ListasDoblementeEnlazadas;

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
    public void testAddAndSize() {
        lista.add(1);
        lista.add(2);
        lista.add(3);

        assertEquals(3, lista.getSize(), "El tamaño de la lista debería ser 3 después de agregar tres elementos.");
    }

    @Test
    public void testIterator() {
        lista.add(1);
        lista.add(2);
        lista.add(3);

        Iterador<Integer> iterador = (Iterador<Integer>) lista.getIterador();
        assertNotNull(iterador, "El iterador no debería ser null.");

        int[] expectedElements = {1, 2, 3};
        int index = 0;
        while (iterador.hasNext()) {
            assertEquals(expectedElements[index], iterador.next(), "El elemento iterado no coincide con el esperado.");
            index++;
        }
        assertEquals(expectedElements.length, index, "El número de elementos iterados debería coincidir con el tamaño esperado.");
    }

    @Test
    public void testDeleteAndSize() {
        lista.add(1);
        lista.add(2);
        lista.add(3);

        lista.delete(2); // Eliminar el elemento con valor 2

        assertEquals(2, lista.getSize(), "El tamaño de la lista debería ser 2 después de eliminar un elemento.");
        Iterador<Integer> iterador = (Iterador<Integer>) lista.getIterador();

        int[] expectedElementsAfterDelete = {1, 3};
        int index = 0;
        while (iterador.hasNext()) {
            assertEquals(expectedElementsAfterDelete[index], iterador.next(), "El elemento restante no coincide con el esperado.");
            index++;
        }
        assertEquals(expectedElementsAfterDelete.length, index, "El número de elementos restantes debería ser igual al tamaño esperado.");
    }
}
