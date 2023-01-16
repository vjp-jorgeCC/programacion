/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15.tema.pkg5;

/**
 *
 * @author jorge
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion direccion1=new Direccion("La data", 3,1,"Plasencia");
        Direccion direccion2=new Direccion("Cañada real", 10,3,"Plasencia");
        Direccion direccion3=new Direccion("Serrana", 8,7,"Madrid");
        
        Empleado empleado1=new Empleado("Jorge",1700,direccion1);
        Empleado empleado2=new Empleado("Nacho",1200,direccion2);
        Empleado empleado3=new Empleado("Hugo",900,direccion3);        
        
        System.out.println("----------------- EMPLEADO 1 -----------------");
        System.out.println("Nombre: "+empleado1.getNombre());
        System.out.println("Salario: "+empleado1.getSalario()+"€");
        System.out.println("----DIRECCION EMPLEADO 1----");
        System.out.println("\tCalle: "+empleado1.getEmepleado().getCalle());
        System.out.println("\tNumero: "+empleado1.getEmepleado().getNumero());
        System.out.println("\tPiso: "+empleado1.getEmepleado().getPiso());
        System.out.println("\tCiudad: "+empleado1.getEmepleado().getCiudad());
        
        System.out.println("----------------- EMPLEADO 2 -----------------");
        System.out.println("Nombre: "+empleado2.getNombre());
        System.out.println("Salario: "+empleado2.getSalario()+"€");
        System.out.println("----DIRECCION EMPLEADO 2----");
        System.out.println("\tCalle: "+empleado2.getEmepleado().getCalle());
        System.out.println("\tNumero: "+empleado2.getEmepleado().getNumero());
        System.out.println("\tPiso: "+empleado2.getEmepleado().getPiso());
        System.out.println("\tCiudad: "+empleado2.getEmepleado().getCiudad());
        
        System.out.println("----------------- EMPLEADO 3 -----------------");
        System.out.println("Nombre: "+empleado3.getNombre());
        System.out.println("Salario: "+empleado3.getSalario()+"€");
        System.out.println("----DIRECCION EMPLEADO 3----");
        System.out.println("\tCalle: "+empleado3.getEmepleado().getCalle());
        System.out.println("\tNumero: "+empleado3.getEmepleado().getNumero());
        System.out.println("\tPiso: "+empleado3.getEmepleado().getPiso());
        System.out.println("\tCiudad: "+empleado3.getEmepleado().getCiudad());
    }
    
}
