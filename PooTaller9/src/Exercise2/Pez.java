/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

public class Pez implements Nadador,Respirador {
    @Override

    public void Nadar(){
        System.out.println("El pez esta nadando");
    }

    @Override
    public void respirar(){
        System.out.println("El pez esta respirando");
    }
}