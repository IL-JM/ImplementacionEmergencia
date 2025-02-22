/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author juanm
 */
public class atenderEmergencia {
   
    private int tiempoTotalEmergencia;
    private int tiempoEmergencia;

    
    public void sumaTiempoTotal() {
        
        tiempoTotalEmergencia+= getTiempoEmergencia();
    }

    public atenderEmergencia() {
    }

    public atenderEmergencia(int tiempoTotalEmergencia, int tiempoEmergencia) {
        this.tiempoTotalEmergencia = tiempoTotalEmergencia;
        this.tiempoEmergencia = tiempoEmergencia;
    }
    
    

    /**
     * Get the value of tiempoEmergencia
     *
     * @return the value of tiempoEmergencia
     */
    public int getTiempoEmergencia() {
        return tiempoEmergencia;
    }

    /**
     * Set the value of tiempoEmergencia
     *
     * @param tiempoEmergencia new value of tiempoEmergencia
     */
    public void setTiempoEmergencia(int tiempoEmergencia) {
        this.tiempoEmergencia = tiempoEmergencia;
    }


    /**
     * Get the value of tiempoTotalEmergencia
     *
     * @return the value of tiempoTotalEmergencia
     */
    public int getTiempoTotalEmergencia() {
        return tiempoTotalEmergencia;
    }

    /**
     * Set the value of tiempoTotalEmergencia
     *
     * @param tiempoTotalEmergencia new value of tiempoTotalEmergencia
     */
    public void setTiempoTotalEmergencia(int tiempoTotalEmergencia) {
        this.tiempoTotalEmergencia = tiempoTotalEmergencia;
    }

}
