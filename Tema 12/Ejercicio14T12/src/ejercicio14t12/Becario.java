/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14t12;

/**
 *
 * @author Usuario
 */
public class Becario {
    private String nombre;
    private char sexo;
    private int edad;
    private int numSuspensos;
    private boolean residenciaFamiliar;
    private int ingresosAnuales;

    public Becario() {
        this.nombre = "";
        this.sexo = ' ';
        this.edad = 20;
        this.numSuspensos = 0;
        this.residenciaFamiliar = true;
        this.ingresosAnuales = 0;
    }
    
    public Becario(String nombre, char sexo, int edad, int numSuspensos, boolean residenciaFamiliar, int ingresosAnuales) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.numSuspensos = numSuspensos;
        this.residenciaFamiliar = residenciaFamiliar;
        this.ingresosAnuales = ingresosAnuales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumSuspensos() {
        return numSuspensos;
    }

    public void setNumSuspensos(int numSuspensos) {
        this.numSuspensos = numSuspensos;
    }

    public boolean isResidenciaFamiliar() {
        return residenciaFamiliar;
    }

    public void setResidenciaFamiliar(boolean residenciaFamiliar) {
        this.residenciaFamiliar = residenciaFamiliar;
    }

    public int getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(int ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }
    
}
