/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author HP
 */
public class avion extends Vehiculo_aereo{

    public avion(String avion, String turbina, String aereo, String marca, String color, String año) {
        super(aereo, marca, color, año);
        this.avion = avion;
        this.turbina = turbina;
    }


    
    
    private String avion,turbina;

    public String getAvion() {
        return avion;
    }

    public void setAvion(String avion) {
        this.avion = avion;
    }

    public String getTurbina() {
        return turbina;
    }

    public void setTurbina(String turbina) {
        this.turbina = turbina;
    }


    
    
}
