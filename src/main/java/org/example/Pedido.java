package org.example;


public class Pedido {
    String cliente;
    String[] productos;

    public Pedido(String cliente, String[] productos) {
        this.cliente = cliente;
        this.productos = productos;
    }
}
