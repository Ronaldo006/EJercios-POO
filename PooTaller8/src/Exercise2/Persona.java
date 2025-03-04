/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

public class Persona {
    private int edad;
    private String Nombre;

    public Persona(int edad,String Nombre){
        this.Nombre=Nombre;
        this.edad=edad;
    }

    public void MostrarInformacion(){
        System.out.println("Nombre : " + Nombre);
        System.out.println("Edad : " + edad);
    }
}