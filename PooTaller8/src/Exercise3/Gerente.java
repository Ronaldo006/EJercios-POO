/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise3;

public class Gerente extends Empleado {
    private String Departamento;

    public Gerente(String Nombre, int salario, String Departamento){
        super(Nombre, salario);
        this.Departamento=Departamento;
    }

    @Override
    public void MostrarDetalles(){
        super.MostrarDetalles();
        System.out.println("El departamento es : " + Departamento);
    }
}