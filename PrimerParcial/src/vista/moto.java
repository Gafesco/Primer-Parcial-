
package vista;

/**
 *
 * @author HP
 */
public class moto extends Vehiculo_terrestre{

    public moto(String moto, String ruedas, String terrestre, String marca, String color, String año) {
        super(terrestre, marca, color, año);
        this.moto = moto;
        this.ruedas = ruedas;
    }

    
    private String moto, ruedas;

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }



    
}
