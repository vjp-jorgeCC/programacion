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
public class Peliculas {
    private String titulo;
    private int costeLicencia;
    private Socios[] vSocios;

    public Peliculas() {
        titulo="";
        costeLicencia=0;
        vSocios=new Socios [4];
    }
    
    
    public Peliculas(String titulo, int costeLicencia, Socios[] vSocios) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.vSocios = new Socios[4];
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCosteLicencia() {
        return costeLicencia;
    }

    public void setCosteLicencia(int costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public Socios[] getvSocios() {
        return vSocios;
    }

    public void setvSocios(Socios[] vSocios) {
        this.vSocios = vSocios;
    }
    
    public void rellenarSocios(){
        for (int i = 0; i < vSocios.length; i++) {
            vSocios[i] = new Socios();
            System.out.println("----- SOCIO "+(i+1)+" -----");
            System.out.println("Introduce el nombre:");
            vSocios[i].setNombre(Ejercicio15.pedirNombre());
            System.out.println("Introduce la aporacion: ");
            vSocios[i].setAportacion(Ejercicio15.pedirNumero());
        }
    }
    public void mostrarSocios(){
        for (int i = 0; i < vSocios.length; i++) {
            System.out.println("----- SOCIO "+(i+1)+" -----");
            System.out.println("Nombre: "+vSocios[i].getNombre());
            System.out.println("Aportacion "+vSocios[i].getAportacion());
        }
    }
    public int beneficio(){
        int suma=0;
        for (int i = 0; i < vSocios.length; i++) {
            suma=suma+vSocios[i].getAportacion();
        }
        return suma;
    }
    public int aportacion(int i){
        int aportacion = vSocios[i].getAportacion();
        return aportacion;        
    }
}
