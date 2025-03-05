package Diccionarios;

public class DiccionarioOrdenado<K extends Comparable<K>, V> extends DiccionarioBasico<K,V> {
    OrdenadorDiccionario<K, V> ordenador;
}
