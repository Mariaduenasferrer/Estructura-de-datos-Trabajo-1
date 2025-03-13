package PilasyColas.ListaDoblementeEnlazada;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ColaTest {

    @Test
    public void testCola() {
        // Crear una cola
        Cola<Integer> cola = new Cola<>();

        // Comprobar que la cola está vacía al inicio
        assertTrue(cola.isEmpty(), "La cola debería estar vacía al inicio");
        assertEquals(0, cola.size(), "El tamaño de la cola debería ser 0 al inicio");

        // Agregar elementos a la cola
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        // Verificar que la cola ya no está vacía
        assertFalse(cola.isEmpty(), "La cola no debería estar vacía después de agregar elementos");
        assertEquals(3, cola.size(), "El tamaño de la cola debería ser 3");

        // Desencolar y verificar el elemento eliminado
        assertEquals(10, cola.dequeue(), "El primer elemento eliminado debería ser 10");
        assertEquals(2, cola.size(), "El tamaño de la cola debería ser 2 después de eliminar un elemento");

        // Desencolar el siguiente elemento
        assertEquals(20, cola.dequeue(), "El siguiente elemento eliminado debería ser 20");
        assertEquals(1, cola.size(), "El tamaño de la cola debería ser 1 después de otra eliminación");

        // Verificar el último elemento
        assertEquals(30, cola.dequeue(), "El último elemento eliminado debería ser 30");
        assertTrue(cola.isEmpty(), "La cola debería estar vacía después de eliminar todos los elementos");
        assertEquals(0, cola.size(), "El tamaño de la cola debería ser 0 al final");

        // Intentar desencolar de una cola vacía
        assertNull(cola.dequeue(), "Debería retornar null al desencolar de una cola vacía");
    }
}
