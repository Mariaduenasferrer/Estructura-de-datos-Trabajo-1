package PilasyColas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPilayColaTest {

    @org.junit.jupiter.api.Test
    void main() {
    }
    @Test
    void testPilaYCola() {
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        assertEquals(2, pila.pop());

        Cola<Integer> cola = new Cola<>();
        cola.enqueue(10);
        cola.enqueue(20);
        assertEquals(10, cola.dequeue());
    }

}