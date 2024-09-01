package interfaz;

import java.util.Scanner;
import control.ControlPedidos;
import Clientes.Cliente;
import pedido.Pedido;
import java.util.ArrayList;
import Productos.Producto;






public class InterfazUsuario {
    private Scanner scanner;
    private ControlPedidos controlPedidos;

    public InterfazUsuario(ControlPedidos controlPedidos) {
        this.scanner = new Scanner(System.in);
        this.controlPedidos = controlPedidos;
    }

    public void iniciar() {
        System.out.println("Bienvenido a Los Globitos - Sistema de Gestión");
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    crearPedido();
                    break;
                case 2:
                    listarPedidos();
                    break;
                case 3:
                    actualizarEstadoPedido();
                    break;
                case 4:
                    System.out.println("Saliendo");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("\n1. Crear Pedido");
        System.out.println("2. Listar Pedidos");
        System.out.println("3. Actualizar Estado de un Pedido");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void crearPedido() {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese la dirección del cliente: ");
        String direccionCliente = scanner.nextLine();
        System.out.print("Ingrese el teléfono del cliente: ");
        String telefonoCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nombreCliente, direccionCliente, telefonoCliente);

       
        Pedido pedido = new Pedido(cliente, new ArrayList<>(), new ArrayList<>());
        controlPedidos.agregarPedido(pedido);
        System.out.println("Pedido creado con éxito.");
    }

    private void listarPedidos() {
        System.out.println(controlPedidos);
    }

    private void actualizarEstadoPedido() {
        System.out.print("Ingrese el número del pedido a actualizar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();  

        if (indice >= 0 && indice < controlPedidos.getPedido().size()) {
            Producto pedido = controlPedidos.getPedido().get(indice);
            System.out.print("Ingrese el nuevo estado del pedido: ");
            String nuevoEstado = scanner.nextLine();
            controlPedidos.actualizarPedido(pedido, nuevoEstado);
            System.out.println("Estado del pedido actualizado con éxito.");
        } else {
            System.out.println("Pedido no encontrado.");
        }
    }
}
