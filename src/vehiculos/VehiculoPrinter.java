package vehiculos;

public class VehiculoPrinter {

    /**
     * Imprime en consola la información completa de un objeto Vehiculo.
     *
     * @param vehiculo El objeto Vehiculo cuyos datos se van a imprimir.
     */
    public void imprimirInformacion(Vehiculo vehiculo) {
        if (vehiculo == null) {
            System.out.println("El vehículo es null.");
            return;
        }
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad de Carga (Kg): " + vehiculo.getCapacidadCargaKg());
    }
}
