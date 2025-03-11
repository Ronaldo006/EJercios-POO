/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;


public class Main {
    public static void main(String[] args) {
        // Crear un círculo y calcular su área
        Figura circulo = new Circulo(5.0);
        System.out.println("Área del círculo: " + circulo.calcularArea());

        // Crear un rectángulo y calcular su área
        Figura rectangulo = new Rectangulo(4.0, 6.0);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        // Usar las figuras de manera intercambiable
        Figura[] figuras = new Figura[2];
        figuras[0] = circulo;
        figuras[1] = rectangulo;

        for (Figura figura : figuras) {
            System.out.println("Área de la figura: " + figura.calcularArea());
        }
    }
}
