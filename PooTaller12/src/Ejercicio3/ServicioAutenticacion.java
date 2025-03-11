/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class ServicioAutenticacion {
    public boolean autenticar(Usuario usuario, String contraseñaIngresada) {
        return usuario.getContraseña().equals(contraseñaIngresada);
    }
}