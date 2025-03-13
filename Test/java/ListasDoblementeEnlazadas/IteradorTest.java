package ListasDoblementeEnlazadas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IteradorTest {

    @Test
    void hasNext() {
        Lista<String> lista = new Lista<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");

        Iterador<String> iterador = new Iterador<>(lista);

        assertTrue(iterador.hasNext()); // La lista no está vacía
        iterador.next();
        iterador.next();
        iterador.next();
        assertFalse(iterador.hasNext()); // Se alcanzó el final de la lista
    }

    @Test
    void next() {
        Lista<Integer> lista = new Lista<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        Iterador<Integer> iterador = new Iterador<>(lista);

        assertEquals(1, iterador.next()); // Primer elemento
        assertEquals(2, iterador.next()); // Segundo elemento
        assertEquals(3, iterador.next()); // Tercer elemento
        assertNull(iterador.next()); // No quedan más elementos
    }

    @Test
    void delete() {
        Lista<String> lista = new Lista<>();
        lista.add("X");
        lista.add("Y");
        lista.add("Z");

        Iterador<String> iterador = new Iterador<>(lista);

        iterador.next(); // Apuntamos al primer elemento ("X")
        iterador.delete(); // Eliminamos "X"
        assertEquals("Y", lista.getcabeza()); // Nuevo cabeza es "Y"

        iterador.next(); // Apuntamos al siguiente ("Y")
        iterador.delete(); // Eliminamos "Y"
        assertEquals("Z", lista.getcabeza()); // Nuevo cabeza es "Z"

        iterador.next(); // Apuntamos al último elemento ("Z")
        iterador.delete(); // Eliminamos "Z"
        assertNull(lista.getcabeza()); // Lista vacía
    }
}

