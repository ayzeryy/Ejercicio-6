package modelo;

import interfaces.Accionable;

public class ValvulaAutomatica extends Dispositivo implements Accionable {

    public ValvulaAutomatica(int id, String nombre, String fabricante, double consumoElectrico) {
        super(id, nombre, fabricante, consumoElectrico);
    }

    @Override
    public void ejecutarAccion() {
        System.out.println("Válvula automática abriendo flujo de agua...");
    }
}
