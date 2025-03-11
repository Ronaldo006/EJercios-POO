/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

public class Main {
    public static void main(String[] args) {
       
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
 
        ReporteLibro reporte = new ReporteLibro(libro);
        System.out.println(reporte.generarResumen());

        PersistenciaLibro.guardarLibro(libro, "libro.txt");
        
        Libro libroCargado = PersistenciaLibro.cargarLibro("libro.txt");
        if (libroCargado != null) {
            System.out.println("Libro cargado: " + libroCargado);
        }
    }
}
