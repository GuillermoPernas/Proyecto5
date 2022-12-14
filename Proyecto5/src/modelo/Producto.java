package modelo;

import java.util.GregorianCalendar;

public class Producto {
    private int codProd;
    private String nombre;
    private float precio;
    private GregorianCalendar fecha;
    private int codProv;

    public Producto(int codProd, String nombre, float precio, GregorianCalendar fecha, int codProv) {
        this.codProd = codProd;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
        this.codProv = codProv;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public int getCodProv() {
        return codProv;
    }

    public void setCodProv(int codProv) {
        this.codProv = codProv;
    }

    @Override
    public String toString() {
        return "Producto{" 
                + "codProd=" + codProd
                + ", nombre=" + nombre 
                + ", precio=" + precio 
                + ", fecha=" + fecha 
                + ", codProv=" + codProv + '}';
    }
    
    public String listToString() {
        return codProd + "---"+ nombre + "---" + precio ;
    }
}
