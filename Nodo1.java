package src.so;

class Nodo1<T> {
    T dato;
    Nodo1<T> sig;

    Nodo1(T d) {
        this.dato = d;
        this.sig = null;
    }
}
