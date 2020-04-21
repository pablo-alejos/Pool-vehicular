package Server.AdminData;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import com.mysql.jdbc.Connection;
import Server.sqlConnection.Connector;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entity.Prestamo;

/**
 *
 * @author pablo.alejos
 */
public class AdminPrestamo {

    private PreparedStatement prepareStatement;
    private ResultSet resultSet;
    private ResultSetMetaData resultSetMetaData;
    private List<Prestamo> resultSetPrestamos;
    private final Connector CONN;
    private final Connection REG;
    private final String SQLINSERT = "INSERT INTO prestamo (cdv, tipo, departamento, "
            + "nombreResguardante, destinoMotivo, aproxGasolina, "
            + "fechaSalida, horaSalida, usuario, valesGasolina, estado) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

    public AdminPrestamo() {
        CONN = new Connector();
        REG = CONN.getConnection();
    }

    public void insert(Object p) {
        Prestamo prestamo = (Prestamo) p;
        try {
            this.prepareStatement = REG.prepareStatement(SQLINSERT);
            prepareStatement.setInt(1, prestamo.getVehiculo());
            prepareStatement.setString(2, prestamo.getTipo());
            prepareStatement.setString(3, prestamo.getDepartamento());
            prepareStatement.setString(4, prestamo.getNombreResguardante());
            prepareStatement.setString(5, prestamo.getDestinoMotivo());
            prepareStatement.setInt(6, prestamo.getAproximadoTanqueGasolina());
            prepareStatement.setString(7, prestamo.getFechaSalida());
            prepareStatement.setString(8, prestamo.getHoraSalida());
            prepareStatement.setString(9, prestamo.getUsuario());
            prepareStatement.setInt(10, prestamo.getValesGasolina());
            prepareStatement.setString(11, prestamo.getEstado());
            prepareStatement.execute();
            System.out.println("Query Ejecutado. Guardado.");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al insertar registro de prestamo.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar registrar un prestamo\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void terminarPrestamo(int cdv, String date, String time) {
        try {
            this.prepareStatement = REG.prepareStatement("UPDATE prestamo SET "
                    + "fechaEntrada='" + date + "', "
                    + "horaEntrada='" + time + "', "
                    + "estado='" + "terminado" + "' "
                    + "WHERE cdv='" + cdv + "' AND estado='En curso'");
            prepareStatement.execute();
            System.out.println("Query ejecutado. Actualizado.");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al actualizar datos de prestamo.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar terminar un prestamo\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateEnd();
    }

    public void select() {
        try {
            this.prepareStatement = REG.prepareStatement("SELECT * FROM prestamo");
            this.resultSet = prepareStatement.executeQuery();
            this.resultSetMetaData = resultSet.getMetaData();
            this.resultSetPrestamos = toArrayList();
            System.out.println("Query ejecutado. Consultado.");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al seleccionar todo de prestamo.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar consultar prestamos\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateEnd();
    }

    /*edit*/
////    public void select(String column, String where) {
//        try {
//            this.prepareStatement = REG.prepareStatement("SELECT" + column + " FROM prestamo" + where);
//            this.resultSet = prepareStatement.executeQuery();
//            this.resultSetMetaData = resultSet.getMetaData();
//            System.out.println("Query ejecutado. Consultado.");
//        } catch (SQLException | NullPointerException ex) {
//            System.out.println(ex+"\n Error al seleccionar columna de departamento.");
//        }
//    }
    private ArrayList<Prestamo> toArrayList() {
        ArrayList<Prestamo> listBuffer = new ArrayList();
        try {
            while (resultSet.next()) {
                listBuffer.add(new Prestamo(resultSet.getInt(1),
                        resultSet.getInt(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getInt(7),
                        resultSet.getString(8),
                        resultSet.getString(9),
                        resultSet.getString(10),
                        resultSet.getString(11),
                        resultSet.getInt(12),
                        resultSet.getString(13),
                        resultSet.getString(14)
                ));
            }
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al leer tabla prestamos de la BD.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar consultar prestamos\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return listBuffer;
    }

    public DefaultTableModel generateTableModel() {
        DefaultTableModel tableModel = new DefaultTableModel();
        try {
            int columCount = resultSetMetaData.getColumnCount();
            tableModel.addColumn("Prestamo");
            tableModel.addColumn("Vehiculo");
            tableModel.addColumn("Tipo");
            tableModel.addColumn("Departamento");
            tableModel.addColumn("Resguardante");
            tableModel.addColumn("Motivo");
            tableModel.addColumn("Tanque");
            tableModel.addColumn("Salida");
            tableModel.addColumn("Salida");
            tableModel.addColumn("Entrada");
            tableModel.addColumn("Entrada");
            tableModel.addColumn("Vales");
            tableModel.addColumn("Usuario");
            tableModel.addColumn("Estado");

            for (Prestamo pt : resultSetPrestamos) {
                List<String> rows = new ArrayList();
                for (int i = 0; i < columCount; i++) {
                    rows.add(Integer.toString(pt.getNump()));
                    rows.add(Integer.toString(pt.getVehiculo()));
                    rows.add(pt.getTipo());
                    rows.add(pt.getDepartamento());
                    rows.add(pt.getNombreResguardante());
                    rows.add(pt.getDestinoMotivo());
                    rows.add(Integer.toString(pt.getAproximadoTanqueGasolina()));
                    rows.add(pt.getFechaSalida());
                    rows.add(pt.getHoraSalida());
                    rows.add(pt.getFechaEntrada());
                    rows.add(pt.getHoraEntrada());
                    rows.add(Integer.toString(pt.getValesGasolina()));
                    rows.add(pt.getUsuario());
                    rows.add(pt.getEstado());
                }
                tableModel.insertRow(tableModel.getRowCount(), rows.toArray());
            }
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al generar tabla modelo prestamos.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al generar la tabla de prestamos\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return tableModel;
    }

    public boolean verificarGasolina(String depto, int vales) {
        try {
            this.prepareStatement = REG.prepareStatement("SELECT nombreDepartamento FROM departamento where gasolinaRestante>=0+" + vales);
            this.resultSet = prepareStatement.executeQuery();
            System.out.println("Query ejecutado. Consultado.");
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al verificar gasolina de prestamo.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar verificar gasolina de prestamo\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        ArrayList<String> listBuffer = new ArrayList();
        try {
            while (resultSet.next()) {
                listBuffer.add(resultSet.getString(1));
            }
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex + "\n Error al verificar gasolina de prestamo.");
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar verificar gasolina de prestamo\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        updateEnd();
        for (String buffer : listBuffer) {
            if (depto.equals(buffer)) {
                return true;
            }
        }
        return false;

    }

    public void updateEnd() {
        this.CONN.disconnect();
    }
}
