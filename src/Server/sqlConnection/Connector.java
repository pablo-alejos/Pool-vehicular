package Server.sqlConnection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
//import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author pablo.alejos
 */
public class Connector {

    private static Connection conn;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/poolvehicular";

    public Connector() {
        conn = null;
    }

    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            conn = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            if (conn != null) {
                System.out.println("Conexion establecida.");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        return conn;
    }

    public void disconnect() {
        try {
            conn.close();
            System.out.println("Conexion terminada.");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex+"\n Error al desconectar, no se puedo conectar con la base de datos.");
            JOptionPane.showMessageDialog(null,"No se pudo conectar con la base de datos","Error al desconectar",JOptionPane.ERROR_MESSAGE);
        }        
    }
}
