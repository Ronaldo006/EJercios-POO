/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.io.*;

public class AlmacenamientoLocal implements Almacenamiento {
    private String rutaDirectorio;

    public AlmacenamientoLocal(String rutaDirectorio) {
        this.rutaDirectorio = rutaDirectorio;
    }

    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        try (FileWriter writer = new FileWriter(rutaDirectorio + "/" + nombreArchivo)) {
            writer.write(contenido);
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaDirectorio + "/" + nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error al recuperar el archivo: " + e.getMessage());
        }
        return contenido.toString();
    }
}
