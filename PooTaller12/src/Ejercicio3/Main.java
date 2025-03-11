/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario = new Usuario("Juan Pérez", "juan.perez@example.com", "password123");

        // Validar datos del usuario
        ServicioValidacion validacion = new ServicioValidacion();
        boolean correoValido = validacion.validarCorreo(usuario.getCorreo());
        boolean contraseñaValida = validacion.validarContraseña(usuario.getContraseña());

        System.out.println("Correo válido: " + correoValido);
        System.out.println("Contraseña válida: " + contraseñaValida);

        // Autenticar al usuario
        ServicioAutenticacion autenticacion = new ServicioAutenticacion();
        boolean autenticado = autenticacion.autenticar(usuario, "password123");

        System.out.println("Usuario autenticado: " + autenticado);
    }
}