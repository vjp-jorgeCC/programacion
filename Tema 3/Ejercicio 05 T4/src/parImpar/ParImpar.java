/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parImpar;

/**
 *
 * @author jcidc07
 */
public class ParImpar {
    public static void operacion (int n){
        if ((n%2)==0) {//Si el resto de dividir entre 2 es 0, significa que es par
            System.out.println("El numero "+n+" es PAR.");
        }
        else{
            System.out.println("El numero "+n+" es IMPAR");
        }
    }
}
