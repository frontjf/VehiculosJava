package taller;

public class Reparacion {
    private Vehiculo vehiculo;
    private String descripcion;
    private double costo;

    public Reparacion(String descripcion, double costo, String matricula, String marca, String modelo) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.vehiculo = new Vehiculo(matricula, marca, modelo, null); // Vehículo interno
    }

    public void mostrarInfoReparacion() {
        System.out.println("Reparación:");
        System.out.println("- Descripción: " + descripcion);
        System.out.println("- Costo: " + costo + " €");
        System.out.println("- Vehículo:");
        vehiculo.mostrarInfoVehiculo();
    }
}

