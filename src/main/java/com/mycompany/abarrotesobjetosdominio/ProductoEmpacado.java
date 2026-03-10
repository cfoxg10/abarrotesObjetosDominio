package com.mycompany.abarrotesobjetosdominio;


/**
 *
 * @author Laboratorios
 */
public class ProductoEmpacado extends Producto{
    private int cantidad;
    
    public ProductoEmpacado(){
        
    }
    
    public ProductoEmpacado(Producto producto,int cantidad){
        super(producto.clave,producto.nombre,producto.tipo,producto.unidad);
        this.cantidad=cantidad;
    }
    
    public ProductoEmpacado(Producto producto){
        super(producto);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return super.toString() + "," + cantidad;
    }
    
    
}
