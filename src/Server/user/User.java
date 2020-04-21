package Server.user;

import Server.protocol.Protocol;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author pablo.alejos
 */
public class User extends Thread {

    public ServerSocket serverSocket;
    private Socket socket = null;
    private OutputStream outputStream;
    private ObjectOutputStream objectOutputStream;
    private InputStream inputStream;
    private ObjectInputStream objectInputStream;
    private Protocol adminDB;

    public User(Socket socket) {
        this.serverSocket = null;
        this.socket = socket;
        adminDB = new Protocol();
    }

    public User() {
        this.serverSocket = null;
    }

    @Override
    public void run() {
        try {
            outputStream = socket.getOutputStream();
            objectOutputStream = new ObjectOutputStream(outputStream);
            inputStream = socket.getInputStream();
            objectInputStream = new ObjectInputStream(inputStream);
            while (socket.isConnected()) {
                Object datos = objectInputStream.readObject();
                Object salida = adminDB.adminSQL(datos);
                objectOutputStream.writeObject(salida);
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex);
        } finally {
            try {
                serverSocket.close();
                socket.close();
            } catch (IOException ex) {
                System.out.println("Error: " + ex);
            } catch (NullPointerException ex) {
                System.out.println("Cliente desconectado.");
            }
        }
    }
}
