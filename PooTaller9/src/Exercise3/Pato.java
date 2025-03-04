/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise3;

interface Volador {
    void volar();
}

class Pato implements Volador {
    @Override
    public void volar() {
        System.out.println("El pato está volando");
    }
}

class Perro implements Volador {
    @Override
    public void volar() {
        // ¿Un perro puede volar? Esto no tiene sentido.
        throw new UnsupportedOperationException("Los perros no pueden volar");
    }
}