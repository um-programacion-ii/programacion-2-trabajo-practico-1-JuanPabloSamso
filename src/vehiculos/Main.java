package vehiculos;

public class Main {
    public static void main(String[] args) {
        // Crear tres instancias de Vehiculo con nuevos datos de ejemplo
        Vehiculo vehiculo1 = new Vehiculo("XYZ321", "Renault", 2016, 800.0);
        Vehiculo vehiculo2 = new Vehiculo("LMN789", "Mercedes", 2019, 900.0);
        Vehiculo vehiculo3 = new Vehiculo("QRS456", "BMW", 2021, 700.0);

        VehiculoPrinter printer = new VehiculoPrinter();

        // Imprimir información de cada vehículo
        System.out.println("Información del Vehículo 1:");
        printer.imprimirInformacion(vehiculo1);

        System.out.println("Información del Vehículo 2:");
        printer.imprimirInformacion(vehiculo2);

        System.out.println("Información del Vehículo 3:");
        printer.imprimirInformacion(vehiculo3);

    }
}
