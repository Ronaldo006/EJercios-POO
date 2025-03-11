/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class ServicioValidacion {
    public boolean validarCorreo(String correo) {
        // Expresión regular simple para validar un correo electrónico
        return correo != null && correo.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public boolean validarContraseña(String contraseña) {
        // Validar que la contraseña tenga al menos 8 caracteres
        return contraseña != null && contraseña.length() >= 8;
    }
}