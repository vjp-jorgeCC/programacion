/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.util.ArrayList;

/**
 *
 * @author jcidc07
 */
public class Plantacion {
    private String cultivo;
    private ArrayList<Sector> lSectores;
    

    public Plantacion() {
        cultivo = "";
        lSectores = new ArrayList<>();
        
    }

    public Plantacion( String cultivo,ArrayList<Sector> lSectores) {
        this.cultivo = cultivo;
        this.lSectores = new ArrayList<>();
        
    }

    public ArrayList<Sector> getlSectores() {
        return lSectores;
    }

    public void setlSectores(ArrayList<Sector> lSectores) {
        this.lSectores = lSectores;
    }

    public String getCultivo() {
        return cultivo;
    }

    public void setCultivo(String cultivo) {
        this.cultivo = cultivo;
    }
    
    
    
    
    
    
}
