package taller;

import java.util.Scanner;

public class AppTaller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Taller taller = new Taller("Taller Ironhack");

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Pérez", "600123456");
        Cliente cliente2 = new Cliente("Ana Gómez", "699987654");

        // Crear vehículos
        Vehiculo v1 = new Vehiculo("1234ABC", "Toyota", "Corolla", cliente1);
        Vehiculo v2 = new Vehiculo("5678DEF", "Ford", "Fiesta", cliente1);
        Vehiculo v3 = new Vehiculo("9012GHI", "Seat", "Ibiza", cliente2);

        cliente1.agregarVehiculo(v1);
        cliente1.agregarVehiculo(v2);
        cliente2.agregarVehiculo(v3);

        // Registrar clientes
        taller.registrarCliente(cliente1);
        taller.registrarCliente(cliente2);

        // Registrar reparaciones
        System.out.println("=== Registrar Reparación ===");
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Costo: ");
        double costo = Double.parseDouble(scanner.nextLine());
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        Reparacion reparacion = new Reparacion(descripcion, costo, matricula, marca, modelo);
        taller.registrarReparacion(reparacion);

        // Mostrar reparaciones
        System.out.println("\n=== Reparaciones Registradas ===");
        taller.listarReparaciones();

        System.out.println("Total de reparaciones: " + Taller.contarReparaciones());
    }
}

