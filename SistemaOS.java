package src.so;

import java.util.Scanner;

/**
 * Módulo sencillo de "sistema operativo":
 * - Pila de historial de comandos (deshacer).
 * - Cola de procesos a ejecutar (orden de llegada).
 * Estilo estudiante: prints para entender el flujo.
 */
public class SistemaOS {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pila<Comando> historial = new Pila<>();
    private static final Cola<Proceso> colaProc = new Cola<>();

    public static void main(String[] args) {
        System.out.println("=== Mini SO (Pilas y Colas con Listas Ligadas) ===");
        while (true) {
            menu();
            String op = sc.nextLine().trim();
            if (op.equals("1")) ejecutarComando();
            else if (op.equals("2")) deshacerUltimo();
            else if (op.equals("3")) agregarProceso();
            else if (op.equals("4")) ejecutarSiguienteProceso();
            else if (op.equals("5")) {
                System.out.println("Historial:");
                historial.mostrar();
            }
            else if (op.equals("6")) {
                System.out.println("Cola de procesos:");
                colaProc.mostrar();
            }
            else if (op.equals("7")) { System.out.println("Saliendo..."); break; }
            else System.out.println("Opción no válida");
        }
    }

    private static void menu() {
        System.out.println("\n1) Ejecutar comando");
        System.out.println("2) Deshacer último comando");
        System.out.println("3) Agregar proceso");
        System.out.println("4) Ejecutar siguiente proceso");
        System.out.println("5) Ver historial");
        System.out.println("6) Ver cola de procesos");
        System.out.println("7) Salir");
        System.out.print("> Elige: ");
    }

    private static void ejecutarComando() {
        System.out.print("Escribe el comando (texto): ");
        String txt = sc.nextLine().trim();
        if (txt.isEmpty()) {
            System.out.println("(Vacío, nada que ejecutar)");
            return;
        }
        Comando c = new Comando(txt);
        System.out.println("Ejecutando: " + c);
        historial.push(c);
        historial.mostrar();
    }

    private static void deshacerUltimo() {
        if (historial.isEmpty()) {
            System.out.println("No hay comandos para deshacer.");
            return;
        }
        Comando c = historial.pop();
        System.out.println("Se deshizo: " + c);
        historial.mostrar();
    }

    private static void agregarProceso() {
        System.out.print("Nombre del proceso: ");
        String nombre = sc.nextLine().trim();
        if (nombre.isEmpty()) nombre = "Proceso";
        Proceso p = new Proceso(nombre);
        colaProc.enqueue(p);
        colaProc.mostrar();
    }

    private static void ejecutarSiguienteProceso() {
        if (colaProc.isEmpty()) {
            System.out.println("No hay procesos en la cola.");
            return;
        }
        Proceso p = colaProc.dequeue();
        System.out.println("Ejecutando: " + p + " ... Listo.");
        colaProc.mostrar();
    }
}
