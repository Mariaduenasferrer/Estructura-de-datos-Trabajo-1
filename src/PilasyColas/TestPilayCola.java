package PilasyColas;

public class TestPilayCola {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        if(2 == pila.pop()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        Cola<Integer> cola = new Cola<>();
        cola.enqueue(10);
        cola.enqueue(20);
        if(20 == cola.dequeue()){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
