/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class CalculadoraPrecio {
    private Producto producto;

    public CalculadoraPrecio(Producto producto) {
        this.producto = producto;
    }

    public double calcularPrecioConImpuesto(double tasaImpuesto) {
        return producto.getPrecioBase() * (1 + tasaImpuesto);
    }

    public double calcularPrecioConDescuento(double descuento) {
        return producto.getPrecioBase() * (1 - descuento);
    }
}