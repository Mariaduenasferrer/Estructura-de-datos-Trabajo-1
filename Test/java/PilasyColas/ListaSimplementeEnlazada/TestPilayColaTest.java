package PilasyColas.ListaSimplementeEnlazada;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestPilayColaTest {

    @Test
    void testPila() {
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);

        // Verificar que el último elemento es el correcto
        assertEquals(2, pila.pop(), "El pop de la pila debería devolver 2");
    }

    @Test
    void testCola() {
        Cola<Integer> cola = new Cola<>();
        cola.enqueue(10);
        cola.enqueue(20);

        // Verificar que el primer elemento es el correcto
        assertEquals(10, cola.dequeue(), "El dequeue de la cola debería devolver 10");
    }
}


