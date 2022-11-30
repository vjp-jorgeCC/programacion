/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg31.t3;

/**
 *
 * @author jorge
 */
public class Ejercicio31T3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int contador=0,contadorImpar=0,numero;
        double aleatorio;
        System.out.println("Los numeros impares obtenidos han sido: ");
        while(contadorImpar < 3){//Hago que se repita hasta que me de 3 impares
            aleatorio = (Math.random()*100+1);//Genero un aleatorio
            numero=(int)aleatorio;
            if ((numero%2)!= 0) {//Si el resto no me da 0, es impar luego sumo uno al contador.
            System.out.println(numero);
            contadorImpar++;
            }
            contador++;//Añado siempre uno al contador
        }
        System.out.println("La cantidad de intentos han sido: "+contador);//Muestro el numero de intentos
    }    
}
