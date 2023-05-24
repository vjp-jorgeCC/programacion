/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03examenotrosaños;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Plantacion {

    private String tipoCultivo;
    private ArrayList<Sector> sectores;

    public Plantacion() {
        this.tipoCultivo = "";
        this.sectores = new ArrayList<>();
    }

    public Plantacion(String tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
        this.sectores = new ArrayList<>();
    }

    public String getTipoCultivo() {
        return tipoCultivo;
    }

    public void setTipoCultivo(String tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
    }

    public ArrayList<Sector> getSectores() {
        return sectores;
    }

    public void setSectores(ArrayList<Sector> sectores) {
        this.sectores = sectores;
    }

    public void rellenarPlantacion() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca los datos para rellenar su plantación: ");
        this.tipoCultivo = rellenarCultivo();
        Sector sector = new Sector();
        sector.rellenarSector();
        this.sectores.add(sector);

    }

    public String rellenarCultivo() {
        Scanner entrada = new Scanner(System.in);
        String cultivo;
        System.out.println("Introduzca el tipo de cultivo");
        return cultivo = entrada.nextLine();
    }

    public void mostrarPlantacion() {
        System.out.println("Tipo de cultivo: " + this.tipoCultivo);
        System.out.println(this.sectores.toString());
    }

    public int sumarKilos() {
        int suma = 0;
        for (int i = 0; i < this.sectores.size(); i++) {
            suma += this.sectores.get(i).getNumeroKilos();
        }
        return suma;
    }

}
