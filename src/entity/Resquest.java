package entity;

import java.io.Serializable;

/**
 *
 * @author pablo.alejos
 */
public class Resquest implements Serializable{

    private final String resquest;
    private final Object data;

    /*consulta*/
    public Resquest(String resquest) {
        this.resquest = resquest;
        this.data = null;
    }

    /*registro*/
    public Resquest(String resquest, Object data) {
        this.resquest = resquest;
        this.data = data;
    }

    public String getResquest() {
        return resquest;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return this.resquest;
    }
}
