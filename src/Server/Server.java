package server;

import Server.user.User;
import java.net.*;
import java.io.*;

/**
 *
 * @author pablo.alejos
 */
public class Server {

    public Server(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println("aaaaaaa");
        }
    
    }

    public static void main(String[] args) throws IOException {
        new Server();
        User user = new User();

        
        try {
            user.serverSocket = new ServerSocket(5000);
            System.out.println("Servidor iniciado.");
            while (true) {
                new User(user.serverSocket.accept()).start();
                System.out.println("Cliente conectado.");
            }
        } catch (IOException e) {
            System.err.println("Could not listen on port: 5000.");
            System.exit(1);
        }
        user.serverSocket.close();
    }

}
