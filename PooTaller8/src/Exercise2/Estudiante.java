/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

public class Estudiante extends Persona {
    private String Matricula;

    public Estudiante(int edad, String Nombre, String Matricula){
        super(edad, Nombre);
        this.Matricula=Matricula;
    }
    @Override

    public void MostrarInformacion(){
        super.MostrarInformacion();
        System.out.println("La matricula es : " + Matricula);
    }
}
