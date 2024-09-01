package factura;
import pedido.Pedido;

public class Factura {
    private Pedido pedido;
    private String fecha;
    private double montoTotal;
    private boolean pagado;

    public Factura(Pedido pedido, String fecha, double montoTotal) {
        this.pedido = pedido;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
        this.pagado = false;
    }

    public void marcarComoPagado() {
        this.pagado = true;
    }

    public String toString() {
        return "Factura para el pedido de " + pedido + ". Fecha: " + fecha + ", Monto Total: " + montoTotal + ", Pagado: " + pagado;
    }
}
