package Diccionarios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class DiccionarioOrdenadoTest {

    @Test
    void testAdd() {
        DiccionarioOrdenado<String, Integer> diccionario = new DiccionarioOrdenado<>();
        ElementoDiccionario<String, Integer> elemento = new ElementoDiccionario<>("clave1", 10);

        diccionario.add(elemento);

        Iterador<ElementoDiccionario<String, Integer>> iterador = diccionario.getIterador();
        assertTrue(iterador.hasNext());
        assertEquals(elemento, iterador.next());
    }

    @Test
    void testDelete() {
        DiccionarioOrdenado<String, Integer> diccionario = new DiccionarioOrdenado<>();
        ElementoDiccionario<String, Integer> elemento1 = new ElementoDiccionario<>("clave1", 10);
        ElementoDiccionario<String, Integer> elemento2 = new ElementoDiccionario<>("clave2", 20);

        diccionario.add(elemento1);
        diccionario.add(elemento2);
        diccionario.delete(elemento1);

        Iterador<ElementoDiccionario<String, Integer>> iterador = diccionario.getIterador();
        assertTrue(iterador.hasNext());
        assertEquals(elemento2, iterador.next());
        assertFalse(iterador.hasNext());
    }

    @Test
    void testGetIterador() {
        DiccionarioOrdenado<String, Integer> diccionario = new DiccionarioOrdenado<>();
        ElementoDiccionario<String, Integer> elemento1 = new ElementoDiccionario<>("clave1", 10);
        ElementoDiccionario<String, Integer> elemento2 = new ElementoDiccionario<>("clave2", 20);

        diccionario.add(elemento1);
        diccionario.add(elemento2);

        Iterador<ElementoDiccionario<String, Integer>> iterador = diccionario.getIterador();
        assertTrue(iterador.hasNext());
        assertEquals(elemento1, iterador.next());
        assertTrue(iterador.hasNext());
        assertEquals(elemento2, iterador.next());
        assertFalse(iterador.hasNext());
    }
}

