package modelo;

import interfaces.Medible;
import interfaces.Registrable;

public class EstacionMeteorologica extends Dispositivo implements Medible, Registrable {

    public EstacionMeteorologica(int id, String nombre, String fabricante, double consumoElectrico) {
        super(id, nombre, fabricante, consumoElectrico);
    }

    @Override
    public double medir() {
        return 20 + Math.random() * 15; // Temperatura simulada xd 
    }

    @Override
    public String registrarDatos() {
        return "Estación meteorológica registró temperatura: " + medir() + "°C";
    }
}
