
package Ejercicio1;

public class ReporteLibro {
    private Libro libro;

    public ReporteLibro(Libro libro) {
        this.libro = libro;
    }

    public String generarResumen() {
        return "Resumen del libro: " + libro.getTitulo() + ", escrito por " + libro.getAutor() + " en el año " + libro.getAñoPublicacion() + ".";
    }

    public String generarReporteCompleto() {
        return "Reporte completo:\nTítulo: " + libro.getTitulo() + "\nAutor: " + libro.getAutor() + "\nAño de publicación: " + libro.getAñoPublicacion();
    }
}