/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15.tema.pkg5;

/**
 *
 * @author jorge
 */
public class Direccion {
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;
    
    public Direccion(String ca,int num,int pis,String ciu){
        calle=ca;
        numero=num;
        piso=pis;
        ciudad=ciu;
    }
    public Direccion(){
        calle="";
        numero=0;
        piso=0;
        ciudad="";
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
