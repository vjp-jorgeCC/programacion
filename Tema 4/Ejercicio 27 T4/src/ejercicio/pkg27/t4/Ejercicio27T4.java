/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg27.t4;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio27T4 {
    public static int moneda(){
        int moneda;
        double aleatorio=Math.random()*2+1;
        moneda=(int)aleatorio;
        return moneda;
    }
    public static boolean caraCruz(int n1){
        boolean caraCruz;
        if (n1==1) {
            System.out.println("Ha salido cruz.");
            caraCruz=true;
        }
        else{
            caraCruz=false;
            System.out.println("Ha salido cara");
        }
        return caraCruz;
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        String cara,cruz,resultado;
        boolean caraCruz;
        boolean caraCruzUsuario;        
        cara="cara";
        cruz="cruz";
        do {
            int moneda=moneda();
            System.out.println("Introduce cara o cruz ");
            resultado=entrada.nextLine();
            caraCruz=caraCruz(moneda);
        
        if (resultado.equals(cruz)) {
            caraCruzUsuario=true;
        }
        else{
            caraCruzUsuario=false;
        }
            if (caraCruz!=caraCruzUsuario) {
            System.out.println("Intentalo de nuevo");
            }
        } while (caraCruz!=caraCruzUsuario);
        System.out.println("ENHORABUENA!!");               
    }
    
}
