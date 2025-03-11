/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;



public class Prueba {
    public static void main(String[] args) {

        Documento documentoPdf = new Documento("Contenido del documento PDF");
        documentoPdf.exportarAPdf();


        Documento_word documentoWord = new Documento_word("Contenido del documento Word");
        documentoWord.exportarAWord();


        Documento_excel documentoExcel = new Documento_excel("Contenido del documento Excel");
        documentoExcel.exportarAExcel();
    }
}
