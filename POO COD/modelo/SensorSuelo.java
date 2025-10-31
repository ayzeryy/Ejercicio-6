package modelo;

import interfaces.Medible;
import interfaces.Registrable;

public class SensorSuelo extends Dispositivo implements Medible, Registrable {

    public SensorSuelo(int id, String nombre, String fabricante, double consumoElectrico) {
        super(id, nombre, fabricante, consumoElectrico);
    }

    @Override
    public double medir() {
        return Math.random() * 100; // Humedad o temperatura simulada
    }

    @Override
    public String registrarDatos() {
        return "Sensor de suelo registró humedad: " + medir() + "%";
    }
}
