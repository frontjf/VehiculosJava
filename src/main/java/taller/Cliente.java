package taller;

import java.util.ArrayList;

public class Cliente extends Persona {
    private ArrayList<Vehiculo> vehiculos;

    public Cliente(String nombre, String telefono) {
        super(nombre, telefono);
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + " - Teléfono: " + telefono);
        System.out.println("Vehículos:");
        for (Vehiculo v : vehiculos) {
            v.mostrarInfoVehiculo();
        }
    }
}
