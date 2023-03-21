/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg06.tema.pkg11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author jcidc07
 */
public class Ejercicio06Tema11 {
    public static void menu(Campania campania){
        int opc;
        do {
            System.out.println("1. Añadir donacion");
            System.out.println("2. Mostrar donacion");
            System.out.println("3. Mostrar donacion por nombre de donante");
            System.out.println("4. Mostrar numero de donaciones");
            System.out.println("5. Mostrar total dinero recaudado");
            System.out.println("6. Ordenar donaciones");
            System.out.println("7. Salir");
            opc=Campania.pedirImporte();
            switch(opc){
                case 1:
                    campania.anadirDonaciones();
                    break;
                case 2:
                    campania.mostrarDonaciones();
                    break;
                case 3:
                    campania.mostrarDonacionPorNombre();
                    break;
                case 4:
                    System.out.println("Numero de donaciones total: "+campania.numeroDonaciones());
                    break;
                case 5:
                    System.out.println("Total dinero recaudado: "+campania.totalDineroRecaudado());
                    break;
                case 6:
                    campania.ordenarDonaciones();
                    break;
                    
            }
        } while (opc!=7);        
    }
    public static void main(String[] args) {
        Campania campania = new Campania("contra el Covid");
        menu(campania);
    }
    
}
