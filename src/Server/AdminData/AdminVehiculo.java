package Server.AdminData;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import com.mysql.jdbc.Connection;
import Server.sqlConnection.Connector;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entity.Vehiculo;

/**
 *
 * @author pablo.alejos
 */
public class AdminVehiculo {

    private PreparedStatement prepareStatement;
    private ResultSet resultSet;
    private ResultSetMetaData resultSetMetaData;
    private ArrayList<Vehiculo> resultSetVehiculos;
    private final Connector CONN;
    private final Connection REG;
    private final String SQLINSERT = "INSERT INTO vehiculo (cdv, placas, tipo, marca, modelo) VALUES (?,?,?,?,?)";

    public AdminVehiculo() {
        CONN = new Connector();
        REG = CONN.getConnection();

    }

    public void insert(Object w) {
        Vehiculo vehiculo = (Vehiculo) w;
        try {
            this.prepareStatement = CONN.getConnection().prepareStatement(SQLINSERT);
            prepareStatement.setInt(1, vehiculo.getCdv());
            prepareStatement.setString(2, vehiculo.getPlacas());
            prepareStatement.setString(3, vehiculo.getTipo());
            prepareStatement.setString(4, vehiculo.getMarca());
            prepareStatement.setString(5, vehiculo.getModelo());
            prepareStatement.execute();
            System.out.println("Query Ejecutado. Guardado.");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al insertar registro de vehiculo.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar registrar un vehiculo\n"+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateEnd();
    }

    public void prestar(int cdv) {
        try {
            this.prepareStatement = REG.prepareStatement("UPDATE vehiculo SET estado='prestado' WHERE cdv='" + cdv + "' AND estado='disponible'");
            prepareStatement.execute();
            System.out.println("Query ejecutado. Actualizado");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al actualizar datos de vehiculo.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar prestar un vehiculo\n"+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateEnd();
    }

    public void liberar(int cdv) {
        try {
            this.prepareStatement = REG.prepareStatement("UPDATE vehiculo SET estado='disponible' WHERE (cdv='" + cdv + "') AND estado='prestado'");
            prepareStatement.execute();
            System.out.println("Query ejecutado. Actualizado");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al actualizar datos de vehiculo.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar liberar un vehiculo\n"+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateEnd();
    }

    public void select() {
        try {
            this.prepareStatement = REG.prepareStatement("SELECT * FROM vehiculo");
            this.resultSet = prepareStatement.executeQuery();
            this.resultSetMetaData = resultSet.getMetaData();
            this.resultSetVehiculos = toArrayList();
            System.out.println("Query ejecutado. Consultado.");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al seleccionar todo de vehiculo.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar consultar vehiculos\n"+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateEnd();
    }

    /*  private void select(String column, String cdv) {
        try {
            this.prepareStatement = REG.prepareStatement("SELECT " + column + " FROM vehiculo WHERE vehiculo='" + cdv + "'");
            this.resultSet = prepareStatement.executeQuery();
            this.resultSetMetaData = resultSet.getMetaData();
            System.out.println("Query ejecutado. Consultado.");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al seleccionar columna de Vehiculos.");
        }
    }*/
    private ArrayList<Vehiculo> toArrayList() {
        ArrayList<Vehiculo> listBuffer = new ArrayList();
        try {
            while (resultSet.next()) {
                listBuffer.add(new Vehiculo(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6)
                ));
            }
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al generar tabla modelo de vehiculos.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar consultar prestamos\n"+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return listBuffer;
    }

    public DefaultComboBoxModel generateComboBoxModel() {
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        try {
            this.prepareStatement = REG.prepareStatement("SELECT cdv FROM vehiculo WHERE cdv NOT IN(SELECT cdv FROM vehiculo WHERE estado='prestado')");
            this.resultSet = prepareStatement.executeQuery();
            System.out.println("Query ejecutado. Consultado.");
            while (resultSet.next()) {
                comboModel.addElement(resultSet.getInt(1));
            }
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al generar modelo comboBox de vehiculos.");
        }
        updateEnd();
        return comboModel;
    }

    public DefaultTableModel generateTableModel() {
      
        DefaultTableModel tableModel = new DefaultTableModel();
        try {
            int columCount = resultSetMetaData.getColumnCount();
            tableModel.addColumn("Cdv");
            tableModel.addColumn("Placas");
            tableModel.addColumn("Tipo");
            tableModel.addColumn("Marca");
            tableModel.addColumn("Modelo");
            tableModel.addColumn("Estado");
                Collections.sort(resultSetVehiculos, (Vehiculo t, Vehiculo t1) -> t.getCdv().compareTo(t1.getCdv()));
            for (Vehiculo vh : resultSetVehiculos) {
                List<String> rows = new ArrayList();
                for (int i = 0; i < columCount; i++) {
                    rows.add(Integer.toString(vh.getCdv()));
                    rows.add(vh.getPlacas());
                    rows.add(vh.getTipo());
                    rows.add(vh.getMarca());
                    rows.add(vh.getModelo());
                    rows.add(vh.getEstado());
                }
                tableModel.insertRow(tableModel.getRowCount(), rows.toArray());
            }
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al generar modelo tabla de vehiculos.");
             JOptionPane.showMessageDialog(null,"Ocurrio un problema al generar la tabla de vehiculos\n"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        return tableModel;
    }

    void updateEnd() {
        this.CONN.disconnect();
    }

    public void delete(int cdv) {
        try {
            this.prepareStatement = REG.prepareStatement("DELETE FROM vehiculo WHERE cdv='" + cdv+"' AND estado='disponible'");
            prepareStatement.execute();
            System.out.println("Query ejecutado. Eliminado");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al eliminar datos de vehiculo.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar eliminar un vehiculo\n"+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateEnd();
    }

}
