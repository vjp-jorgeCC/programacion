/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 
        ejercicio.pkg3.tema.pkg5;

/**
 *
 * @author jcidc07
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rueda rueda1=new Rueda();
        Rueda rueda2=new Rueda();
        
        rueda1.setMaterial("Caucho");
        rueda1.setPulgadas(15);
        
        rueda2.setMaterial("Corcho");
        rueda2.setPulgadas(10);
        
        System.out.println("Material de la rueda 1: "+rueda1.getMaterial());
        System.out.println("Pulgadas de la rueda 1: "+rueda1.getPulgadas());
        
        System.out.println("Material de la rueda 2: "+rueda2.getMaterial());
        System.out.println("Pulgadas de la rueda 2: "+rueda2.getPulgadas());
        
        Coche coche1=new Coche();
        Coche coche2=new Coche();
        Coche coche3=new Coche();
        
        coche1.setMarca("Seat");
        coche1.setModelo("Cordoba");
        
        coche2.setMarca("Mercedes");
        coche2.setModelo("Benz");
        
        coche3.setMarca("Ford");
        coche3.setModelo("Fiesta");
        
        coche1.setRuedas(rueda1);
        coche2.setRuedas(rueda1);
        coche3.setRuedas(rueda2);
        
        System.out.println("---------COCHE 1---------");
        System.out.println("La marca del coche 1 es: "+coche1.getMarca());
        System.out.println("El modelo del coche 1 es: "+coche1.getModelo());
        System.out.println("El material de la rueda del coche 1 es: "+coche1.getRuedas().getMaterial());
        System.out.println("La pulgada de la rueda del coche 1 es:"+coche1.getRuedas().getPulgadas());
        
        System.out.println("---------COCHE 2---------");
        System.out.println("La marca del coche 2 es: "+coche2.getMarca());
        System.out.println("El modelo del coche 2 es: "+coche2.getModelo());
        System.out.println("El material de la rueda del coche 2 es: "+coche2.getRuedas().getMaterial());
        System.out.println("La pulgada de la rueda del coche 2 es:"+coche2.getRuedas().getPulgadas());
        
        System.out.println("---------COCHE 3---------");
        System.out.println("La marca del coche 3 es: "+coche3.getMarca());
        System.out.println("El modelo del coche 3 es: "+coche3.getModelo());
        System.out.println("El material de la rueda del coche 3 es: "+coche3.getRuedas().getMaterial());
        System.out.println("La pulgada de la rueda del coche 3 es:"+coche3.getRuedas().getPulgadas());
    }
    
}
