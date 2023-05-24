/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.Serializable;

/**
 *
 * @author jcidc07
 */
public class Coche implements Serializable{
    private String matricula;
    private int kms;
    private String fecha;

    public Coche() {
        matricula = "";
        kms = 0;
        fecha = "";
    }

    public Coche(String matricula, int kms, String fecha) {
        this.matricula = matricula;
        this.kms = kms;
        this.fecha = fecha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
