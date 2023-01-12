/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pizarra.pkg1;

/**
 *
 * @author jcidc07
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente1=new Paciente();
        Paciente.sumarPaciente();
        Paciente paciente2=new Paciente("Nacho","Dolor de barriga");
        Paciente.sumarPaciente();
        Paciente paciente3=new Paciente("Hugo");
        Paciente.sumarPaciente();
        
        paciente3.setSintomas("Dolor de espalda");
        
        System.out.println("---------PACIENTE 1---------");
        System.out.println("Nombre: "+paciente1.getNombre());
        System.out.println("Sintomas: "+paciente1.getSintomas());
        
        System.out.println("---------PACIENTE 2---------");
        System.out.println("Nombre: "+paciente2.getNombre());
        System.out.println("Sintomas: "+paciente2.getSintomas());
        
        System.out.println("---------PACIENTE 3---------");
        System.out.println("Nombre: "+paciente3.getNombre());
        System.out.println("Sintomas: "+paciente3.getSintomas());
        
        System.out.println("------------------------------");
        System.out.println("TOTAL DE PACIENTES: "+Paciente.verPaciente());
    }
    
}
