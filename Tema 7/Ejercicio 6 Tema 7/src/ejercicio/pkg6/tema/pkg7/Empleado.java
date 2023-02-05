/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6.tema.pkg7;

/**
 *
 * @author jorge
 */
public class Empleado {
    private String nombre;
    private int horasTrabajo;
    private int tarifaPorHoras;

    public Empleado() {
        nombre="";
        horasTrabajo=0;
        tarifaPorHoras=0;
    }

    public Empleado(String nombre, int horasTrabajo, int tarifaPorHoras) {
        this.nombre = nombre;
        this.horasTrabajo = horasTrabajo;
        this.tarifaPorHoras = tarifaPorHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public int getTarifaPorHoras() {
        return tarifaPorHoras;
    }

    public void setTarifaPorHoras(int tarifaPorHoras) {
        this.tarifaPorHoras = tarifaPorHoras;
    }    
}
