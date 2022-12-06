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
        while(contadorImpar < 3){//Se repite siempre y cuando el contador de los impares es menor que 3.
            aleatorio = (Math.random()*100+1);//Genero un numero aleatorio entre el 1 y el 100.
            numero=(int)aleatorio;
            if ((numero%2)!= 0) {//Si el numero generado es impar lo muestro y sumo 1 al contador.
            System.out.println(numero);
            contadorImpar++;
            }
            contador++;//Siempre sumo uno al contador para saber cuantos intentos han sucedido.
        }
        System.out.println("La cantidad de intentos han sido: "+contador);//Muestro el conteo final de los intentos
    }    
}
