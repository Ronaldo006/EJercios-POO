/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise3;

public class Empleado {
    private String Nombre;
    private int salario;

    public Empleado(String Nombre, int salario){
        this.Nombre=Nombre;
        this.salario=salario;

    }

    public void MostrarDetalles(){
        System.out.println("El nombre es : " + Nombre);
        System.out.println("El salario es : " + salario);
    }
}
