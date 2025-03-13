package PilasyColas.ListaSimplementeEnlazada;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PilaTest {

    @Test
    void testPushAndPopSingle() {
        Pila<Integer> pila = new Pila<>();
        pila.push(42);

        // Verificar la cima después del push
        assertEquals(42, pila.peek(), "La cima debería ser 42 después de un push");
        // Verificar el pop
        assertEquals(42, pila.pop(), "El pop debería devolver 42");
        // Verificar que está vacía
        assertTrue(pila.isEmpty(), "La pila debería estar vacía después de un pop");
    }

    @Test
    void testPushDuplicateElements() {
        Pila<Integer> pila = new Pila<>();
        pila.push(5);
        pila.push(5);
        pila.push(5);

        // Verificar el tamaño
        assertEquals(3, pila.size(), "El tamaño debería ser 3 al agregar tres elementos iguales");

        // Verificar que se eliminan en orden LIFO
        assertEquals(5, pila.pop(), "El primer pop debería devolver 5");
        assertEquals(5, pila.pop(), "El segundo pop debería devolver 5");
        assertEquals(5, pila.pop(), "El tercer pop debería devolver 5");

        // Verificar que está vacía
        assertTrue(pila.isEmpty(), "La pila debería estar vacía después de eliminar todo");
    }

    @Test
    void testPushPopThenPush() {
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        pila.pop(); // Elimina 2

        pila.push(3);

        // Verificar la cima después de agregar un nuevo elemento
        assertEquals(3, pila.peek(), "La cima debería ser 3 después de eliminar y agregar");
        // Verificar el tamaño
        assertEquals(2, pila.size(), "El tamaño debería ser 2 después de estas operaciones");
    }
}


