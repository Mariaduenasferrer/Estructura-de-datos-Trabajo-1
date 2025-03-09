package ListasDoblementeEnlazadas;

public class Test {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();

        // Add
        lista.add(1);
        lista.add(2);
        lista.add(3);

        //size
        System.out.println("Tamaño de la lista: " + lista.getSize());

        //  iterador
        Iterador<Integer> iterador = (Iterador<Integer>) lista.getIterador();
        while (iterador.hasNext()) {
            System.out.println("Elemento: " + iterador.next());
        }

        // Eliminar
        lista.delete(2);

        // iterador x2
        iterador = (Iterador<Integer>) lista.getIterador();
        while (iterador.hasNext()) {
            System.out.println("Elemento: " + iterador.next());
        }

        //  tamaño
        System.out.println("Tamaño de la lista después de eliminar: " + lista.getSize());
    }
}
