/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise4;

public class Derivada extends Base {
    public Derivada(int valor) {
        super(valor);
    }

    public void intentarAcceder() {
        // Esto causará un error al momento de compilación
        System.out.println(atributoPrivado);
    }
}