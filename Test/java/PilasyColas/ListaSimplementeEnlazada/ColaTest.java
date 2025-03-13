package PilasyColas.ListaSimplementeEnlazada;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ColaTest {

    private Cola<String> cola;

    @BeforeEach
    void setUp() {
        cola = new Cola<>(); // Inicializa una nueva instancia de Cola antes de cada prueba
    }

    @Test
    void testEnqueue() {
        Cola<Integer> cola = new Cola<>();
        cola.enqueue(5); // Agregar un elemento

        assertEquals(5, cola.cola); // La cola debe ser el primer elemento agregado
        assertEquals(5, cola.cabeza); // La cabeza también debe ser el único elemento
    }


    @Test
    void testDequeue() {
        Cola<String> cola = new Cola<>();
        cola.enqueue("A");
        cola.enqueue("B");
        cola.enqueue("C");

        String elementoEliminado = cola.dequeue();
        assertEquals("A", elementoEliminado); // El primer elemento en salir debe ser el primero en entrar

        assertEquals("A", cola.cola); // La cola debe actualizarse al siguiente elemento
    }
}


