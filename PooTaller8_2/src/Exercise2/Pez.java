/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2;

public class Pez extends Animal {
    private String TipoDeAgua;

    public Pez(String Especie, String TipoDeAgua){
        super(Especie);
        this.TipoDeAgua=TipoDeAgua;
    }

    @Override
    public void MostrarEspecie(){
        super.MostrarEspecie();
        System.out.println("El tipo de agua del pez es : " + TipoDeAgua);
    }
    
}
