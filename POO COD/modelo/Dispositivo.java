package modelo;

public abstract class Dispositivo implements Comparable<Dispositivo> {
    protected int id;
    protected String nombre;
    protected String fabricante;
    protected double consumoElectrico;

    public Dispositivo(int id, String nombre, String fabricante, double consumoElectrico) {
        this.id = id;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.consumoElectrico = consumoElectrico;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getFabricante() { return fabricante; }
    public double getConsumoElectrico() { return consumoElectrico; }

    public void setConsumoElectrico(double consumo) { this.consumoElectrico = consumo; }

    @Override
    public int compareTo(Dispositivo otro) {
        return Double.compare(this.consumoElectrico, otro.consumoElectrico);
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Nombre: %s | Fabricante: %s | Consumo: %.2f kWh",
                id, nombre, fabricante, consumoElectrico);
    }
}
