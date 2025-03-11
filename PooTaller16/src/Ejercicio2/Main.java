/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Usar almacenamiento local
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal("archivos_locales");
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);

        gestorLocal.guardar("archivo1.txt", "Contenido del archivo 1");
        String contenidoLocal = gestorLocal.recuperar("archivo1.txt");
        System.out.println("Contenido recuperado (local): " + contenidoLocal);

        // Usar almacenamiento en la nube
        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube);

        gestorNube.guardar("archivo2.txt", "Contenido del archivo 2");
        String contenidoNube = gestorNube.recuperar("archivo2.txt");
        System.out.println("Contenido recuperado (nube): " + contenidoNube);
    }
}