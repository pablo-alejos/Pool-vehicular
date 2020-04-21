package entity;

import java.io.Serializable;

/**
 *
 * @author pablo.alejos
 */
public class CondicionesVehiculo implements Serializable {
    private boolean carroceria;
    private boolean copasRines;
    private boolean tapiceria;
    private boolean vidrios;
    private boolean espejos;
    private boolean refaccion;
    private boolean gatoCruzeta;
    private boolean luces;
    private boolean radio;
    private boolean tablero;
    private boolean aireAC;
    private int kilometraje;
    
    public CondicionesVehiculo(boolean tf,int km){
        this.carroceria=tf;
        this.copasRines=tf;
        this.tapiceria=tf;
        this.vidrios=tf;
        this.espejos=tf;
        this.refaccion=tf;
        this.gatoCruzeta=tf;
        this.luces=tf;
        this.radio=tf;
        this.tablero=tf;
        this.aireAC=tf;
        this.kilometraje=km;
    }

    /**
     * @return the carroceria
     */
    public boolean isCarroceria() {
        return carroceria;
    }

    /**
     * @param carroceria the carroceria to set
     */
    public void setCarroceria(boolean carroceria) {
        this.carroceria = carroceria;
    }

    /**
     * @return the copasRines
     */
    public boolean isCopasRines() {
        return copasRines;
    }

    /**
     * @param copasRines the copasRines to set
     */
    public void setCopasRines(boolean copasRines) {
        this.copasRines = copasRines;
    }

    /**
     * @return the tapiceria
     */
    public boolean isTapiceria() {
        return tapiceria;
    }

    /**
     * @param tapiceria the tapiceria to set
     */
    public void setTapiceria(boolean tapiceria) {
        this.tapiceria = tapiceria;
    }

    /**
     * @return the vidrios
     */
    public boolean isVidrios() {
        return vidrios;
    }

    /**
     * @param vidrios the vidrios to set
     */
    public void setVidrios(boolean vidrios) {
        this.vidrios = vidrios;
    }

    /**
     * @return the espejos
     */
    public boolean isEspejos() {
        return espejos;
    }

    /**
     * @param espejos the espejos to set
     */
    public void setEspejos(boolean espejos) {
        this.espejos = espejos;
    }

    /**
     * @return the refaccion
     */
    public boolean isRefaccion() {
        return refaccion;
    }

    /**
     * @param refaccion the refaccion to set
     */
    public void setRefaccion(boolean refaccion) {
        this.refaccion = refaccion;
    }

    /**
     * @return the gatoCruzeta
     */
    public boolean isGatoCruzeta() {
        return gatoCruzeta;
    }

    /**
     * @param gatoCruzeta the gatoCruzeta to set
     */
    public void setGatoCruzeta(boolean gatoCruzeta) {
        this.gatoCruzeta = gatoCruzeta;
    }

    /**
     * @return the luces
     */
    public boolean isLuces() {
        return luces;
    }

    /**
     * @param luces the luces to set
     */
    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    /**
     * @return the radio
     */
    public boolean isRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    /**
     * @return the tablero
     */
    public boolean isTablero() {
        return tablero;
    }

    /**
     * @param tablero the tablero to set
     */
    public void setTablero(boolean tablero) {
        this.tablero = tablero;
    }

    /**
     * @return the aireAC
     */
    public boolean isAireAC() {
        return aireAC;
    }

    /**
     * @param aireAC the aireAC to set
     */
    public void setAireAC(boolean aireAC) {
        this.aireAC = aireAC;
    }

    /**
     * @return the kilometraje
     */
    public int getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
}
