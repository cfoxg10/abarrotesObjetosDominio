package com.mycompany.abarrotesobjetosdominio;
import java.util.Objects;

/**
 *
 * @author Laboratorios
 */
public class Producto {
    protected String clave;
    protected String nombre;
    protected char tipo;
    protected String unidad;
    
    public Producto(){
        
    }
    
    public Producto(String clave,String nombre,char tipo,String unidad){
        this.clave=clave;
        this.nombre=nombre;
        this.tipo=tipo;
        this.unidad=unidad;
    }
    
    public Producto(String clave){
        this.clave=clave;
        this.nombre=null;
        this.tipo=' ';
        this.unidad=null;
    }
    
    public Producto(Producto otro){
        this.clave=otro.clave;
        this.nombre=otro.nombre;
        this.tipo=otro.tipo;
        this.unidad=otro.unidad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        if (clave != null && clave.matches("[A-Z]{2}\\d{3}")) {
            this.clave = clave;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null ){
            this.nombre = nombre;
        }
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        if(tipo!=' '){
            this.tipo = tipo;
        }
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        if (unidad != null &&(unidad.equals("KG") || unidad.equals("g") ||unidad.equals("L") || unidad.equals("PZ"))){
            this.unidad = unidad;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.clave);
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + this.tipo;
        hash = 53 * hash + Objects.hashCode(this.unidad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(this.clave, other.clave);
    }

    @Override
    public String toString() {
        return "Producto{" + "clave=" + clave + ", nombre=" + nombre + ", tipo=" + tipo + ", unidad=" + unidad + '}';
    }
    
    
}
