/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise1;

public class Vehiculo {
    public String Marca;
    public double MaxumaVelocidad;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public double getMaxumaVelocidad() {
        return MaxumaVelocidad;
    }

    public void setMaxumaVelocidad(double maxumaVelocidad) {
        MaxumaVelocidad = maxumaVelocidad;
    }

    public Vehiculo(String Marca, double MaxumaVelocidad){
    this.Marca=Marca;
    this.MaxumaVelocidad=MaxumaVelocidad;
    }

    public void MostrarInformacion(){
        System.out.println("La marca del carro es : "+ Marca);
        System.out.println("La maxima velocidad de ese carro es de : "+ MaxumaVelocidad + "Km/h") ;
    }    
}