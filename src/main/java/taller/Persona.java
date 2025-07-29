package taller;

public abstract class Persona {
    protected final String nombre;
    protected final String telefono;

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public abstract void mostrarInfo();
}

