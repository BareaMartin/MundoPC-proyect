package com.mundopc;

import java.util.Arrays;

public class Orden {

    private final int idOrden;
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    private Computadora computadoras[];

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (Orden.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[Orden.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Limite excedido." + Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden() {
        System.out.println("ID ORDEN: " + this.idOrden);
        System.out.println("Productos en la orden: " + this.idOrden);
        for (int i = 0; i < Orden.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }

}
