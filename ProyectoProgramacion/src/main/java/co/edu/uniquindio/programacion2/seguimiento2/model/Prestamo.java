package co.edu.uniquindio.programacion2.seguimiento2.model;

public class Prestamo {
    private String fechaPrestamo;
    private String fechaDevolucion;

    public Prestamo(String fechaPrestamo, String fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Prestamo() {

    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String toString() {
        return "Prestamo{" +
                "fechaPrestamo='" + fechaPrestamo + '\'' +
                ", fechaDevolucion='" + fechaDevolucion + '\'' +
                '}';
    }
}
