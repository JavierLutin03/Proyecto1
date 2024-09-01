package Clientes;

public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    
    public String toString() {
        return "Cliente: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono;
    }
}
