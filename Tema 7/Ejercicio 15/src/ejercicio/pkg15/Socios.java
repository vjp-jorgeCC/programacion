/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15;

/**
 *
 * @author jcidc07
 */
public class Socios {
    private String nombre;
    private int aportacion;

    public Socios() {
        nombre="";
        aportacion=0;
    }

    public Socios(String nombre, int aportacion) {
        this.nombre = nombre;
        this.aportacion = aportacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAportacion() {
        return aportacion;
    }

    public void setAportacion(int aportacion) {
        this.aportacion = aportacion;
    }
    
    
    
    
    
}
