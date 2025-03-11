/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;


public class Prueba {
    public static void main(String[] args) {
        
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);

        
        Figura[] figuras = {circulo, rectangulo};

        
        for (Figura figura : figuras) {
            figura.calcularArea();
        }
    }
}