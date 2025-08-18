package estructuras;

// public fields on purpose (student style), no getters/setters
public class Nodo<T> {
    public T dato;
    public Nodo<T> siguiente;
    public Nodo<T> anterior;

    public Nodo(T d){ this.dato = d; }
    public Nodo(T d, Nodo<T> sig){ this.dato = d; this.siguiente = sig; }
    public Nodo(T d, Nodo<T> ant, Nodo<T> sig){
        this.dato = d; this.anterior = ant; this.siguiente = sig;
    }
}
