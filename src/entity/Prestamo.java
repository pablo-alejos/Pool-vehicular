package entity;

import java.io.Serializable;

/**
 *
 * @author pablo.alejos
 */
public class Prestamo implements Serializable{

    private Integer nump;
    private Integer vehiculo;
    private String tipo;
    private String departamento;
    private String nombreResguardante;
    private String destinoMotivo;
    private Integer aproximadoTanqueGasolina;
    private String fechaSalida;
    private String horaSalida;
    private String fechaEntrada;
    private String horaEntrada;
    private Integer valesGasolina;
    private String usuario;
    private String estado;

    /*Para insertar en BD*/
    public Prestamo(int v, String t, String d, String nr, String dm, int ag, String fs, String hs, int vg, String u, String e) {
        this.vehiculo = v;
        this.tipo = t;
        this.departamento = d;
        this.nombreResguardante = nr;
        this.destinoMotivo = dm;
        this.aproximadoTanqueGasolina = ag;
        this.fechaSalida = fs;
        this.horaSalida = hs;
//        this.fechaEntrada = null;
//        this.horaEntrada = null;
        this.valesGasolina = vg;
        this.usuario = u;
        this.estado = e;
    }

    /*para leer*/
    public Prestamo(int nump, int v, String t, String d, String nr, String dm, int ag, String fs, String hs, String fe, String he, int vg, String u, String e) {
        this.nump=nump;
        this.vehiculo = v;
        this.tipo = t;
        this.departamento = d;
        this.nombreResguardante = nr;
        this.destinoMotivo = dm;
        this.aproximadoTanqueGasolina = ag;
        this.fechaSalida = fs;
        this.horaSalida = hs;
        this.fechaEntrada = fe;
        this.horaEntrada = he;
        this.valesGasolina = vg;
        this.usuario = u;
        this.estado = e;
    }

    public Prestamo() {

    }

    public Integer getNump() {
        return nump;
    }

    public void setNump(Integer nump) {
        this.nump = nump;
    }

    public Integer getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Integer vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombreResguardante() {
        return nombreResguardante;
    }

    public void setNombreResguardante(String nombreResguardante) {
        this.nombreResguardante = nombreResguardante;
    }

    public String getDestinoMotivo() {
        return destinoMotivo;
    }

    public void setDestinoMotivo(String destinoMotivo) {
        this.destinoMotivo = destinoMotivo;
    }

    public Integer getAproximadoTanqueGasolina() {
        return aproximadoTanqueGasolina;
    }

    public void setAproximadoTanqueGasolina(Integer aproximadoTanqueGasolina) {
        this.aproximadoTanqueGasolina = aproximadoTanqueGasolina;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Integer getValesGasolina() {
        return valesGasolina;
    }

    public void setValesGasolina(Integer valesGasolina) {
        this.valesGasolina = valesGasolina;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
