/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Usar autenticación local
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal);

        boolean resultadoLocal = gestorLocal.iniciarSesion("admin", "1234");
        System.out.println("Autenticación local: " + (resultadoLocal ? "Éxito" : "Fallo"));

        // Usar autenticación OAuth
        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth);

        boolean resultadoOAuth = gestorOAuth.iniciarSesion("user@oauth.com", "oauth123");
        System.out.println("Autenticación OAuth: " + (resultadoOAuth ? "Éxito" : "Fallo"));
    }
}