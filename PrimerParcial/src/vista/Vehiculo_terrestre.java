/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author HP
 */
public class Vehiculo_terrestre extends Vehículo {

    public Vehiculo_terrestre(String terrestre, String marca, String color, String año) {
        super(marca, color, año);
        this.terrestre = terrestre;
    }
    
    private String terrestre;

    public String getTerrestre() {
        return terrestre;
    }

    public void setTerrestre(String terrestre) {
        this.terrestre = terrestre;
    }

        
        
    }

