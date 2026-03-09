/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abarrotesobjetodominio;

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
        return "ProductoEmpacado{" + "cantidad=" + cantidad + '}';
    }
    
    
}
