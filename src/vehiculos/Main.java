package vehiculos;

public class Main {
    public static void main(String[] args) {
        // Crear tres instancias de Vehiculo con nuevos datos de ejemplo
        Vehiculo vehiculo1 = new Vehiculo("XYZ321", "Renault", 2016, 800.0);
        Vehiculo vehiculo2 = new Vehiculo("LMN789", "Mercedes", 2019, 900.0);
        Vehiculo vehiculo3 = new Vehiculo("QRS456", "BMW", 2021, 700.0);

        VehiculoPrinter printer = new VehiculoPrinter();

        // Instancia de Camion
        Vehiculo camion1 = new Camion("CAM001", "Volvo", 2018, 1200.0, true);

        // Imprimir información de cada vehículo
        System.out.println("Información del Vehículo 1:");
        printer.imprimirInformacion(vehiculo1);

        System.out.println("Información del Vehículo 2:");
        printer.imprimirInformacion(vehiculo2);

        System.out.println("Información del Vehículo 3:");
        printer.imprimirInformacion(vehiculo3);

        System.out.println("Información de un Camión:");
        printer.imprimirInformacion(camion1);
    }
}