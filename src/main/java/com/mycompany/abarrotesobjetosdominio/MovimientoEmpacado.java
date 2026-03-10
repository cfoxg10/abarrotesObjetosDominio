package com.mycompany.abarrotesobjetosdominio;
import java.time.LocalDate;

public class MovimientoEmpacado extends Movimiento {
    private ProductoEmpacado productoEmpacado;

    public MovimientoEmpacado() {
        super();
        this.productoEmpacado = null;
    }
    public MovimientoEmpacado(String clave, LocalDate fecha, boolean procesado, ProductoEmpacado productoEmpacado) {
        super(fecha, procesado);
        this.cveMovimiento = clave;
        setProductoEmpacado(productoEmpacado);
    }

    public MovimientoEmpacado(String clave, ProductoEmpacado productoEmpacado) {
        super(clave);
        setProductoEmpacado(productoEmpacado);
    }

    public ProductoEmpacado getProductoEmpacado() {
        return productoEmpacado;
    }

    public void setProductoEmpacado(ProductoEmpacado productoEmpacado) {
        if (productoEmpacado == null) {
            throw new IllegalArgumentException("El producto empacado asociado al movimiento no puede ser nulo.");
        }
        this.productoEmpacado = productoEmpacado;
    }

    @Override
    public String toString() {
        return super.toString() + "," + productoEmpacado.toString();
    }
}
