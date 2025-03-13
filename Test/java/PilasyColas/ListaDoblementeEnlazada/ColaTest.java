package PilasyColas.ListaDoblementeEnlazada;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ColaTest {

    @Test
    void enqueue() {
        Cola<Integer> cola = new Cola<>();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        assertEquals(3, cola.size()); // Verifica que se agregaron 3 elementos
        assertFalse(cola.isEmpty()); // Verifica que la cola no está vacía
    }

    @Test
    void dequeue() {
        Cola<Integer> cola = new Cola<>();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        assertEquals(10, cola.dequeue()); // Extrae el primer elemento
        assertEquals(20, cola.dequeue()); // Extrae el siguiente
        assertEquals(1, cola.size()); // Verifica que queda un solo elemento en la cola
    }

    @Test
    void dequeueEmptyQueue() {
        Cola<Integer> cola = new Cola<>();

        assertNull(cola.dequeue()); // Verifica que extraer de una cola vacía retorna null
        assertTrue(cola.isEmpty()); // Verifica que la cola sigue vacía
    }

    @Test
    void isEmpty() {
        Cola<Integer> cola = new Cola<>();
        assertTrue(cola.isEmpty()); // Verifica que la cola está vacía inicialmente

        cola.enqueue(10);
        assertFalse(cola.isEmpty()); // Verifica que ya no está vacía después de agregar un elemento

        cola.dequeue();
        assertTrue(cola.isEmpty()); // Verifica que está vacía nuevamente después de eliminar el único elemento
    }

    @Test
    void size() {
        Cola<Integer> cola = new Cola<>();
        assertEquals(0, cola.size()); // Verifica que el tamaño inicial es 0

        cola.enqueue(10);
        cola.enqueue(20);
        assertEquals(2, cola.size()); // Verifica que el tamaño es 2 después de agregar dos elementos

        cola.dequeue();
        assertEquals(1, cola.size()); // Verifica que el tamaño es 1 después de eliminar un elemento
    }
}

