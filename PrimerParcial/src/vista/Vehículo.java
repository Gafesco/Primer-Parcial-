/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/** 
 *
 * @author HP
 */
abstract class Vehículo {
    
    private String marca, color, año;

    public Vehículo(String marca, String color, String año) {
        this.marca = marca;
        this.color = color;
        this.año = año;
    }


    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
    
    protected void agregar (){
        
    }
}
