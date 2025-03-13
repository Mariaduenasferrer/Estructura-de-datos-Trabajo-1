package ListasSimplementeEnlazadas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElementoTest {

    @Test
    void getDato() {
        // Crear un elemento con un valor inicial
        Elemento<Integer> elemento = new Elemento<>(10);

        // Verificar que el método getDato() devuelve el valor correcto
        assertEquals(10, elemento.getDato(), "El método getDato() debería devolver 10.");
    }

    @Test
    void setDato() {
        // Crear un elemento con un valor inicial
        Elemento<String> elemento = new Elemento<>("Inicio");

        // Establecer un nuevo valor para el dato
        elemento.setDato("NuevoInicio");

        // Verificar que el dato se haya actualizado correctamente
        assertEquals("NuevoInicio", elemento.getDato(), "El método setDato() debería actualizar el valor a 'NuevoInicio'.");
    }

    @Test
    void getSiguiente() {
        // Crear un elemento
        Elemento<Double> elemento = new Elemento<>(5.5);

        // Verificar que inicialmente el siguiente es null
        assertNull(elemento.getSiguiente(), "El siguiente de un nuevo elemento debería ser null.");
    }

    @Test
    void setSiguiente() {
        // Crear dos elementos
        Elemento<Integer> elemento1 = new Elemento<>(1);
        Elemento<Integer> elemento2 = new Elemento<>(2);

        // Establecer elemento2 como siguiente de elemento1
        elemento1.setSiguiente(elemento2);

        // Verificar que el metodo setSiguiente() ha establecido correctamente el siguiente
        assertNotNull(elemento1.getSiguiente(), "El método setSiguiente() debería establecer el siguiente elemento.");
        assertEquals(elemento2, elemento1.getSiguiente(), "El método getSiguiente() debería devolver el elemento correcto.");
        assertEquals(2, elemento1.getSiguiente().getDato(), "El método getSiguiente() debería devolver un elemento con el dato 2.");
    }
}
