package src.so;

/**
 * Pila (Stack) usando ListaLigada (LIFO).
 * Se usa para historial de comandos (deshacer).
 */
public class Pila<T> {
    private ListaLigada<T> lista = new ListaLigada<>();

    public void push(T val) {
        System.out.println("[Pila] PUSH: " + val);
        lista.addFirst(val);
    }

    public T pop() {
        T v = lista.removeFirst();
        System.out.println("[Pila] POP: " + v);
        return v;
    }

    public T peek() {
        T v = lista.peekFirst();
        System.out.println("[Pila] PEEK: " + v);
        return v;
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public void mostrar() {
        lista.imprimir();
    }
}
