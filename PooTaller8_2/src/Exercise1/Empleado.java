/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise1;

public class Empleado extends Persona {
    private String Departamento;

    public Empleado(String Nombre, int edad, String Departamento){
        super(Nombre, edad);
        this.Departamento=Departamento;
    }

    @Override
    public void MostrarDetalles(){
    super.MostrarDetalles();
    System.out.println("El departamento es : " + Departamento);
    }
    
}