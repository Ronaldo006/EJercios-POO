/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;


public class Prueba {
    public static void main(String[] args) {

        Mensajero mensajeroCorreo = new Mensajero();
        mensajeroCorreo.enviarCorreo("Hola, este es un correo electrónico.");


        Mensajero_sms mensajeroSMS = new Mensajero_sms();
        mensajeroSMS.enviarSMS("Hola, este es un SMS.");


        Mensajero_push mensajeroPush = new Mensajero_push();
        mensajeroPush.enviarNotificacionPush("Hola, esta es una notificación push.");
    }
}
