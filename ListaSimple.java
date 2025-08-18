package estructuras;

public class ListaSimple<T> {
    private Nodo<T> cabeza;
    private int tam = 0;

    public void insertarPrimeraPosicion(T value){
        Nodo<T> n = new Nodo<>(value);
        if(cabeza==null) cabeza = n;
        else { n.siguiente = cabeza; cabeza = n; }
        tam++;
    }

    public void insertarUltimaPosicion(T value){
        Nodo<T> n = new Nodo<>(value);
        if(cabeza==null){ cabeza = n; tam++; return; }
        Nodo<T> a = cabeza;
        while(a.siguiente!=null) a = a.siguiente;
        a.siguiente = n; tam++;
    }

    public boolean eliminar(T value){
        if(cabeza==null) return false;
        if(igual(cabeza.dato,value)){ cabeza=cabeza.siguiente; tam--; return true; }
        Nodo<T> a=cabeza;
        while(a.siguiente!=null && !igual(a.siguiente.dato,value)) a=a.siguiente;
        if(a.siguiente==null) return false;
        a.siguiente = a.siguiente.siguiente; tam--; return true;
    }

    public boolean buscar(T value){
        Nodo<T> a=cabeza;
        while(a!=null){ if(igual(a.dato,value)) return true; a=a.siguiente; }
        return false;
    }

    public void mostrarLista(){
        if(cabeza==null){ System.out.println("(vacia)"); return; }
        Nodo<T> a=cabeza; String s="";
        while(a!=null){ s+=a.dato; if(a.siguiente!=null) s+=" -> "; a=a.siguiente; }
        System.out.println(s);
    }

    private boolean igual(T a, T b){
        if(a==b) return true; if(a==null||b==null) return false; return a.equals(b);
    }

    public int tam(){ return tam; }
}
