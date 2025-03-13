package ListasBasicas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ListaInterfaceTest {

    @Test
    void addElemento() {
        ListaInterface<String> lista = new Lista<>();
        assertTrue(lista.add("Elemento1"));
        assertTrue(lista.add("Elemento2"));

        assertEquals(2, lista.getSize());
        assertEquals("Elemento1", lista.obtener(0));
        assertEquals("Elemento2", lista.obtener(1));
    }

    @Test
    void deleteElemento() {
        ListaInterface<String> lista = new Lista<>();
        lista.add("Elemento1");
        lista.add("Elemento2");

        assertTrue(lista.delete("Elemento1")); // Debería eliminar "Elemento1"
        assertEquals(1, lista.getSize());
        assertEquals("Elemento2", lista.obtener(0));

        assertFalse(lista.delete("ElementoInexistente")); // No existe el elemento
        assertEquals(1, lista.getSize());
    }

    @Test
    void getIterador() {
        ListaInterface<String> lista = new Lista<>();
        lista.add("Uno");
        lista.add("Dos");

        Iterador<String> iterador = lista.getIterador();
        assertNotNull(iterador);
        assertTrue(iterador.hasNext());
        assertEquals("Uno", iterador.next());
        assertEquals("Dos", iterador.next());
        assertFalse(iterador.hasNext());
    }

    @Test
    void obtenerPorIndice() {
        ListaInterface<Integer> lista = new Lista<>();
        lista.add(10);
        lista.add(20);

        assertEquals(10, lista.obtener(0));
        assertEquals(20, lista.obtener(1));
        assertNull(lista.obtener(2)); // Índice fuera de los límites
    }

    @Test
    void setSize() {
        ListaInterface<Integer> lista = new Lista<>();
        lista.add(1);
        lista.add(2);

        lista.setSize(1); // Reducimos el tamaño manualmente
        assertEquals(1, lista.getSize());
        assertEquals(1, lista.obtener(0));
        assertNull(lista.obtener(1)); // El elemento en el índice 1 ya no debería existir

        lista.setSize(3); // Ampliamos el tamaño; los nuevos índices no contienen elementos
        assertEquals(3, lista.getSize());
        assertNull(lista.obtener(2)); // Índice vacío después de ampliar
    }
}
