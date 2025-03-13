package ListasBasicas;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @Test
    void testLista() {
        // Inicializamos la lista
        Lista<Integer> lista = new Lista<>();

        // Añadimos elementos a la lista
        lista.add(1); // Añadimos 1
        lista.add(2); // Añadimos 2
        lista.add(3); // Añadimos 3

        // Verificamos el tamaño inicial de la lista
        assertEquals(3, lista.getSize(), "El tamaño de la lista debería ser 3 después de añadir 3 elementos.");

        // Eliminamos el elemento "2"
        lista.delete(2);

        // Verificamos el tamaño después de la eliminación
        assertEquals(2, lista.getSize(), "El tamaño de la lista debería ser 2 después de eliminar un elemento.");

        // Creamos un iterador para recorrer la lista
        List<Integer> resultado = new ArrayList<>();
        Iterador<Integer> iterador = lista.getIterador();
        while (iterador.hasNext()) {
            resultado.add(iterador.next()); // Añadimos los elementos recorridos al resultado
        }

        // Verificamos que el contenido de la lista sea el esperado
        assertEquals(List.of(1, 3), resultado, "El contenido de la lista debería ser [1, 3] después de eliminar el elemento 2.");
    }

    @Test
    void testIterador() {
        // Inicializamos la lista
        Lista<Integer> lista = new Lista<>();
        lista.add(1); // Añadimos 1
        lista.add(2); // Añadimos 2
        lista.add(3); // Añadimos 3

        // Creamos un iterador y avanzamos
        Iterador<Integer> iterador = lista.getIterador();
        assertTrue(iterador.hasNext(), "El iterador debería tener al menos un elemento.");
        assertEquals(1, iterador.next(), "El primer elemento del iterador debería ser 1.");

        // Eliminamos el primer elemento a través del iterador
        iterador.delete();

        // Verificamos el tamaño de la lista después de la eliminación
        assertEquals(2, lista.getSize(), "El tamaño de la lista debería ser 2 después de eliminar un elemento a través del iterador.");

        // Verificamos el contenido actualizado de la lista
        List<Integer> resultado = new ArrayList<>();
        iterador = lista.getIterador(); // Obtenemos un nuevo iterador para recorrer la lista actualizada
        while (iterador.hasNext()) {
            resultado.add(iterador.next());
        }

        assertEquals(List.of(2, 3), resultado, "El contenido de la lista debería ser [2, 3] después de eliminar el primer elemento.");
    }
}
