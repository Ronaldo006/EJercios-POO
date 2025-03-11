/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;



public class Documento_word extends Documento {
    public Documento_word(String contenido) {
        super(contenido);
    }


    public void exportarAWord() {
        System.out.println("Exportando a Word: " + getContenido());
    }
}
