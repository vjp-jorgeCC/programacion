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
    
    Direccion(String ca,int num,int pis,String ciu){
        calle=ca;
        numero=num;
        piso=pis;
        ciudad=ciu;
    }
    
    public void setCalle(String ca){
        calle=ca;
    }
    public void setNumero(int num){
        numero=num;
    }
    public void setPiso(int pis){
        piso=pis;
    }
    public void setCiudad(String ciu){
        ciudad=ciu;
    }
    
    public String getCalle(){
        return calle;
    }
    public int getNumero(){
        return numero;
    }
    public int getPiso(){
        return piso;
    }
    public String getCiudad(){
        return ciudad;
    }
}
