/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;


public class Prueba {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();


        Persona[] personas = {persona, estudiante, profesor};


        for (Persona p : personas) {
            p.presentarse();
        }
    }
}
