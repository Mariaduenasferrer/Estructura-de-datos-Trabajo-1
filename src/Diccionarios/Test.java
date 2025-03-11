package Diccionarios;

public class Test {

    public static boolean assertTrue(boolean condition) {
        if (!condition) {
            System.out.println("Assertion failed: condition is false.");
            return false;
        }
        System.out.println("Assertion passed: condition is true.");
        return true;
    }

    public static boolean assertEquals(Object expected, Object actual) {
        if (!expected.equals(actual)) {
            System.out.println("Assertion failed: Expected " + expected + " but found " + actual);
            return false;
        }
        System.out.println("Assertion passed: " + expected + " equals " + actual);
        return true;
    }

    public static void main(String[] args) {
        Diccionario<String, Integer> diccionario = new DiccionarioOrdenado<>();
        diccionario.add(new ElementoDiccionario<>("a", 1));
        diccionario.add(new ElementoDiccionario<>("b", 2));
        diccionario.delete(new ElementoDiccionario<>("a", 1));

        Iterador<ElementoDiccionario<String, Integer>> iterador = diccionario.getIterador();

        // Pruebas usando funciones personalizadas
        assertTrue(iterador.hasNext());
        assertEquals("b", iterador.next().getClave());
    }
}


