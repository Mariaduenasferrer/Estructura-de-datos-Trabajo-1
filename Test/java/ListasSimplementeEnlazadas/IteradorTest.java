package ListasSimplementeEnlazadas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteradorTest {

    private Elemento<Integer> cabeza; // Lista simplemente enlazada
    private Iterador<Integer> iterador; // Iterador para recorrer y manipular la lista

    @BeforeEach
    void setUp() {
        // Crear manualmente una lista simplemente enlazada
        cabeza = new Elemento<>(1); // Primer nodo con valor 1
        cabeza.setSiguiente(new Elemento<>(2)); // Segundo nodo con valor 2
        cabeza.getSiguiente().setSiguiente(new Elemento<>(3)); // Tercer nodo con valor 3

        // Inicializar el iterador con la cabeza de la lista
        iterador = new Iterador<>(cabeza);
    }

    @Test
    void testHasNext() {
        // Comprobar que hasNext devuelve true mientras queden elementos
        assertTrue(iterador.hasNext());

        // Avanzar al siguiente nodo hasta que no queden más
        iterador.next();
        iterador.next();
        iterador.next();

        // Comprobar que hasNext devuelve false después de recorrer todos los nodos
        assertFalse(iterador.hasNext());
    }

    @Test
    void testNext() {
        // Comprobar que los valores se devuelven en el orden correcto
        assertEquals(1, iterador.next()); // Primer nodo
        assertEquals(2, iterador.next()); // Segundo nodo
        assertEquals(3, iterador.next()); // Tercer nodo

        // Comprobar que devuelve null cuando no hay más nodos
        assertNull(iterador.next());
    }

    @Test
    void testDeleteHead() {
        iterador.next(); // Avanzar al primer nodo
        iterador.delete(); // Eliminar el primer nodo

        // Verificar que la nueva cabeza tiene el valor 2
        Elemento<Integer> nuevaCabeza = iterador.getCabeza();
        assertEquals(2, nuevaCabeza.getDato());

        // Comprobar que el segundo nodo ahora es el tercero original
        assertEquals(3, nuevaCabeza.getSiguiente().getDato());
    }

    @Test
    void testDeleteMiddle() {
        iterador.next(); // Primer nodo
        iterador.next(); // Segundo nodo
        iterador.delete(); // Eliminar el segundo nodo

        // Verificar que el primer nodo apunta directamente al tercero
        Elemento<Integer> nuevaCabeza = iterador.getCabeza();
        assertEquals(1, nuevaCabeza.getDato());
        assertEquals(3, nuevaCabeza.getSiguiente().getDato());

        // Comprobar que no hay más nodos después del tercero
        assertNull(nuevaCabeza.getSiguiente().getSiguiente());
    }

    @Test
    void testDeleteLast() {
        iterador.next(); // Primer nodo
        iterador.next(); // Segundo nodo
        iterador.next(); // Tercer nodo (último nodo)
        iterador.delete(); // Eliminar el último nodo

        // Verificar que el siguiente del segundo nodo es null
        Elemento<Integer> nuevaCabeza = iterador.getCabeza();
        assertEquals(1, nuevaCabeza.getDato());
        assertEquals(2, nuevaCabeza.getSiguiente().getDato());
        assertNull(nuevaCabeza.getSiguiente().getSiguiente());
    }
}
