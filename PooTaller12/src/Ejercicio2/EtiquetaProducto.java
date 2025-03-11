/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class EtiquetaProducto {
    private Producto producto;

    public EtiquetaProducto(Producto producto) {
        this.producto = producto;
    }

    public String generarEtiquetaCorta() {
        return "Nombre: " + producto.getNombre() + " - Precio: $" + producto.getPrecioBase();
    }

    public String generarEtiquetaLarga() {
        return "Nombre: " + producto.getNombre() + "\nDescripción: " + producto.getDescripcion() + "\nPrecio: $" + producto.getPrecioBase();
    }
}