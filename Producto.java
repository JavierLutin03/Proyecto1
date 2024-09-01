package Productos;

public class Producto {
    private String nombre;
    private String tipo; // "Importado" o "Local"
    private int cantidadEnStock;

    public Producto(String nombre, String tipo, int cantidadEnStock) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadEnStock = cantidadEnStock;
    }

    public void actualizarStock(int cantidad) {
        this.cantidadEnStock += cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    
    public String toString() {
        return "Producto: " + nombre + ", Tipo: " + tipo + ", Stock: " + cantidadEnStock;
    }
}
