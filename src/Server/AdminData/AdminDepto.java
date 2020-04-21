package Server.AdminData;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import com.mysql.jdbc.Connection;
import Server.sqlConnection.Connector;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entity.Departamento;

/**
 *
 * @author pablo.alejos
 */
public class AdminDepto {

    private PreparedStatement prepareStatement;
    private ResultSet resultSet;
    private ResultSetMetaData resultSetMetaData;
    private List<Departamento> resultSetDptos;
    private final Connector CONN;
    private final Connection REG;
    private final String SQLINSERT = "INSERT INTO departamento (nombreDepartamento, nombreJefeDepartamento,"
            + "gasolinaPresupuestada, diaActualizar, gasolinaRestante) VALUES (?,?,?,?,?)";

    public AdminDepto() {
        CONN = new Connector();
        REG = CONN.getConnection();
    }

    public void insert(Object d) {
        Departamento departamento = (Departamento) d;
        try {
            this.prepareStatement = CONN.getConnection().prepareStatement(SQLINSERT);
            prepareStatement.setString(1, departamento.getNombreDepartamento());
            prepareStatement.setString(2, departamento.getNombreJefeDepartamento());
            prepareStatement.setInt(3, departamento.getGasolinaPresupuestada());
            prepareStatement.setInt(4, departamento.getDiaActualizarPresupuesto());
            prepareStatement.setInt(5, departamento.getGasolinaRestante());
            prepareStatement.execute();
            System.out.println("Query ejecutado. Guardado.");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al insertar registro de departamento.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar registrar un departamento\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateEnd();
    }

    public void descontarGasolina(int gasto, String nombreD) {
        try {
            this.prepareStatement = REG.prepareStatement("UPDATE departamento SET gasolinaRestante = "
                    + "gasolinaRestante-" + gasto + " WHERE NombreDepartamento='" + nombreD + "' AND gasolinaRestante>=0+"+gasto);
            prepareStatement.execute();
            System.out.println("Query ejecutado. Actualizado.");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al actualizar datos de departamento.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar actualizar la gasolina de un departamento\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateEnd();
    }
 
    public void select() {
        try {
            this.prepareStatement = REG.prepareStatement("SELECT * FROM departamento");
            this.resultSet = prepareStatement.executeQuery();
            this.resultSetMetaData = resultSet.getMetaData();
            this.resultSetDptos = toArrayList();
            System.out.println("Query ejecutado. Consultado.");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al seleccionar todo de departamento.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar consultar departamentos\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        if(isUpdateDay()){
            System.out.println("Gasolina actualizada");
        }
        updateEnd();
    }

    private ArrayList<Departamento> toArrayList() {
        ArrayList<Departamento> listBuffer = new ArrayList();
        try {
            while (resultSet.next()) {
                listBuffer.add(new Departamento(resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5)
                ));
            }
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al generar tabla modelo de departamentos.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar consultar departamentos\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return listBuffer;
    }

    public DefaultComboBoxModel generateComboBoxModel() {
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        try {
            this.prepareStatement = REG.prepareStatement("SELECT nombreDepartamento FROM departamento");
            this.resultSet = prepareStatement.executeQuery();
            System.out.println("Query ejecutado. Consultado.");
            while (resultSet.next()) {
                comboModel.addElement(resultSet.getString(1));
            }
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al generar modelo comboBox departamentos.");
        }
        updateEnd();
        return comboModel;
    }

    public DefaultTableModel generateTableModel() {
        DefaultTableModel tableModel = new DefaultTableModel();
        try {
            int columCount = resultSetMetaData.getColumnCount();
            tableModel.addColumn("Departamento");
            tableModel.addColumn("Jefe");
            tableModel.addColumn("Gasolina presupuestada");
            tableModel.addColumn("Actualizar presupuesto");
            tableModel.addColumn("Gasolina restante");
            for (Departamento dpt : resultSetDptos) {
                List<String> rows = new ArrayList();
                for (int i = 0; i < columCount; i++) {
                    rows.add(dpt.getNombreDepartamento());
                    rows.add(dpt.getNombreJefeDepartamento());
                    rows.add(Integer.toString(dpt.getGasolinaPresupuestada()));
                    rows.add(Integer.toString(dpt.getDiaActualizarPresupuesto()));
                    rows.add(Integer.toString(dpt.getGasolinaRestante()));
                }
                tableModel.insertRow(tableModel.getRowCount(), rows.toArray());
            }
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al generar tabla modelo de departamentos.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al generar la tabla de departamentos\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return tableModel;
    }

    void updateEnd() {
        this.CONN.disconnect();
    }

    private boolean isUpdateDay() {
        
        return false;
    }
}
