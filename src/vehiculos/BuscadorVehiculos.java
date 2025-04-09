package vehiculos;

import java.util.ArrayList;

public class BuscadorVehiculos {

    /**
     * Busca un vehículo en la lista por su patente.
     *
     * @param vehiculos La lista de vehículos.
     * @param patenteBuscada La patente a buscar.
     * @return El vehículo encontrado o null si no existe coincidencia.
     */
    public static Vehiculo buscarPorPatente(ArrayList<Vehiculo> vehiculos, String patenteBuscada) {
        if (vehiculos == null || patenteBuscada == null) {
            return null;
        }
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPatente().equalsIgnoreCase(patenteBuscada)) {
                return vehiculo;
            }
        }
        return null;
    }
}
