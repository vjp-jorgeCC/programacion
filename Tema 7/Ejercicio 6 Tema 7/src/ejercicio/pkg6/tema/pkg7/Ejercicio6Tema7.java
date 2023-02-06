/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6.tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio6Tema7 {
    public static int pedirNumero(){
        Scanner entrada=new Scanner (System.in);
        int numero=entrada.nextInt();
        return numero;
    }
    public static String pedirNombre(){
        Scanner entrada=new Scanner (System.in);
        String nombre=entrada.nextLine();
        return nombre;
    }
    public static double sueldo(Empleado empleadoAux){
        double sueldo;
        int resto;
        double tarifa;
        if (empleadoAux.getHorasTrabajo()>40) {
            resto=empleadoAux.getHorasTrabajo()%40;
            tarifa=resto*(empleadoAux.getTarifaPorHoras()*1.5);
            sueldo=(empleadoAux.getTarifaPorHoras()*40)+tarifa;           
        }
        else{
            sueldo= (double) empleadoAux.getHorasTrabajo()*empleadoAux.getTarifaPorHoras();
        }
        return sueldo;
    }
    public static void crearEmpleados(Empleado almacen[]){
        int contador=1;
        for (int i = 0; i < almacen.length; i++) {
            almacen[i]=new Empleado();
            System.out.println("------ Empleado "+contador+"------");
            System.out.println("Introduzca el nombre del empleado: ");
            almacen[i].setNombre(pedirNombre());
            System.out.println("¿Cuantas horas trabajo este mes?");
            almacen[i].setHorasTrabajo(pedirNumero());
            System.out.println("¿Cual es su tarifa por hora de trabajo?");
            almacen[i].setTarifaPorHoras(pedirNumero());
            System.out.println("-- EMPLEADO "+contador+" ALMACENADO CON EXITO --");
            contador++;
        }
    }
    public static void mostrarEmpleados(Empleado almacen[]){
        System.out.println("--- SUELDO BRUTO DE LOS EMPLEADOS ---");
        for (int i = 0; i < almacen.length; i++) {
            if (almacen[i] != null) {
               System.out.println(almacen[i].getNombre()+" trabajo "+almacen[i].getHorasTrabajo()
                    +" , cobra "+almacen[i].getTarifaPorHoras()+" euros la hora,"
                    + "por lo que le corresponde un sueldo de "+sueldo(almacen[i])); 
            }            
        }
    }
    public static void main(String[] args) {
        System.out.println("¿Cuantos empleados desea introducir?");
        Empleado[] almacen=new Empleado[pedirNumero()];
        crearEmpleados(almacen);
        mostrarEmpleados(almacen);
    }    
}
