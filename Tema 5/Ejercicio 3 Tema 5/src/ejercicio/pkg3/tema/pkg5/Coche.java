/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.tema.pkg5;

/**
 *
 * @author jcidc07
 */
public class Coche {
    private String marca;
    private String modelo;
    private Rueda ruedas;
    
    public void setMarca(String m){
        marca=m;
    }
    public void setModelo(String mod){
        modelo=mod;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setRuedas(Rueda r){
        ruedas=r;
    }
    public Rueda getRuedas(){
        return ruedas;
    }
}
