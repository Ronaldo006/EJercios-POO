/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pootaller7;

/**
 *
 * @author HP
 */
public class CuentaBancaria {
  
    String numeroCuenta;
    String tipoCuenta;
    int saldo;
    public CuentaBancaria(){
        numeroCuenta="1234567890";
        tipoCuenta="ahorro";
        saldo=4578;
           
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    public CuentaBancaria(String numeroCuenta,String tipoCuenta){
      this.numeroCuenta=numeroCuenta;
      this.tipoCuenta=tipoCuenta;
       
    }

    @Override
    public String toString() {
        return ("_CuentaBanco:" + "\nnumeroCuenta:" + numeroCuenta + "\ntipoCuenta:" + tipoCuenta + "\nsaldo:" + saldo);
    }
    
}
