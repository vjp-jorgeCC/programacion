/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg24.tema.pkg12;

/**
 *
 * @author jcidc07
 */


class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double tarifa;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifa() {
        return tarifa;
    }
}

