package src.so;

public class Proceso {
    private static int contador = 1000;
    private int pid;
    private String nombre;

    public Proceso(String nombre) {
        this.nombre = nombre;
        this.pid = contador++;
    }

    @Override
    public String toString() {
        return nombre + " [PID " + pid + "]";
    }
}
