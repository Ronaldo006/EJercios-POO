/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise1;
class Coche extends Vehiculo {

    private int NumeroDePuertas;

    public Coche(String Marca, double MaxumaVelocidad, int NumeroDePuertas ){
        super(Marca, MaxumaVelocidad);
        this.NumeroDePuertas=NumeroDePuertas;


    }

    @Override

    public void MostrarInformacion(){
        super.MostrarInformacion();
        System.out.println("Numero de puertas del auto : " + NumeroDePuertas );
    }
}