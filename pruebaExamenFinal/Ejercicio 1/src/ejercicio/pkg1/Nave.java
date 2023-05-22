/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jcidc07
 */
public class Nave implements Serializable {
    private String nombre;
    private int metrosCuadrados;
    private ArrayList<Empresa> listaEmpresas;

    public Nave() {
        nombre = "";
        metrosCuadrados = 0;
        listaEmpresas = new ArrayList<>();
    }

    public Nave(String nombre, int metrosCuadrados, ArrayList<Empresa> listaEmpresas) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
        this.listaEmpresas = listaEmpresas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public ArrayList<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }

    public void setListaEmpresas(ArrayList<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }   
}
