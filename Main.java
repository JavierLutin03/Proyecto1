package main;

import java.util.ArrayList;
import control.ControlPedidos;
import interfaz.InterfazUsuario;



public class Main {
    public static void main(String[] args) {
        ControlPedidos controlPedidos = new ControlPedidos();
        InterfazUsuario interfazUsuario = new InterfazUsuario(controlPedidos);
        interfazUsuario.iniciar();
    }
}
