/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

// circular simple (solo siguiente) con referencia a cola
public class ListaCircular<T> {
    private Nodo<T> cola; // tail
    private int tam=0;

    public void insertarPrimeraPosicion(T v){
        Nodo<T> n=new Nodo<>(v);
        if(cola==null){ cola=n; n.siguiente=n; }
        else { n.siguiente=cola.siguiente; cola.siguiente=n; }
        tam++;
    }

    public void insertarUltimaPosicion(T v){
        insertarPrimeraPosicion(v);
        cola = cola.siguiente; // mover cola al nuevo
    }

    public boolean eliminar(T v){
        if(cola==null) return false;
        Nodo<T> prev=cola, cur=cola.siguiente;
        do{
            if(igual(cur.dato,v)){
                if(cur==prev){ cola=null; }
                else{
                    prev.siguiente=cur.siguiente;
                    if(cur==cola) cola=prev;
                }
                tam--; return true;
            }
            prev=cur; cur=cur.siguiente;
        }while(cur!=cola.siguiente);
        return false;
    }

    public boolean buscar(T v){
        if(cola==null) return false;
        Nodo<T> c=cola.siguiente;
        do{ if(igual(c.dato,v)) return true; c=c.siguiente; }
        while(c!=cola.siguiente);
        return false;
    }

    public void mostrarLista(){
        if(cola==null){ System.out.println("(vacia)"); return; }
        Nodo<T> c=cola.siguiente; String s="";
        do{ s+=c.dato; c=c.siguiente; if(c!=cola.siguiente) s+=" -> "; }
        while(c!=cola.siguiente);
        System.out.println(s+" (circular)");
    }

    private boolean igual(T a,T b){
        if(a==b) return true; if(a==null||b==null) return false; return a.equals(b);
    }

    public int tam(){ return tam; }
}
