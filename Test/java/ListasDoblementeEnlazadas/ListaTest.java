package ListasDoblementeEnlazadas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListaTest {

    private Lista<Integer> lista;

    @BeforeEach
    public void setUp() {
        lista = new Lista<>();
    }

    @Test
    public void testAdd() {
        assertTrue(lista.add(1), "El elemento 1 debería ser añadido correctamente");
        assertTrue(lista.add(2), "El elemento 2 debería ser añadido correctamente");
        assertTrue(lista.add(3), "El elemento 3 debería ser añadido correctamente");

        assertEquals(3, lista.getSize(), "El tamaño de la lista debería ser 3");
        assertEquals(1, lista.getcabeza(), "La cabeza de la lista debería ser 1");
        assertEquals(3, lista.getcola(), "La cola de la lista debería ser 3");
    }

    @Test
    public void testDeleteCabeza() {
        lista.add(1);
        lista.add(2);
        lista.add(3);

        assertTrue(lista.delete(1), "El elemento 1 (cabeza) debería ser eliminado correctamente");
        assertEquals(2, lista.getcabeza(), "La nueva cabeza de la lista debería ser 2");
        assertEquals(3, lista.getcola(), "La cola de la lista debería seguir siendo 3");
        assertEquals(2, lista.getSize(), "El tamaño de la lista debería ser 2 después de eliminar");
    }

    @Test
    public void testDeleteCola() {
        lista.add(1);
        lista.add(2);
        lista.add(3);

        assertTrue(lista.delete(3), "El elemento 3 (cola) debería ser eliminado correctamente");
        assertEquals(1, lista.getcabeza(), "La cabeza de la lista debería seguir siendo 1");
        assertEquals(2, lista.getcola(), "La nueva cola de la lista debería ser 2");
        assertEquals(2, lista.getSize(), "El tamaño de la lista debería ser 2 después de eliminar");
    }

    @Test
    public void testDeleteIntermedio() {
        lista.add(1);
        lista.add(2);
        lista.add(3);

        assertTrue(lista.delete(2), "El elemento 2 (intermedio) debería ser eliminado correctamente");
        assertEquals(1, lista.getcabeza(), "La cabeza de la lista debería seguir siendo 1");
        assertEquals(3, lista.getcola(), "La cola de la lista debería seguir siendo 3");
        assertEquals(2, lista.getSize(), "El tamaño de la lista debería ser 2 después de eliminar");
    }

    @Test
    public void testDeleteElementoInexistente() {
        lista.add(1);
        lista.add(2);
        lista.add(3);

        assertFalse(lista.delete(4), "Intentar eliminar un elemento inexistente debería devolver false");
        assertEquals(3, lista.getSize(), "El tamaño de la lista debería permanecer en 3");
    }

    @Test
    public void testDeleteEnListaVacia() {
        assertFalse(lista.delete(1), "Intentar eliminar en una lista vacía debería devolver false");
        assertEquals(0, lista.getSize(), "El tamaño de la lista debería seguir siendo 0");
    }

    @Test
    public void testSetCabeza() {
        lista.add(1);
        lista.add(2);
        lista.setCabeza(0);

        assertEquals(0, lista.getcabeza(), "La cabeza de la lista debería actualizarse correctamente a 0");
    }

    @Test
    public void testSetCola() {
        lista.add(1);
        lista.add(2);
        lista.setCola(3);

        assertEquals(3, lista.getcola(), "La cola de la lista debería actualizarse correctamente a 3");
    }

    @Test
    public void testListaVacia() {
        assertEquals(0, lista.getSize(), "El tamaño inicial de la lista debería ser 0");
        assertNull(lista.getcabeza(), "La cabeza de la lista vacía debería ser null");
        assertNull(lista.getcola(), "La cola de la lista vacía debería ser null");
    }
}


