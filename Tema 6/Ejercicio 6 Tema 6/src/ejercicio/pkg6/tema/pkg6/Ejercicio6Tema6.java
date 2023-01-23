/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6.tema.pkg6;

/**
 *
 * @author jorge
 */
public class Ejercicio6Tema6 {
    public static void rellenarVector(int vNum[]){
        int entero;
        boolean primo=true;
        int divisor=2;
        int n1=0;
        for (int i = 0; i < vNum.length ; i++) {
          while((primo)&&(n1!=divisor)){
            if  (vNum[i] % divisor == 0){
                primo=false;
                n1++;
            }
            divisor++;
            vNum
            
        }  
        }
        
    }
    public static void main(String[] args) {
        int vNum[]=new int[80];
        rellenarVector(vNum);
    }
    
}
