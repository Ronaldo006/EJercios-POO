/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class PersistenciaLibro {

    public static void guardarLibro(Libro libro, String archivo) {
        try (FileWriter writer = new FileWriter(archivo)) {
            writer.write(libro.getTitulo() + "\n");
            writer.write(libro.getAutor() + "\n");
            writer.write(libro.getAñoPublicacion() + "\n");
        } catch (IOException e) {
            System.err.println("Error al guardar el libro: " + e.getMessage());
        }
    }

    public static Libro cargarLibro(String archivo) {
        try (Scanner scanner = new Scanner(new File(archivo))) {
            String titulo = scanner.nextLine();
            String autor = scanner.nextLine();
            int añoPublicacion = Integer.parseInt(scanner.nextLine());
            return new Libro(titulo, autor, añoPublicacion);
        } catch (FileNotFoundException e) {
            System.err.println("Error al cargar el libro: " + e.getMessage());
            return null;
        }
    }
}