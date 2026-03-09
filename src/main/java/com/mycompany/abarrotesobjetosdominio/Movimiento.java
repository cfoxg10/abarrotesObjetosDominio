import java.time.LocalDate;
public class Movimiento {
    private static int contador = 1;
    String cveMovimiento;
    LocalDate fecha = LocalDate.now();
    boolean procesado;
    // Constructor
    public Movimiento(LocalDate fecha, boolean procesado) {
        this.cveMovimiento = String.format("MV%03d", contador);
        contador++;
        this.fecha = fecha;
        this.procesado = procesado;
    }
    // Constructor que recibe solo la clave
    public Movimiento(String cveMovimiento) {
        this.cveMovimiento = cveMovimiento;
        this.fecha = null;
        this.procesado = false;
    }    
    public String getCveMovimiento() {
        return cveMovimiento;
    }
    public void setCveMovimiento(String cveMovimiento) {
        this.cveMovimiento = cveMovimiento;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public boolean isProcesado() {
        return procesado;
    }
    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }
    @Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Movimiento otro = (Movimiento) obj;
    return cveMovimiento != null && cveMovimiento.equals(otro.cveMovimiento);
}
}
