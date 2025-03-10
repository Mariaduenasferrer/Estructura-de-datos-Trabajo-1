package ListasSimplementeEnlazadas;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @Test
    void main() {
    }
    @Test
    void testLista() {
        Lista<Integer> lista = new Lista<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.delete(20);
        List<Integer> resultado = new ArrayList<>();
        Iterador<Integer> iterador = (Iterador<Integer>) lista.getIterador();
        while (iterador.hasNext()) {
            resultado.add(iterador.next());
        }
        assertEquals(List.of(30, 10), resultado);
    }
}