package com.abarrotes.objetosNegocio;

import java.time.LocalDate;

public class MovimientoGranel extends Movimiento {
    private ProductoGranel productoGranel;

    public MovimientoGranel() {
        super();
        this.productoGranel = null;
    }

    public MovimientoGranel(String clave, LocalDate fecha, boolean procesado, ProductoGranel productoGranel) {
        super(clave, fecha, procesado);
        setProductoGranel(productoGranel);
    }

    public MovimientoGranel(String clave, ProductoGranel productoGranel) {
        super(clave);
        setProductoGranel(productoGranel);
    }

    public ProductoGranel getProductoGranel() {
        return productoGranel;
    }

    public void setProductoGranel(ProductoGranel productoGranel) {
        if (productoGranel == null) {
            throw new IllegalArgumentException("El producto a granel asociado al movimiento no puede ser nulo.");
        }
        this.productoGranel = productoGranel;
    }

    @Override
    public String toString() {
        return super.toString() + "," + productoGranel.toString();
    }
}
