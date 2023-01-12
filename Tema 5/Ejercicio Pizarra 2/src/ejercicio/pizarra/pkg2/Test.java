/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pizarra.pkg2;

/**
 *
 * @author jcidc07
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Futbolista futbolista1=new Futbolista();
        Futbolista futbolista2=new Futbolista("Nacho","Portero");
        
        System.out.println("------------FUTBOLISTA 1------------");
        System.out.println("Nombre: "+futbolista1.getNombre());
        System.out.println("Posicion: "+futbolista1.getPosicion());
        
        System.out.println("------------FUTBOLISTA 2------------");
        System.out.println("Nombre: "+futbolista2.getNombre());
        System.out.println("Posicion: "+futbolista2.getPosicion());
        
        Equipo equipo1=new Equipo();
        Equipo equipo2=new Equipo();
        
        equipo1.setNombre("Atletico de madrid");
        equipo2.setNombre("Real madrid");
        equipo1.setFutbolista(futbolista1);
        equipo2.setFutbolista(futbolista2);
                        
        System.out.println("------------EQUIPO 1------------");
        System.out.println("Nombre: "+equipo1.getNombre());
        System.out.println("Futbolista: "+equipo1.getFutbolista().getNombre());
        
        System.out.println("------------EQUIPO 2------------");
        System.out.println("Nombre: "+equipo2.getNombre());
        System.out.println("Futbolista: "+equipo2.getFutbolista().getNombre());
        
    }
    
}
