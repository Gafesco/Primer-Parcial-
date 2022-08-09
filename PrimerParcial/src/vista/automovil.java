/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author HP
 */
public class automovil extends Vehiculo_terrestre{

    public automovil(String automovil, String ruedas, String terrestre, String marca, String color, String año) {
        super(terrestre, marca, color, año);
        this.automovil = automovil;
        this.ruedas = ruedas;
    }
    


    
    
    private String automovil, ruedas;

    public String getAutomovil() {
        return automovil;
    }

    public void setAutomovil(String automovil) {
        this.automovil = automovil;
    }

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }
    

 
    

}

