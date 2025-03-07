package ListasBasicas;
public class Test{
    public void testListaBasica() {
            Lista<Integer> lista = new Lista<>();
            lista.add(1);
            lista.add(2);
            lista.add(3);
            lista.delete(2);
            Lista<Integer> resultado = new Lista<>();
            Iterador<Integer> iterador = lista.getIterador();
            while (iterador.hasNext()) {
                resultado.add(iterador.next());
            }
            assertEquals(Lista.of(1, 3), resultado);
    }

    public static void main(String[] args) {
            // lista de enteros
            Lista<Integer> lista = new Lista<>();
            // add
            lista.add(1);
            lista.add(2);
            lista.add(3);
            // obtemer
            System.out.println("lemento en el índice 1: " + lista.obtener(1));
            // Delete
            lista.delete(2);
            // getSize
            System.out.println("Número de elementos: " + lista.getSize());
        // Iterar
        Iterador<Integer> iterador = lista.getIterador();
        while (iterador.hasNext()) {
            System.out.println("Elemento: " + iterador.next());
        }
        // Eliminar durante iteración
        iterador = lista.getIterador();
        iterador.next();
        iterador.delete();
        // Iterar
        System.out.println("Lista final:");
        iterador = lista.getIterador();
        while (iterador.hasNext()) {
            System.out.println("Elemento: " + iterador.next());
        }
    }
}


