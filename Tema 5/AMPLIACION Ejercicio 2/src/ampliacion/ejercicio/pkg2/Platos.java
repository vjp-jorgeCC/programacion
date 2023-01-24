/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion.ejercicio.pkg2;

/**
 *
 * @author jorge
 */
public class Platos {
    private String nombre;
    private int precio;
    private int racionesDisponibles;

    public Platos(String nombre, int precio, int racionesDisponibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.racionesDisponibles = racionesDisponibles;
    }

    public Platos() {
        nombre="";
        precio=0;
        racionesDisponibles=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getRacionesDisponibles() {
        return racionesDisponibles;
    }

    public void setRacionesDisponibles(int racionesDisponibles) {
        this.racionesDisponibles = racionesDisponibles;
    }
    
    
}
