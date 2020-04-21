package entity;

import java.io.Serializable;

/**
 *
 * @author pablo.alejos
 */
public class Vehiculo implements Serializable{

    private Integer cdv; //PK
    private String placas;
    private String tipo;
    private String marca;
    private String modelo;
    private String estado;
    private CondicionesVehiculo condicionesVehiculo;

    /*Para insertar*/
    public Vehiculo(int c, String p, String t, String m, String md) {
        this.cdv = c;
        this.placas = p;
        this.tipo = t;
        this.marca = m;
        this.modelo = md;
        this.estado = "Disponible";
//        this.condicionesVehiculo = new CondicionesVehiculo(true, 0);
    }

    /*Para leer*/
    public Vehiculo(int c, String p, String t, String m, String md, String e) {
        this.cdv = c;
        this.placas = p;
        this.tipo = t;
        this.marca = m;
        this.modelo = md;
        this.estado = e;
    }

    public Integer getCdv() {
        return cdv;
    }

    public void setCdv(Integer cdv) {
        this.cdv = cdv;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public CondicionesVehiculo getCondicionesVehiculo() {
        return condicionesVehiculo;
    }

    public void setCondicionesVehiculo(CondicionesVehiculo condicionesVehiculo) {
        this.condicionesVehiculo = condicionesVehiculo;
    }

}
