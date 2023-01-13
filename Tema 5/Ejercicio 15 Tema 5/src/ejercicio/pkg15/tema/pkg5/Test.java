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
        
        Empleado empleado1=new Empleado("Jorge",1700);
        Empleado empleado2=new Empleado("Nacho",1200);
        Empleado empleado3=new Empleado("Hugo",900);
        
        empleado1.setEmpleado(direccion1);
        empleado2.setEmpleado(direccion2);
        empleado3.setEmpleado(direccion3);
        
        System.out.println("----------------- EMPLEADO 1 -----------------");
        System.out.println("Nombre: "+empleado1.getNombre());
        System.out.println("Salario: "+empleado1.getSalario()+"€");
        System.out.println("----DIRECCION EMPLEADO 1----");
        System.out.println("Calle: "+empleado1.getEmepleado().getCalle());
        System.out.println("Numero: "+empleado1.getEmepleado().getNumero());
        System.out.println("Piso: "+empleado1.getEmepleado().getPiso());
        System.out.println("Ciudad: "+empleado1.getEmepleado().getCiudad());
        
        System.out.println("----------------- EMPLEADO 2 -----------------");
        System.out.println("Nombre: "+empleado2.getNombre());
        System.out.println("Salario: "+empleado2.getSalario()+"€");
        System.out.println("----DIRECCION EMPLEADO 2----");
        System.out.println("Calle: "+empleado2.getEmepleado().getCalle());
        System.out.println("Numero: "+empleado2.getEmepleado().getNumero());
        System.out.println("Piso: "+empleado2.getEmepleado().getPiso());
        System.out.println("Ciudad: "+empleado2.getEmepleado().getCiudad());
        
        System.out.println("----------------- EMPLEADO 3 -----------------");
        System.out.println("Nombre: "+empleado3.getNombre());
        System.out.println("Salario: "+empleado3.getSalario()+"€");
        System.out.println("----DIRECCION EMPLEADO 3----");
        System.out.println("Calle: "+empleado3.getEmepleado().getCalle());
        System.out.println("Numero: "+empleado3.getEmepleado().getNumero());
        System.out.println("Piso: "+empleado3.getEmepleado().getPiso());
        System.out.println("Ciudad: "+empleado3.getEmepleado().getCiudad());
    }
    
}
