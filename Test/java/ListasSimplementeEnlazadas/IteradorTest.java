package ListasSimplementeEnlazadas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IteradorTest {

    @Test
    void hasNext() {
        // Crear nodos
        Elemento<Integer> elemento1 = new Elemento<>(1);
        Elemento<Integer> elemento2 = new Elemento<>(2);
        elemento1.setSiguiente(elemento2); // Enlazar los elementos

        // Crear el iterador
        Iterador<Integer> iterador = new Iterador<>(elemento1);

        // Validar que tiene elementos
        assertTrue(iterador.hasNext());
        iterador.next(); // Avanzar al siguiente elemento
        assertTrue(iterador.hasNext());
        iterador.next(); // Avanzar al siguiente elemento
        assertFalse(iterador.hasNext()); // Ya no hay más elementos
    }

    @Test
    void next() {
        // Crear nodos
        Elemento<Integer> elemento1 = new Elemento<>(1);
        Elemento<Integer> elemento2 = new Elemento<>(2);
        Elemento<Integer> elemento3 = new Elemento<>(3);
        elemento1.setSiguiente(elemento2); // Enlazar los elementos
        elemento2.setSiguiente(elemento3);

        // Crear el iterador
        Iterador<Integer> iterador = new Iterador<>(elemento1);

        // Validar que los elementos se retornan en orden
        assertEquals(1, iterador.next());
        assertEquals(2, iterador.next());
        assertEquals(3, iterador.next());
        assertNull(iterador.next()); // No hay más elementos
    }

    @Test
    void delete() {
        // Crear nodos
        Elemento<Integer> elemento1 = new Elemento<>(1);
        Elemento<Integer> elemento2 = new Elemento<>(2);
        Elemento<Integer> elemento3 = new Elemento<>(3);
        elemento1.setSiguiente(elemento2);
        elemento2.setSiguiente(elemento3);

        // Crear el iterador
        Iterador<Integer> iterador = new Iterador<>(elemento1);

        // Eliminar la cabeza
        iterador.delete();
        assertEquals(2, iterador.getCabeza().getDato()); // Nueva cabeza es 2

        // Avanzar y eliminar el siguiente nodo
        iterador.next(); // Avanzar al nodo 2
        iterador.delete(); // Eliminar nodo 2
        assertEquals(2, iterador.getCabeza().getDato()); // Nueva cabeza es 3

        // Intentar eliminar el último nodo
        iterador.delete();
        assertNull(iterador.getCabeza().getSiguiente()); // Nodo 3 ya no tiene sucesor
        assertNull(iterador.next()); // No hay más elementos
    }


    @Test
    void getCabeza() {
        // Crear nodos
        Elemento<Integer> elemento1 = new Elemento<>(1);
        Elemento<Integer> elemento2 = new Elemento<>(2);
        elemento1.setSiguiente(elemento2); // Enlazar los elementos

        // Crear el iterador
        Iterador<Integer> iterador = new Iterador<>(elemento1);

        // Validar la cabeza inicial
        assertEquals(1, iterador.getCabeza().getDato());

        // Eliminar la cabeza y validar la nueva cabeza
        iterador.delete();
        assertEquals(2, iterador.getCabeza().getDato());
    }
}
