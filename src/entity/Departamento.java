package entity;

import java.io.Serializable;

/**
 *
 * @author pablo.alejos
 */
public class Departamento implements Serializable{

    private String nombreDepartamento;
    private String nombreJefeDepartamento;
    private Integer gasolinaPresupuestada;
    private Integer diaActualizarPresupuesto;
    private Integer gasolinaRestante;
    /*para leer*/
    public Departamento(String n, String nj, int gp, int dap, int gr) {
        this.nombreDepartamento = n;
        this.nombreJefeDepartamento = nj;
        this.gasolinaPresupuestada = gp;
        this.diaActualizarPresupuesto = dap;
        this.gasolinaRestante = gr;
    }
    /*para registrar*/
    public Departamento(String n, String nj, int gp, int dap) {
        this.nombreDepartamento = n;
        this.nombreJefeDepartamento = nj;
        this.gasolinaPresupuestada = gp;
        this.diaActualizarPresupuesto = dap;
        this.gasolinaRestante=gasolinaPresupuestada;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getNombreJefeDepartamento() {
        return nombreJefeDepartamento;
    }

    public void setNombreJefeDepartamento(String nombreJefeDepartamento) {
        this.nombreJefeDepartamento = nombreJefeDepartamento;
    }

    public Integer getGasolinaPresupuestada() {
        return gasolinaPresupuestada;
    }

    public void setGasolinaPresupuestada(Integer gasolinaPresupuestada) {
        this.gasolinaPresupuestada = gasolinaPresupuestada;
    }

    public Integer getDiaActualizarPresupuesto() {
        return diaActualizarPresupuesto;
    }

    public void setDiaActualizarPresupuesto(Integer diaActualizarPresupuesto) {
        this.diaActualizarPresupuesto = diaActualizarPresupuesto;
    }

    public Integer getGasolinaRestante() {
        return gasolinaRestante;
    }

    public void setGasolinaRestante(Integer gasolinaRestante) {
        this.gasolinaRestante = gasolinaRestante;
    }
}
