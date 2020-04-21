package Server.protocol;

import Server.AdminData.AdminDepto;
import Server.AdminData.AdminPrestamo;
import Server.AdminData.AdminVehiculo;
import entity.Departamento;
import entity.Prestamo;
import entity.Vehiculo;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo.alejos
 */
public class SQLAdmin {

    public SQLAdmin() {

    }

    public SQLAdmin(int j) {

    }

    public void savePrestamo(Prestamo prestamo, Integer cdv, String nombreD, Integer valesG) {
        AdminPrestamo adminPrestamo = new AdminPrestamo();
        if (adminPrestamo.verificarGasolina(nombreD, valesG)) {
            adminPrestamo = new AdminPrestamo();
            adminPrestamo.insert(prestamo);
            AdminVehiculo adminVehiculo = new AdminVehiculo();
            adminVehiculo.prestar(cdv);
            AdminDepto adminDepto = new AdminDepto();
            adminDepto.descontarGasolina(valesG, nombreD);
        } else {
            System.out.println("\n Error al insertar registro de prestamo gasolina incorrecta.");
            adminPrestamo.updateEnd();
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al intentar registrar un prestamo\n" + "Gasolina del departamento " + nombreD + " insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void savePrestamoTerminado(Integer cdv, String date, String time) {
        AdminPrestamo adminPrestamo = new AdminPrestamo();
        adminPrestamo.terminarPrestamo(cdv, date, time);
        AdminVehiculo adminVehiculo = new AdminVehiculo();
        adminVehiculo.liberar(cdv);
    }

    public void saveVehiculo(Vehiculo vehiculo) {
        AdminVehiculo adminVehiculo = new AdminVehiculo();
        adminVehiculo.insert(vehiculo);
    }

    public void saveDepartamento(Departamento departamento) {
        AdminDepto adminDepto = new AdminDepto();
        adminDepto.insert(departamento);
    }

    public DefaultComboBoxModel getCmbModelDptos() {
        AdminDepto adminDeptos = new AdminDepto();
        return adminDeptos.generateComboBoxModel();
    }

    public DefaultComboBoxModel getCmbModelVehiculos() {
        AdminVehiculo adminVehiculo = new AdminVehiculo();
        return adminVehiculo.generateComboBoxModel();
    }

    public DefaultTableModel tablePrestamos() {
        AdminPrestamo adminPrestamo = new AdminPrestamo();
        adminPrestamo.select();
        return adminPrestamo.generateTableModel();
    }

    public DefaultTableModel tableDepartamentos() {
        AdminDepto adminDepto = new AdminDepto();
        adminDepto.select();
        return adminDepto.generateTableModel();
    }

    public DefaultTableModel tableVehiculos() {
        AdminVehiculo adminVehiculo = new AdminVehiculo();
        adminVehiculo.select();
        return adminVehiculo.generateTableModel();
    }

    public Object elmVehiculo(int cdv) {
        AdminVehiculo v = new AdminVehiculo();
        v.delete(cdv);
        return "";
    }

}
