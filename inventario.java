package intentario;

import java.util.List;
import Productos.Producto;


public class Inventario {
    private List<Producto> productos;

    public Inventario(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void removerProducto(Producto producto) {
        productos.remove(producto);
    }

    
    public String toString() {
        return "Inventario: " + productos;
    }
}
