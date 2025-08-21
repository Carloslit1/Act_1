/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

import java.util.Scanner;
import estructuras.*;

public class MenuConsola {

    public static void run(){
        Scanner sc = new Scanner(System.in);
        int op=-1;
        while(op!=0){
            System.out.println("\n MENU PRINCIPAL");
            System.out.println("Qué tipo de lista vas a usar?");
            System.out.println("1. Lista Simple");
            System.out.println("2. Lista Doble");
            System.out.println("3. Lista Circular");
            System.out.println("4. Ejemplos (String/Int/Double)");
            System.out.println("5. Gestor sencillo de contactos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            try{ op=Integer.parseInt(sc.nextLine()); }catch(Exception e){ op=-1; }

            if(op==1) menuSimple(sc);
            else if(op==2) menuDoble(sc);
            else if(op==3) menuCircular(sc);
            else if(op==4){ TiposDeDatos.ejemploCadenas(); TiposDeDatos.ejemploEnteros(); TiposDeDatos.ejemploDoubles(); }
            else if(op==5) menuContactos(sc);
            else if(op==0) System.out.println("bye");
            else System.out.println("no le entendi, intenta otra vez");
        }
        sc.close();
    }

    private static void menuSimple(Scanner sc){
        ListaSimple<String> l=new ListaSimple<>();
        int op=-1;
        while(op!=9){
            System.out.println("\n-- Lista Simple (String) --");
            System.out.println("1) insertar INICIO");
            System.out.println("2) insertar FINAL");
            System.out.println("3) eliminar por valor");
            System.out.println("4) buscar");
            System.out.println("5) mostrar");
            System.out.println("9) regresar");
            System.out.print("opcion: ");
            try{ op=Integer.parseInt(sc.nextLine()); }catch(Exception e){ op=-1; }
            if(op==1){ System.out.print("valor: "); l.insertarPrimeraPosicion(sc.nextLine()); }
            else if(op==2){ System.out.print("valor: "); l.insertarUltimaPosicion(sc.nextLine()); }
            else if(op==3){ System.out.print("valor a borrar: "); System.out.println(l.eliminar(sc.nextLine())?"ok":"no estaba"); }
            else if(op==4){ System.out.print("valor a buscar: "); System.out.println(l.buscar(sc.nextLine())?"si esta":"nop"); }
            else if(op==5){ l.mostrarLista(); }
            else if(op==9) break;
            else System.out.println("esa no es opcion");
        }
    }

    private static void menuDoble(Scanner sc){
        ListaDoble<Integer> l=new ListaDoble<>();
        int op=-1;
        while(op!=9){
            System.out.println("\n-- Lista Doble (Integer) --");
            System.out.println("1) insertar INICIO");
            System.out.println("2) insertar FINAL");
            System.out.println("3) eliminar por valor");
            System.out.println("4) buscar");
            System.out.println("5) mostrar");
            System.out.println("9) regresar");
            System.out.print("opcion: ");
            try{ op=Integer.parseInt(sc.nextLine()); }catch(Exception e){ op=-1; }
            if(op==1){ System.out.print("numero: "); l.insertarPrimeraPosicion(leeInt(sc)); }
            else if(op==2){ System.out.print("numero: "); l.insertarUltimaPosicion(leeInt(sc)); }
            else if(op==3){ System.out.print("numero a borrar: "); System.out.println(l.eliminar(leeInt(sc))?"ok":"no estaba"); }
            else if(op==4){ System.out.print("numero a buscar: "); System.out.println(l.buscar(leeInt(sc))?"si esta":"nop"); }
            else if(op==5){ l.mostrarLista(); }
            else if(op==9) break;
            else System.out.println("esa no es opcion");
        }
    }

    private static void menuCircular(Scanner sc){
        ListaCircular<Double> l=new ListaCircular<>();
        int op=-1;
        while(op!=9){
            System.out.println("\n-- Lista Circular (Double) --");
            System.out.println("1) insertar INICIO");
            System.out.println("2) insertar FINAL");
            System.out.println("3) eliminar por valor");
            System.out.println("4) buscar");
            System.out.println("5) mostrar");
            System.out.println("9) regresar");
            System.out.print("opcion: ");
            try{ op=Integer.parseInt(sc.nextLine()); }catch(Exception e){ op=-1; }
            if(op==1){ System.out.print("double: "); l.insertarPrimeraPosicion(leeDouble(sc)); }
            else if(op==2){ System.out.print("double: "); l.insertarUltimaPosicion(leeDouble(sc)); }
            else if(op==3){ System.out.print("double a borrar: "); System.out.println(l.eliminar(leeDouble(sc))?"ok":"no estaba"); }
            else if(op==4){ System.out.print("double a buscar: "); System.out.println(l.buscar(leeDouble(sc))?"si esta":"nop"); }
            else if(op==5){ l.mostrarLista(); }
            else if(op==9) break;
            else System.out.println("esa no es opcion");
        }
    }

    private static void menuContactos(Scanner sc){
        ListaSimple<Contacto> agenda=new ListaSimple<>();
        int op=-1;
        while(op!=9){
            System.out.println("\n-- Contactos (lista simple) --");
            System.out.println("1) agregar contacto");
            System.out.println("2) borrar por nombre");
            System.out.println("3) buscar por nombre");
            System.out.println("4) mostrar");
            System.out.println("9) regresar");
            System.out.print("opcion: ");
            try{ op=Integer.parseInt(sc.nextLine()); }catch(Exception e){ op=-1; }

            if(op==1){
                System.out.print("nombre: "); String n=sc.nextLine();
                System.out.print("direccion: "); String d=sc.nextLine();
                System.out.print("tel: "); String t=sc.nextLine();
                agenda.insertarUltimaPosicion(new Contacto(n,d,t));
            } else if(op==2){
                System.out.print("nombre a borrar: "); String n=sc.nextLine();
                System.out.println(agenda.eliminar(new Contacto(n,"",""))?"ok":"no estaba");
            } else if(op==3){
                System.out.print("nombre a buscar: "); String n=sc.nextLine();
                System.out.println(agenda.buscar(new Contacto(n,"",""))?"si":"no");
            } else if(op==4){
                agenda.mostrarLista();
            } else if(op==9){
                break;
            } else {
                System.out.println("esa no es opcion");
            }
        }
    }

    private static int leeInt(Scanner sc){ try{ return Integer.parseInt(sc.nextLine()); }catch(Exception e){ return 0; } }
    private static double leeDouble(Scanner sc){ try{ return Double.parseDouble(sc.nextLine()); }catch(Exception e){ return 0; } }
}
