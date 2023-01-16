/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg19.tema.pkg5;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio19Tema5 {
    public static String pedirNombre(){
        Scanner entrada=new Scanner(System.in);
        String nombre;
        System.out.println("Introduce nombre: ");
        nombre=entrada.nextLine();
        return nombre;
    }
    public static int pedirHoras(){
        Scanner entrada=new Scanner(System.in);
        int horas;
        System.out.println("Introduce horas: ");
        horas=entrada.nextInt();
        return horas;
    }
    public static int pedirTarifa(){
        Scanner entrada=new Scanner(System.in);
        int tarifa;
        System.out.println("Introduce tarifa: ");
        tarifa=entrada.nextInt();
        return tarifa;
    }
    public static void calcularSueldoBruto(Empleado empleado){
        double salarioBruto;
        if (empleado.getHoras() < 40) {
            salarioBruto=empleado.getHoras()*empleado.getTarifa();
        }
        else{
            salarioBruto=empleado.getHoras()*(empleado.getTarifa()*1.5);
        }
        System.out.println(empleado.getNombre()+" trabajo "+empleado.getHoras()+" horas, tarifa de "+empleado.getTarifa()+"€ luego cobra un total de "+salarioBruto+"€");
    }
    public static void main(String[] args) {
        int horas1,horas2,horas3, tarifa1,tarifa2,tarifa3;
        String nombre1,nombre2,nombre3;
        
        System.out.println("INTRODUCE LOS DATOS DEL EMPLEADO 1");
        Empleado emp1=new Empleado();
        nombre1=pedirNombre();
        horas1=pedirHoras();
        tarifa1=pedirTarifa();
        
        System.out.println("INTRODUCE LOS DATOS DEL EMPLEADO 2");
        Empleado emp2=new Empleado();
        nombre2=pedirNombre();
        horas2=pedirHoras();
        tarifa2=pedirTarifa();
        
        System.out.println("INTRODUCE LOS DATOS DEL EMPLEADO 3");
        Empleado emp3=new Empleado();
        nombre3=pedirNombre();
        horas3=pedirHoras();
        tarifa3=pedirTarifa();
        
        emp1.setNombre(nombre1);
        emp1.setHoras(horas1);
        emp1.setTarifa(tarifa1);
        
        
        emp2.setNombre(nombre2);
        emp2.setHoras(horas2);
        emp2.setTarifa(tarifa2);
        
        
        emp3.setNombre(nombre3);
        emp3.setHoras(horas3);
        emp3.setTarifa(tarifa3);
        
        calcularSueldoBruto(emp1);
        calcularSueldoBruto(emp2);
        calcularSueldoBruto(emp3);
        
        
        
        
        
        
    }
    
}
