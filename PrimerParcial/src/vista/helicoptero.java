/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author HP
 */
public class helicoptero extends Vehiculo_aereo {

    public helicoptero(String helicoptero, String helice, String aereo, String marca, String color, String año) {
        super(aereo, marca, color, año);
        this.helicoptero = helicoptero;
        this.helice = helice;
    }

    
  private String helicoptero, helice;

    public String getHelicoptero() {
        return helicoptero;
    }

    public void setHelicoptero(String helicoptero) {
        this.helicoptero = helicoptero;
    }

    public String getHelice() {
        return helice;
    }

    public void setHelice(String helice) {
        this.helice = helice;
    }
  
  



}
