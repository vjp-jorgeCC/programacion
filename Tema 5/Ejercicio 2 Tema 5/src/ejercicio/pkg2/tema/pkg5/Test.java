/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2.tema.pkg5;

/**
 *
 * @author jcidc07
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso curso1=new Curso();
        Curso.sumarCursos(); //+1
        Curso curso2=new Curso();
        Curso.sumarCursos(); //+1
        
        curso1.setNombre("Phyton");
        curso1.setNumeroHoras(30);
        
        curso2.setNombre("Android");
        curso2.setNumeroHoras(50);
        
        System.out.println("Nombre del curso: "+curso1.getNombre());
        System.out.println("Horas del curso: "+curso1.getNumeroHoras());
        
        System.out.println("Nombre del curso: "+curso2.getNombre());
        System.out.println("Horas del curso: "+curso2.getNumeroHoras());
        
        Curso.verNumeroCursos();
        
        
    }
    
}
