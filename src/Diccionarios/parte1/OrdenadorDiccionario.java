package Diccionarios.parte1;

public class OrdenadorDiccionario<K,V> {
    boolean ordenAscendente;

    public static class AssertionUtils {

        public static void assertTrue(boolean condition, String message) {
            if (!condition) {
                System.out.println("Assertion failed: " + (message != null ? message : "Condition is false."));
            } else {
                System.out.println("Assertion passed: " + (message != null ? message : "Condition is true."));
            }
        }

        public static void assertEquals(Object expected, Object actual, String message) {
            if (!expected.equals(actual)) {
                System.out.println("Assertion failed: " + (message != null ? message :
                        "Expected " + expected + " but found " + actual));
            } else {
                System.out.println("Assertion passed: " + (message != null ? message :
                        expected + " equals " + actual));
            }
        }
    }
}
