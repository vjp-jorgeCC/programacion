/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1.tema.pkg5.personaje;

/**
 *
 * @author jcidc07
 */
public class Ejercicio1Tema5Personaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje personaje1=new Personaje();
        Personaje personaje2=new Personaje();
        
        personaje1.setNombre("Nacho");
        personaje1.setFuerza(7);
        personaje1.setNivel(10);
        
        personaje2.setNombre("Hugo");
        personaje2.setFuerza(5);
        personaje2.setNivel(9);
        
        System.out.println("=============DATOS DE LOS PERSONAJES=============");
        System.out.println("--------------------Personaje 1--------------------");
        System.out.println("Nombre: "+personaje1.getNombre());
        System.out.println("Fuerza: "+personaje1.getFuerza());
        System.out.println("Nivel: "+personaje1.getNivel());
        
        System.out.println("--------------------Personaje 2--------------------");
        System.out.println("Nombre: "+personaje2.getNombre());
        System.out.println("Fuerza: "+personaje2.getFuerza());
        System.out.println("Nivel: "+personaje2.getNivel());
    }
    
}
