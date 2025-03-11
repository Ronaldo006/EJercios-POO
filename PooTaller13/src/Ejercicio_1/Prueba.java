/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;


public class Prueba {
    public static void main(String[] args) {
        
        Producto producto = new Producto("Laptop", 1000.0);

        
        Descuento descuentoPorcentaje = new Descuento(10);
        double precioConDescuentoPorcentaje = producto.aplicarDescuento(descuentoPorcentaje);
        System.out.println("Precio con descuento del 10%: $" + precioConDescuentoPorcentaje);

        
        Descuento descuentoFijo = new Descuento_Fijo(200); 
        double precioConDescuentoFijo = producto.aplicarDescuento(descuentoFijo);
        System.out.println("Precio con descuento fijo de $200: $" + precioConDescuentoFijo);
    }
}
