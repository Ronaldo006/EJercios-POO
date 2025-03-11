/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Usar generador de reportes en PDF
        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(reportePDF);

        gestorPDF.generar("Datos del reporte en PDF");

        // Usar generador de reportes en Excel
        GeneradorReporte reporteExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(reporteExcel);

        gestorExcel.generar("Datos del reporte en Excel");
    }
}