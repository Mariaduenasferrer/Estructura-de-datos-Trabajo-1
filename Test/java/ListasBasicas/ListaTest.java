package ListasBasicas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ListaTest {

    @Test
    void add() {
        Lista<String> lista = new Lista<>();
        lista.add("Hola");
        lista.add("Mundo");

        assertEquals(2, lista.getSize());
        assertEquals("Hola", lista.obtener(0));
        assertEquals("Mundo", lista.obtener(1));
    }

    @Test
    void delete() {
        Lista<String> lista = new Lista<>();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Java");

        boolean eliminado = lista.delete("Mundo");

        assertTrue(eliminado);
        assertEquals(2, lista.getSize());
        assertEquals("Java", lista.obtener(1));
    }

    @Test
    void getIterador() {
        Lista<String> lista = new Lista<>();
        lista.add("Uno");
        lista.add("Dos");

        Iterador<String> iterador = lista.getIterador();

        assertNotNull(iterador);
        assertTrue(iterador.hasNext());
        assertEquals("Uno", iterador.next());
    }

    @Test
    void getSize() {
        Lista<Integer> lista = new Lista<>();
        lista.add(1);
        lista.add(2);

        assertEquals(2, lista.getSize());
    }

    @Test
    void setSize() {
        Lista<Integer> lista = new Lista<>();
        lista.add(1);
        lista.add(2);
        lista.setSize(1);

        assertEquals(1, lista.getSize());
    }

    @Test
    void getcabeza() {
        Lista<String> lista = new Lista<>();
        lista.add("Inicio");
        lista.add("Medio");

        assertEquals("Inicio", lista.getCabeza());
    }

    @Test
    void setCabeza() {
        Lista<String> lista = new Lista<>();
        lista.add("Inicio");

        lista.setCabeza("NuevoInicio"); // Actualizamos la cabeza

        assertEquals("NuevoInicio", lista.getCabeza()); // La nueva cabeza debería reflejar el cambio
    }

    @Test
    void getcola() {

        Lista<String> lista = new Lista<>();
        lista.add("Primero");
        lista.add("Ultimo");

        assertEquals("Ultimo", lista.getCola()); // La "cola" debería ser el último elemento
    }


    @Test
    void setCola() {
        Lista<String> lista = new Lista<>();
        lista.add("Primero");

        lista.setCola("NuevoUltimo"); // Cambiamos la cola

        assertEquals("NuevoUltimo", lista.getCola());
    }
}