package modelo;

import java.util.*;

public class CatalogoDispositivos {
    private List<Dispositivo> dispositivos = new ArrayList<>();

    public void inicializarCatalogo() {
        dispositivos.add(new SensorSuelo(1, "Sensor suelo 1", "AgroTech", 2.1));
        dispositivos.add(new EstacionMeteorologica(2, "Estación Meteo 1", "ClimaCorp", 3.4));
        dispositivos.add(new DronRiego(3, "Dron Riego 1", "AeroAgro", 12.5));
        dispositivos.add(new CamaraMultiespectral(4, "Cámara M1", "VisionTech", 5.2));
        dispositivos.add(new ValvulaAutomatica(5, "Válvula Norte", "HydroSys", 1.8));
        
    }

    public void listarDispositivos() {
        for (Dispositivo d : dispositivos) {
            System.out.println(d);
        }
    }

    public Dispositivo buscarPorId(int id) {
        for (Dispositivo d : dispositivos) {
            if (d.getId() == id) return d;
        }
        return null;
    }

    public Dispositivo buscarPorNombre(String nombre) {
        for (Dispositivo d : dispositivos) {
            if (d.getNombre().equalsIgnoreCase(nombre)) return d;
        }
        return null;
    }

    public void ordenarPorConsumo() {
        Collections.sort(dispositivos);
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }
}
