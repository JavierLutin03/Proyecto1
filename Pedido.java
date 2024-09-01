package pedido;

import java.util.List;
import Clientes.Cliente;
import Productos.Producto;
import modificacion.modificacion;



public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private List<modificacion> modificaciones;
    private String estado;
	private List<modificacion> modificacion;

    public Pedido(Cliente cliente, List<Producto> productos, List<modificacion> modificaciones) {
        this.cliente = cliente;
        this.productos = productos;
        this.modificacion = modificaciones;
        this.estado = "En proceso";
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public String toString() {
        return "Pedido de " + cliente.getNombre() + " con productos " + productos + " y modificaciones " + modificacion + ". Estado: " + estado;
    }
}
