package vehiculos;

public class Vehiculo {
    // Atributos privados
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    // Constructor con validaciones
    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        if (patente == null || patente.isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula o vacía");
        }
        int anioActual = java.time.Year.now().getValue();
        if (anio < 1900 || anio > anioActual) {
            throw new IllegalArgumentException("El año debe estar entre 1900 y " + anioActual);
        }
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser mayor a cero");
        }

        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    // Getters y Setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente == null || patente.isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula o vacía");
        }
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        int anioActual = java.time.Year.now().getValue();
        if (anio < 1900 || anio > anioActual) {
            throw new IllegalArgumentException("El año debe estar entre 1900 y " + anioActual);
        }
        this.anio = anio;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser mayor a cero");
        }
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public void mostrarInformacion() {
        System.out.println("Patente: " + this.patente);
        System.out.println("Marca: " + this.marca);
        System.out.println("Año: " + this.anio);
        System.out.println("Capacidad de carga (Kg): " + this.capacidadCargaKg);
    }
}
