/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crear una bicicleta y un coche
        Transporte bicicleta = new Bicicleta();
        Transporte coche = new Coche();

        // Usar los transportes de manera intercambiable
        Transporte[] transportes = new Transporte[2];
        transportes[0] = bicicleta;
        transportes[1] = coche;

        for (Transporte transporte : transportes) {
            transporte.mover(10); // Mover cada transporte 10 km
        }
    }
}