package com.mycompany.abarrotesobjetosdominio;
public class ProductoGranel extends Producto {

    private double cantidad;

    // constructor por defecto
    public ProductoGranel() {
        super();
        cantidad = 0.0;
    }

    // constructor con producto y cantidad
    public ProductoGranel(Producto producto, double cantidad) {
        super(producto);

        if (!producto.getClave().startsWith("GR")) {
            System.out.println("Error: la clave del producto a granel debe iniciar con GR");
        }

        if (cantidad < 0.01) {
            System.out.println("Error: la cantidad minima es 0.01");
        } else {
            this.cantidad = cantidad;
        }
    }

    // constructor solo con producto
    public ProductoGranel(Producto producto) {
        super(producto);

        if (!producto.getClave().startsWith("GR")) {
            System.out.println("Error: la clave del producto a granel debe iniciar con GR");
        }

        this.cantidad = 0.0;
    }

    // getter
    public double getCantidad() {
        return cantidad;
    }

    // setter
    public void setCantidad(double cantidad) {
        if (cantidad < 0.01) {
            System.out.println("Error: la cantidad minima es 0.01");
        } else {
            this.cantidad = cantidad;
        }
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "," + cantidad;
    }
}