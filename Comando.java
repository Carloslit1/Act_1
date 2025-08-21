package src.so;

import java.time.LocalDateTime;

public class Comando {
    private String texto;
    private LocalDateTime fecha;

    public Comando(String texto) {
        this.texto = texto;
        this.fecha = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return texto + " @ " + fecha.toLocalTime().withNano(0);
    }
}
