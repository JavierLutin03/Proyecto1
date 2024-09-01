package control;

import java.util.ArrayList;
import pedido.Pedido;

import java.util.List;

import Productos.Producto;

public class ControlPedidos {
    private List<Pedido> pedidos;

    public ControlPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void actualizarPedido(Pedido pedido, String nuevoEstado) {
        pedido.actualizarEstado(nuevoEstado);
    }

   
    public String toString() {
        return "Control de Pedidos: " + pedidos;
    }

	public ArrayList<Producto> getPedido() {
		// TODO Auto-generated method stub
		return null;
	}
}
