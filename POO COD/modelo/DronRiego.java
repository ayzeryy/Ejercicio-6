package modelo;

import interfaces.Accionable;
import interfaces.Registrable;

public class DronRiego extends Dispositivo implements Accionable, Registrable {

    public DronRiego(int id, String nombre, String fabricante, double consumoElectrico) {
        super(id, nombre, fabricante, consumoElectrico);
    }

    @Override
    public void ejecutarAccion() {
        System.out.println("Dron de riego ejecutando vuelo de riego automático...");
    }

    @Override
    public String registrarDatos() {
        return "Dron registró recorrido y volumen de agua aplicado.";
    }
}
