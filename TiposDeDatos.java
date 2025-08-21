/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

import estructuras.*;

public class TiposDeDatos {

    public static void ejemploCadenas(){
        ListaSimple<String> l=new ListaSimple<>();
        l.insertarPrimeraPosicion("A"); l.insertarUltimaPosicion("B");
        l.insertarUltimaPosicion("C"); l.insertarUltimaPosicion("D");
        System.out.println("Lista Simple de Cadena:"); l.mostrarLista(); System.out.println();
    }

    public static void ejemploEnteros(){
        ListaSimple<Integer> l=new ListaSimple<>();
        l.insertarPrimeraPosicion(10); l.insertarUltimaPosicion(20);
        l.insertarUltimaPosicion(30); l.insertarUltimaPosicion(40);
        System.out.println("Lista Simple de Numeros Enteros:"); l.mostrarLista(); System.out.println();
    }

    public static void ejemploDoubles(){
        ListaSimple<Double> l=new ListaSimple<>();
        l.insertarPrimeraPosicion(11.11); l.insertarUltimaPosicion(22.22);
        l.insertarUltimaPosicion(33.33); l.insertarUltimaPosicion(44.44);
        System.out.println("Lista Simple de Numeros Dobles:"); l.mostrarLista(); System.out.println();
    }
}
