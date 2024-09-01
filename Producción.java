package producción;
import Productos.Producto;

public class Produccion {
    private Producto producto;
    private int cantidadEnFabricacion;
    private String estado;

    public Produccion(Producto producto, int cantidadEnFabricacion) {
        this.producto = producto;
        this.cantidadEnFabricacion = cantidadEnFabricacion;
        this.estado = "En fabricación";
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    @Override
    public String toString() {
        return "Producción de " + producto.getNombre() + ". Cantidad en fabricación: " + cantidadEnFabricacion + ", Estado: " + estado;
    }
}
