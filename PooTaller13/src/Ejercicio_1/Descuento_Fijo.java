/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_1;


public class Descuento_Fijo extends Descuento {
    private double montoFijo;

    public Descuento_Fijo(double montoFijo) {
        super(0); 
        this.montoFijo = montoFijo;
    }


    @Override
    public double aplicarDescuento(double precio) {
        return precio - montoFijo;
    }
}