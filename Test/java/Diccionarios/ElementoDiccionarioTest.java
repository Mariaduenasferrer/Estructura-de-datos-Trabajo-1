package Diccionarios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ElementoDiccionarioTest {

    @Test
    public void testElementoDiccionario() {
        // Crear un objeto ElementoDiccionario
        String clave = "clave1";
        Integer valor = 100;
        ElementoDiccionario<String, Integer> elemento = new ElementoDiccionario<>(clave, valor);

        // Verificar que la clave es correcta
        assertEquals(clave, elemento.getClave(), "La clave no coincide");

        // Verificar que el valor es correcto
        assertEquals(valor, elemento.getValor(), "El valor no coincide");
    }
}
