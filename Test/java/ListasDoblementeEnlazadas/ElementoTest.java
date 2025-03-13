package ListasDoblementeEnlazadas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ElementoTest {

    @Test
    public void testConstructorAndGetters() {
        Elemento<Integer> elemento = new Elemento<>(10);
        assertEquals(10, elemento.getDato());
        assertNull(elemento.getAnterior());
        assertNull(elemento.getSiguiente());
    }

    @Test
    public void testSetters() {
        Elemento<String> elemento = new Elemento<>("Dato inicial");
        elemento.setDato("Dato modificado");
        elemento.setAnterior(new Elemento<>("Anterior"));
        elemento.setSiguiente(new Elemento<>("Siguiente"));

        assertEquals("Dato modificado", elemento.getDato());
        assertEquals("Anterior", elemento.getAnterior().getDato());
        assertEquals("Siguiente", elemento.getSiguiente().getDato());
    }
}
