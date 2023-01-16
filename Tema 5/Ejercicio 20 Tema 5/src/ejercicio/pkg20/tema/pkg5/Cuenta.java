/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg20.tema.pkg5;

/**
 *
 * @author jcidc07
 */
public class Cuenta {
    private String titular;
    private float saldo;

    public Cuenta() {
        this.titular="";
        this.saldo=0;
    }

    public Cuenta(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void extraer(float cantidad){
        this.saldo=this.saldo-cantidad;
    }
    public void ingresar(float cantidad){
        this.saldo=this.saldo+cantidad;
    }
}
