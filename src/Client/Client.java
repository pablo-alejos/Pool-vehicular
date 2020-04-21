package client;

import java.io.*;
import java.net.*;
import entity.Resquest;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo.alejos
 */
public class Client {

    private final String HOST = "localhost";
    private final int PUERTO = 5000;
    private Socket socketC = null;
    private OutputStream outputStream = null;
    private ObjectOutputStream objectOutputStream = null;
    private InputStream inputStream = null;
    private ObjectInputStream objectInputStream = null;

    public Client() {
        try {
            socketC = new Socket(HOST, PUERTO);
            inputStream = socketC.getInputStream();
            objectInputStream = new ObjectInputStream(inputStream);
            outputStream = socketC.getOutputStream();
            objectOutputStream = new ObjectOutputStream(outputStream);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Problema para conectar cliente\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Object resquest(String resquest) {
        Object buffer;
        try {
            while (socketC.isConnected()) {
                objectOutputStream.writeObject(new Resquest(resquest));
                buffer = objectInputStream.readObject();
                return buffer;
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Client error: " + ex.getMessage());
        }
        return null;
    }

    public Object resquest(String resquest, Object data) throws Exception {
        try {
            while (socketC.isConnected()) {
                objectOutputStream.writeObject(new Resquest(resquest, data));
                Object buffer = objectInputStream.readObject();
                return buffer;
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Client error: " + ex.getMessage());
            throw new Exception(ex);
        }
        return null;
    }

    public void desconectar() throws Exception {
        try {
            socketC.close();
        } catch (IOException ex) {
            System.out.println("Client error: " + ex.getMessage());
            throw new Exception(ex);
        }
    }
}
