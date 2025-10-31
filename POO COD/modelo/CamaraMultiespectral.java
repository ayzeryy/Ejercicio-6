package modelo;

import interfaces.Registrable;

public class CamaraMultiespectral extends Dispositivo implements Registrable {

    public CamaraMultiespectral(int id, String nombre, String fabricante, double consumoElectrico) {
        super(id, nombre, fabricante, consumoElectrico);
    }

    @Override
    public String registrarDatos() {
        return "Cámara multiespectral capturó imágenes de alta resolución.";
    }
}
