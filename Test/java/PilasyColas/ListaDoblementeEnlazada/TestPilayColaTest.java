package PilasyColas.ListaDoblementeEnlazada;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestPilayCola {

    @Test
    void testPila() {
        // Prueba de la Pila
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);

        // Verificar que el último elemento es el esperado (LIFO)
        Integer resultadoPop = pila.pop();
        assertNotNull(resultadoPop);
        assertEquals(2, resultadoPop); // Debe ser el último elemento agregado

        // Verificar el siguiente elemento
        resultadoPop = pila.pop();
        assertNotNull(resultadoPop);
        assertEquals(1, resultadoPop); // Debe ser el segundo elemento

        // Verificar que la pila está vacía
        assertTrue(pila.isEmpty());
        assertNull(pila.pop()); // Intentar extraer de una pila vacía
    }

    @Test
    void testCola() {
        // Prueba de la Cola
        Cola<Integer> cola = new Cola<>();
        cola.enqueue(10);
        cola.enqueue(20);

        // Verificar que el primer elemento es el esperado (FIFO)
        Integer resultadoDequeue = cola.dequeue();
        assertNotNull(resultadoDequeue);
        assertEquals(10, resultadoDequeue); // Debe ser el primer elemento agregado

        // Verificar el siguiente elemento
        resultadoDequeue = cola.dequeue();
        assertNotNull(resultadoDequeue);
        assertEquals(20, resultadoDequeue); // Debe ser el segundo elemento

        // Verificar que la cola está vacía
        assertTrue(cola.isEmpty());
        assertNull(cola.dequeue()); // Intentar extraer de una cola vacía
    }
}
