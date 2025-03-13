package ListasBasicas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IteradorInterfaceTest {

    @Test
    void hasNext() {
        // Crear una lista con elementos
        Lista<String> lista = new Lista<>();
        lista.add("Elemento1");
        lista.add("Elemento2");

        // Obtener el iterador
        IteradorInterface<String> iterador = lista.getIterador();

        // Comprobar si hay más elementos en la lista
        assertTrue(iterador.hasNext());
        iterador.next(); // Avanzar en el iterador
        assertTrue(iterador.hasNext());
        iterador.next(); // Avanzar al último elemento
        assertFalse(iterador.hasNext()); // No hay más elementos
    }

    @Test
    void next() {
        // Crear una lista con elementos
        Lista<String> lista = new Lista<>();
        lista.add("Primero");
        lista.add("Segundo");

        // Obtener el iterador
        IteradorInterface<String> iterador = lista.getIterador();

        // Probar el metodo next
        assertEquals("Primero", iterador.next());
        assertEquals("Segundo", iterador.next());
    }

    @Test
    void delete() {
        // Crear una lista con elementos
        Lista<String> lista = new Lista<>();
        lista.add("EliminarEste");
        lista.add("MantenerEste");

        // Obtener el iterador
        IteradorInterface<String> iterador = lista.getIterador();

        iterador.next(); // Apuntar al primer elemento
        iterador.delete(); // Eliminar el elemento actual

        // Comprobaciones
        assertEquals(1, lista.getSize()); // El tamaño de la lista debe reducirse
        assertEquals("MantenerEste", lista.obtener(0)); // El nuevo primer elemento debe ser "MantenerEste"

        iterador.delete(); // Llamada inválida, no debe realizar ninguna acción
        assertEquals(1, lista.getSize()); // Asegurarse de que el tamaño no cambie
    }
}

