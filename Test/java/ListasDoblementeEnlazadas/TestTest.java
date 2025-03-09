package ListasDoblementeEnlazadas;

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
        lista.add(5);
        lista.add(15);
        lista.add(25);
        lista.delete(15);
        List<Integer> resultado = new ArrayList<>();
        Iterador<Integer> iterador = (Iterador<Integer>) lista.getIterador();
        while (iterador.hasNext()) {
            resultado.add(iterador.next());
        }
        assertEquals(List.of(5, 25), resultado);
    }
}