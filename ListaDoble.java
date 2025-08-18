/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

public class ListaDoble<T> {
    private Nodo<T> cabeza, cola;
    private int tam=0;

    public void insertarPrimeraPosicion(T v){
        Nodo<T> n=new Nodo<>(v);
        if(cabeza==null){ cabeza=cola=n; }
        else { n.siguiente=cabeza; cabeza.anterior=n; cabeza=n; }
        tam++;
    }

    public void insertarUltimaPosicion(T v){
        Nodo<T> n=new Nodo<>(v);
        if(cola==null){ cabeza=cola=n; }
        else { cola.siguiente=n; n.anterior=cola; cola=n; }
        tam++;
    }

    public boolean eliminar(T v){
        if(cabeza==null) return false;
        if(igual(cabeza.dato,v)){ cabeza=cabeza.siguiente; if(cabeza!=null) cabeza.anterior=null; else cola=null; tam--; return true; }
        Nodo<T> a=cabeza.siguiente;
        while(a!=null && !igual(a.dato,v)) a=a.siguiente;
        if(a==null) return false;
        if(a.anterior!=null) a.anterior.siguiente=a.siguiente;
        if(a.siguiente!=null) a.siguiente.anterior=a.anterior;
        if(a==cola) cola=a.anterior;
        tam--; return true;
    }

    public boolean buscar(T v){
        Nodo<T> a=cabeza;
        while(a!=null){ if(igual(a.dato,v)) return true; a=a.siguiente; }
        return false;
    }

    public void mostrarLista(){
        if(cabeza==null){ System.out.println("(vacia)"); return; }
        Nodo<T> a=cabeza; String s="";
        while(a!=null){ s+=a.dato; if(a.siguiente!=null) s+=" <-> "; a=a.siguiente; }
        System.out.println(s);
    }

    private boolean igual(T a, T b){
        if(a==b) return true; if(a==null||b==null) return false; return a.equals(b);
    }

    public int tam(){ return tam; }
}
