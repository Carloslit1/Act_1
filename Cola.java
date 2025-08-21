package src.so;

/**
 * Cola (Queue) usando ListaLigada (FIFO).
 * Se usa para procesos a ejecutar.
 */
public class Cola<T> {
    private ListaLigada<T> lista = new ListaLigada<>();

    public void enqueue(T val) {
        System.out.println("[Cola] ENQUEUE: " + val);
        lista.addLast(val);
    }

    public T dequeue() {
        T v = lista.removeFirst();
        System.out.println("[Cola] DEQUEUE: " + v);
        return v;
    }

    public T peek() {
        T v = lista.peekFirst();
        System.out.println("[Cola] PEEK: " + v);
        return v;
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public void mostrar() {
        lista.imprimir();
    }
}
