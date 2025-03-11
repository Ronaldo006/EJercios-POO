/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        System.out.println("Guardando archivo '" + nombreArchivo + "' en la nube...");
        // Simulación de guardado en la nube
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        System.out.println("Recuperando archivo '" + nombreArchivo + "' desde la nube...");
        // Simulación de recuperación desde la nube
        return "Contenido simulado del archivo " + nombreArchivo;
    }
}