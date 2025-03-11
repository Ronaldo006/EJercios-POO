/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Coche extends Transporte {
    @Override
    public void mover(int distancia) {
        System.out.println("El coche se mueve " + distancia + " km.");
    }
}