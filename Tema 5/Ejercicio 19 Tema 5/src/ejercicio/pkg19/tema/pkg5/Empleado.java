/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg19.tema.pkg5;

/**
 *
 * @author jcidc07
 */
public class Empleado {
    private String nombre;
    private int horas;
    private int tarifa;

    public Empleado() {
        this.nombre="";
        this.horas=0;
        this.tarifa=0;
    }

    public Empleado(String nombre, int horas, int tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horas=" + horas + ", tarifa=" + tarifa + '}';
    }
    
    
    
    
}
