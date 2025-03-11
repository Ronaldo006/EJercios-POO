/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear una cuenta bancaria normal
        CuentaBancaria cuentaNormal = new CuentaBancaria(1000);
        cuentaNormal.depositar(500);
        cuentaNormal.retirar(200);
        System.out.println("Saldo de la cuenta normal: " + cuentaNormal.getSaldo());

        // Crear una cuenta de ahorros
        CuentaAhorros cuentaAhorros = new CuentaAhorros(1000, 300);
        cuentaAhorros.depositar(500);
        cuentaAhorros.retirar(200); // Retiro dentro del límite mensual
        System.out.println("Saldo de la cuenta de ahorros: " + cuentaAhorros.getSaldo());

        // Intentar retirar más del límite mensual
        try {
            cuentaAhorros.retirar(200); // Esto lanzará una excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Reiniciar los retiros mensuales
        cuentaAhorros.reiniciarRetirosMensuales();
        cuentaAhorros.retirar(200); // Ahora el retiro es válido
        System.out.println("Saldo de la cuenta de ahorros después del reinicio: " + cuentaAhorros.getSaldo());
    }
}
