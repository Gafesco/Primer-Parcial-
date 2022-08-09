/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author HP
 */
public class Vehiculo_aereo extends Vehículo{

    public Vehiculo_aereo(String aereo, String marca, String color, String año) {
        super(marca, color, año);
        this.aereo = aereo;
    }
    
    
    private String aereo;

    public String getAereo() {
        return aereo;
    }

    public void setAereo(String aereo) {
        this.aereo = aereo;
    }
    

    
}
