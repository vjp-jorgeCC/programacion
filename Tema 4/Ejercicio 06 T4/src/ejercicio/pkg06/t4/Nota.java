/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg06.t4;

/**
 *
 * @author jorge
 */
public class Nota {
    public static void nota (int n1){
        if ((n1>=0)&&(n1<=4)) {
            System.out.println("Suspenso");
        }
        else{
            if ((n1>=5)&&(n1<=6)) {
                System.out.println("Bien");                
            }
            else{
                if ((n1>=7)&&(n1<=8)) {
                    System.out.println("Notable");
                }
                else{
                    if ((n1>=9)&&(n1<=10)) {
                        System.out.println("Sobresaliente");                        
                    }
                    else{
                        if (n1<0) {
                            System.out.println("No es una nota correcta");
                        }
                        else{
                            if (n1>10) {
                                System.out.println("No es una nota correcta");
                            }
                        }
                    }
                }
            }
        }
    }
}
