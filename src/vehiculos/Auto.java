package vehiculos;

public class Auto extends Vehiculo {
    // Atributo específico de Auto
    private int cantidadPasajeros;

    /**
     * Constructor de Auto que recibe todos los parámetros de Vehiculo
     * y asigna la cantidad de pasajeros, validando que sea mayor a 0.
     *
     * @param patente           La patente del vehículo.
     * @param marca             La marca del vehículo.
     * @param anio              El año del vehículo.
     * @param capacidadCargaKg  La capacidad de carga en Kg.
     * @param cantidadPasajeros La cantidad de pasajeros que soporta el Auto.
     */
    public Auto(String patente, String marca, int anio, double capacidadCargaKg, int cantidadPasajeros) {
        // Se invoca el constructor de la clase base Vehiculo
        super(patente, marca, anio, capacidadCargaKg);
        if (cantidadPasajeros <= 0) {
            throw new IllegalArgumentException("La cantidad de pasajeros debe ser mayor a 0");
        }
        this.cantidadPasajeros = cantidadPasajeros;
    }

    // Getter para cantidadPasajeros
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    // Setter para cantidadPasajeros, con validación
    public void setCantidadPasajeros(int cantidadPasajeros) {
        if (cantidadPasajeros <= 0) {
            throw new IllegalArgumentException("La cantidad de pasajeros debe ser mayor a 0");
        }
        this.cantidadPasajeros = cantidadPasajeros;
    }

    /**
     * Sobrescribe el getInformacionExtra() para retornar
     * la información específica de la clase Auto.
     *
     * @return Una cadena que indica la cantidad de pasajeros.
     */
    @Override
    public String getInformacionExtra() {
        return "Cantidad de pasajeros: " + cantidadPasajeros;
    }
}
