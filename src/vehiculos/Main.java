package vehiculos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de diferentes tipos de vehículo
        Vehiculo vehiculo1 = new Vehiculo("XYZ321", "Renault", 2016, 800.0);
        Vehiculo camion1 = new Camion("CAM001", "Volvo", 2018, 1200.0, true);
        Vehiculo auto1 = new Auto("AUTO001", "Audi", 2020, 600.0, 5);

        // Agregar las instancias a un ArrayList
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo1);
        vehiculos.add(camion1);
        vehiculos.add(auto1);

        VehiculoPrinter printer = new VehiculoPrinter();

        // Recorrer la lista e imprimir la información de cada vehículo
        for (Vehiculo vehiculo : vehiculos) {
            printer.imprimirInformacion(vehiculo);
            System.out.println("-------------------------------");
        }

        // Realizar búsquedas por patente
        String patenteBusqueda1 = "LMN789";
        String patenteBusqueda2 = "XYZ321";

        Vehiculo encontrado1 = BuscadorVehiculos.buscarPorPatente(vehiculos, patenteBusqueda1);
        if (encontrado1 != null) {
            System.out.println("Vehículo encontrado con patente " + patenteBusqueda1 + ":");
            printer.imprimirInformacion(encontrado1);
        } else {
            System.out.println("No se encontró vehículo con la patente " + patenteBusqueda1);
        }

        Vehiculo encontrado2 = BuscadorVehiculos.buscarPorPatente(vehiculos, patenteBusqueda2);
        if (encontrado2 != null) {
            System.out.println("Vehículo encontrado con patente " + patenteBusqueda2 + ":");
            printer.imprimirInformacion(encontrado2);
        } else {
            System.out.println("No se encontró vehículo con la patente " + patenteBusqueda2);
        }
    }
}
