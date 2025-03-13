package Diccionarios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestTest {

    @Test
    public void testDiccionario() {
        // Crear un diccionario ordenado
        Diccionario<String, Integer> diccionario = new DiccionarioOrdenado<>();

        // Agregar elementos al diccionario
        diccionario.add(new ElementoDiccionario<>("a", 1));
        diccionario.add(new ElementoDiccionario<>("b", 2));

        // Eliminar un elemento del diccionario
        diccionario.delete(new ElementoDiccionario<>("a", 1));

        // Obtener el iterador
        Iterador<ElementoDiccionario<String, Integer>> iterador = diccionario.getIterador();

        // Aserciones
        assertTrue(iterador.hasNext(), "El iterador debería tener al menos un elemento.");
        assertEquals("b", iterador.next().getClave(), "La clave del siguiente elemento debería ser 'b'.");
    }
}
