/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear un producto
        Producto producto = new Producto("Laptop", "Laptop de última generación", 1200.0);

        // Generar etiquetas
        EtiquetaProducto etiqueta = new EtiquetaProducto(producto);
        System.out.println("Etiqueta corta: " + etiqueta.generarEtiquetaCorta());
        System.out.println("Etiqueta larga:\n" + etiqueta.generarEtiquetaLarga());

        // Calcular precios
        CalculadoraPrecio calculadora = new CalculadoraPrecio(producto);
        double precioConImpuesto = calculadora.calcularPrecioConImpuesto(0.15); // 15% de impuesto
        double precioConDescuento = calculadora.calcularPrecioConDescuento(0.10); // 10% de descuento

        System.out.println("Precio con impuesto: $" + precioConImpuesto);
        System.out.println("Precio con descuento: $" + precioConDescuento);
    }
}
