package ListasBasicas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IteradorTest {

    @Test
    void hasNext() {
        Lista<String> lista = new Lista<>();
        lista.add("Primero");
        lista.add("Segundo");
        lista.add("Tercero");

        Iterador<String> iterador = new Iterador<>(lista);

        assertTrue(iterador.hasNext());
        iterador.next();
        assertTrue(iterador.hasNext());
        iterador.next();
        iterador.next();
        assertFalse(iterador.hasNext()); // Ya no quedan elementos
    }

    @Test
    void next() {
        Lista<String> lista = new Lista<>();
        lista.add("Primero");
        lista.add("Segundo");

        Iterador<String> iterador = new Iterador<>(lista);

        assertEquals("Primero", iterador.next());
        assertEquals("Segundo", iterador.next());
        assertNull(iterador.next()); // No hay más elementos, debería devolver null
    }

    @Test
    void delete() {
        Lista<String> lista = new Lista<>();
        lista.add("Primero");
        lista.add("Segundo");
        lista.add("Tercero");

        Iterador<String> iterador = new Iterador<>(lista);

        iterador.next(); // Ahora estamos en "Primero"
        iterador.delete(); // Eliminamos "Primero"

        assertEquals(2, lista.getSize());
        assertEquals("Segundo", lista.obtener(0));
        assertEquals("Tercero", lista.obtener(1));
    }
    @Test
    void deleteAtLastIndex() {
        Lista<String> lista = new Lista<>();
        lista.add("Primero");
        lista.add("Segundo");
        lista.add("Tercero");

        Iterador<String> iterador = new Iterador<>(lista);
        iterador.next();
        iterador.next();
        iterador.next(); // Ahora estamos en "Tercero"
        iterador.delete(); // Eliminamos "Tercero"

        assertEquals(2, lista.getSize());
        assertNull(lista.obtener(2)); // El último índice debería ser null
    }

    @Test
    void deleteOutOfBounds() {
        Lista<String> lista = new Lista<>();
        lista.add("Primero");

        Iterador<String> iterador = new Iterador<>(lista);

        iterador.next();
        iterador.delete();
        iterador.delete();

        assertEquals(0, lista.getSize());
        assertNull(lista.obtener(0));
    }


}

