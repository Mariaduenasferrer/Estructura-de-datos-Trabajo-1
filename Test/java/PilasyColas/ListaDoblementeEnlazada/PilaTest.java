package PilasyColas.ListaDoblementeEnlazada;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;

class PilaTest {

    @Test
    void testPushAndSize() {
        Pila<Integer> pila = new Pila<>();
        assertTrue(pila.isEmpty());
        assertEquals(0, pila.size());

        pila.push(10);
        pila.push(20);
        pila.push(30);

        assertFalse(pila.isEmpty());
        assertEquals(3, pila.size());
    }

    @Test
    void testPop() {
        Pila<Integer> pila = new Pila<>();
        pila.push(10);
        pila.push(20);

        assertEquals(20, pila.pop()); // Último elemento añadido (LIFO)
        assertEquals(10, pila.pop()); // Siguiente en la pila
        assertNull(pila.pop()); // Pila vacía
    }

    @Test
    void testIsEmpty() {
        Pila<String> pila = new Pila<>();

        assertTrue(pila.isEmpty());
        pila.push("Hola");
        assertFalse(pila.isEmpty());
        pila.pop();
        assertTrue(pila.isEmpty());
    }

    @Test
    void testPopOnEmptyPila() {
        Pila<Double> pila = new Pila<>();
        assertNull(pila.pop()); // Retorna null cuando la pila está vacía
    }
}
