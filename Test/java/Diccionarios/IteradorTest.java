package Diccionarios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class IteradorTest {

    @Test
    void testHasNextAndNext() {
        List<String> elementos = Arrays.asList("elemento1", "elemento2", "elemento3");
        Iterador<String> iterador = new Iterador<>(elementos);

        assertTrue(iterador.hasNext());
        assertEquals("elemento1", iterador.next());
        assertTrue(iterador.hasNext());
        assertEquals("elemento2", iterador.next());
        assertTrue(iterador.hasNext());
        assertEquals("elemento3", iterador.next());
        assertFalse(iterador.hasNext());
    }

    @Test
    void testEmptyList() {
        List<String> elementos = Arrays.asList();
        Iterador<String> iterador = new Iterador<>(elementos);

        assertFalse(iterador.hasNext());
    }
}
