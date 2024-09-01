package orden;
import Productos.Producto;

public class OrdenCompra {
    private Producto producto;
    private int cantidad;
    private String proveedor;
    private String estado;

    public OrdenCompra(Producto producto, int cantidad, String proveedor) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
        this.estado = "Pendiente";
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    
    public String toString() {
        return "Orden de Compra para " + producto.getNombre() + " por " + cantidad + " unidades. Proveedor: " + proveedor + ". Estado: " + estado;
    }
}
