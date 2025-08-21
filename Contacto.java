/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enrique
 */
package aplicacion;

// simple contact type (equals by name only)
public class Contacto {
    public String nombre;
    public String direccion;
    public String telefono;

    public Contacto(String n,String d,String t){ nombre=n; direccion=d; telefono=t; }

    @Override public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Contacto)) return false;
        Contacto c=(Contacto)o;
        if(nombre==null && c.nombre==null) return true;
        if(nombre==null || c.nombre==null) return false;
        return nombre.equalsIgnoreCase(c.nombre);
    }

    @Override public int hashCode(){ return nombre==null?0:nombre.toLowerCase().hashCode(); }

    @Override public String toString(){ return nombre+" | "+telefono; }
}
