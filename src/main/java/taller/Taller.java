package taller;

import java.util.ArrayList;

public class Taller {
    private final String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Reparacion> reparaciones;
    private static int totalReparaciones = 0;

    public Taller(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.reparaciones = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarReparacion(Reparacion reparacion) {
        reparaciones.add(reparacion);
        totalReparaciones++;
    }

    public void listarReparaciones() {
        for (Reparacion r : reparaciones) {
            r.mostrarInfoReparacion();
            System.out.println("---------------------");
        }
    }

    public static int contarReparaciones() {
        return totalReparaciones;
    }
}

