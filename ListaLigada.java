package src.so;

/**
 * Lista ligada simple para apoyar Pila y Cola.
 * Es básica a propósito (nivel estudiante), con prints útiles.
 */
public class ListaLigada<T> {
    private Nodo1<T> cabeza;
    private Nodo1<T> cola;
    private int tam;

    public void addFirst(T val) {
        Nodo1<T> n = new Nodo1<>(val);
        if (cabeza == null) {
            cabeza = cola = n;
        } else {
            n.sig = cabeza;
            cabeza = n;
        }
        tam++;
        System.out.println("[Lista] addFirst: " + val + " | tam=" + tam);
    }

    public void addLast(T val) {
        Nodo1<T> n = new Nodo1<>(val);
        if (cola == null) {
            cabeza = cola = n;
        } else {
            cola.sig = n;
            cola = n;
        }
        tam++;
        System.out.println("[Lista] addLast: " + val + " | tam=" + tam);
    }

    public T removeFirst() {
        if (cabeza == null) {
            System.out.println("[Lista] removeFirst: lista vacía");
            return null;
        }
        T val = cabeza.dato;
        cabeza = cabeza.sig;
        if (cabeza == null) cola = null;
        tam--;
        System.out.println("[Lista] removeFirst: " + val + " | tam=" + tam);
        return val;
    }

    public T peekFirst() {
        if (cabeza == null) return null;
        return cabeza.dato;
    }

    public boolean isEmpty() {
        return tam == 0;
    }

    public int size() {
        return tam;
    }

    public void imprimir() {
        System.out.print("[Lista] cabeza→ ");
        Nodo1<T> act = cabeza;
        while (act != null) {
            System.out.print(act.dato);
            act = act.sig;
            if (act != null) System.out.print(" -> ");
        }
        System.out.println(" ←cola  (tam=" + tam + ")");
    }
}
