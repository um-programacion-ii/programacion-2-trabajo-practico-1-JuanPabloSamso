package vehiculos;

public class Camion extends Vehiculo {
    // Atributo adicional
    private boolean tieneAcoplado;

    // Constructor que llama al de la clase base y asigna el atributo extra
    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) {
        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    // Getter para tieneAcoplado
    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    // Setter para tieneAcoplado
    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    @Override
    public String getInformacionExtra() {
        return "Tiene acoplado: " + (tieneAcoplado ? "Sí" : "No");
    }
}
