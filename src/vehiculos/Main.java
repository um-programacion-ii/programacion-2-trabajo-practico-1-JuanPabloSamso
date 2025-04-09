package vehiculos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de vehículo
        Vehiculo vehiculo1 = new Vehiculo("XYZ321", "Renault", 2016, 800.0);
        Vehiculo camion1 = new Camion("CAM001", "Volvo", 2018, 1200.0, true);
        Vehiculo auto1 = new Auto("AUTO001", "Audi", 2020, 600.0, 5);

        // Crear un ArrayList para gestionar de forma dinámica los vehículos
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo1);
        vehiculos.add(camion1);
        vehiculos.add(auto1);

        // Instanciar VehiculoPrinter para imprimir la información de cada vehículo
        VehiculoPrinter printer = new VehiculoPrinter();

        // Recorrer la lista e imprimir la información de cada vehículo
        for (Vehiculo vehiculo : vehiculos) {
            printer.imprimirInformacion(vehiculo);
            System.out.println("-------------------------------");
        }
    }
}
