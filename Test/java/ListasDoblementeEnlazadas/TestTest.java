package ListasDoblementeEnlazadas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestTest {

    @Test
    void testLista() {
        Lista<Integer> lista = new Lista<>();

        // Añadir elementos
        lista.add(1);
        lista.add(2);
        lista.add(3);

        // Verificar tamaño inicial
        assertEquals(3, lista.getSize(), "El tamaño inicial debería ser 3");

        // Verificar contenido con iterador
        Iterador<Integer> iterador = (Iterador<Integer>) lista.getIterador();
        assertTrue(iterador.hasNext(), "El iterador debería tener elementos");
        assertEquals(1, iterador.next(), "El primer elemento debería ser 1");
        assertEquals(2, iterador.next(), "El segundo elemento debería ser 2");
        assertEquals(3, iterador.next(), "El tercer elemento debería ser 3");

        // Eliminar un elemento
        lista.delete(2);

        // Verificar tamaño después de eliminar
        assertEquals(2, lista.getSize(), "El tamaño después de eliminar debería ser 2");

        // Verificar contenido nuevamente
        iterador = (Iterador<Integer>) lista.getIterador();
        assertEquals(1, iterador.next(), "El primer elemento después de eliminar debería ser 1");
        assertEquals(3, iterador.next(), "El segundo elemento después de eliminar debería ser 3");
    }
}
