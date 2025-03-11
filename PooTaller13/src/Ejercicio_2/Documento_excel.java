/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

public class Documento_excel extends Documento {
    public Documento_excel(String contenido) {
        super(contenido);
    }


    public void exportarAExcel() {
        System.out.println("Exportando a Excel: " + getContenido());
    }
}
