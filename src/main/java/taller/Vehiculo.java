package taller;

public class Vehiculo {
    private final String matricula;
    private String marca;
    private String modelo;
    private Cliente propietario;

    public Vehiculo(String matricula, String marca, String modelo, Cliente propietario) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarInfoVehiculo() {
        System.out.println("Matrícula: " + matricula + " | Marca: " + marca + " | Modelo: " + modelo + 
                           " | Propietario: " + (propietario != null ? propietario.getNombre() : "Sin asignar"));
    }
}

