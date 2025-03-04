/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pootaller7;

/**
 *
 * @author HP
 */
public class Estudiantes {
    String nombre;
    String  curso;
    int edad;
    public Estudiantes(){
        this.nombre="pepito";
        this.curso="B2";
        this.edad=12;
     
    }
    public Estudiantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiantes(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso= curso;
    }

    @Override
    public String toString() {
        return "_Estudiantes:"+ "\nnombre:" + nombre + "\ncurso:" + curso + "\nedad:" + edad;
    }
}
