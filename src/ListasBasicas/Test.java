package ListasBasicas;
public class Test{
    public static void main(String[] args) {
        // lista de enteros
        Lista<Integer> lista = new Lista<>();

        // add
        lista.add(1);
        lista.add(2);
        lista.add(3);

        // obtener
        System.out.println("Elemento en el índice 1: " + lista.obtener(1));

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
