package Client.frame;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import entity.Departamento;
import entity.Prestamo;
import entity.Vehiculo;
import client.Client;
import java.io.IOException;
import javax.swing.ComboBoxModel;
import javax.swing.table.TableModel;

/**
 *
 * @author pablo.alejos
 */
public class EventAdmin {

    private final Pool pool;
    private final LinkedList<JPanel> jPanelList;
    private final Client c;

    /**
     *
     * @param pool
     */
    public EventAdmin(Pool pool) {
        this.pool = pool;
        this.jPanelList = new LinkedList();
        c = new Client();
        fillPanelList();
    }

    /**
     *
     * @param evt
     */
    public void manageMouseEvent(MouseEvent evt) {
        if (((Component) evt.getSource()).getName().contains("icnMenu")
                || ((Component) evt.getSource()).getName().contains("bckMenu")) {
            viewInHot(getSubMenuIndex(evt));
        }
        if (((Component) evt.getSource()).getName().contains("frm")) {
            if (((Component) evt.getSource()).getName().equals("frmPrestamo")) {
                try {
                    loadCmbPrestamo();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Problema para cargar codigos y nombres de departamento\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (((Component) evt.getSource()).getName().contains("frmelm")) {
                viewInHot(getEliminacionIndex(evt));
                return;
            }
            viewInHot(getFormIndex(evt));
        }
        if (((Component) evt.getSource()).getName().contains("cns")) {
            try {
                manageConsultEvent(evt);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problema para consultar\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (((Component) evt.getSource()).getName().contains("svc")) {
            try {
                manageSaveEvent(evt);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problema para guardar\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (((Component) evt.getSource()).getName().contains("elm") && !((Component) evt.getSource()).getName().contains("frm")) {
            try {
                manageDeleteEvent(evt);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problema para eliminar\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    /*returns the index of the searched panel*/
    private int getSubMenuIndex(MouseEvent evt) {
        if (((Component) evt.getSource()).getName().contains("MenuPrestamos")) {
            return 0;
        }
        if (((Component) evt.getSource()).getName().contains("MenuVehiculos")) {
            return 1;
        }
        if (((Component) evt.getSource()).getName().contains("MenuDepartamentos")) {
            return 2;
        }
        if (((Component) evt.getSource()).getName().contains("MenuUsuarios")) {
            return 3;
        }
        if (((Component) evt.getSource()).getName().contains("MenuMantenimientos")) {
            return 4;
        }
        return -1;
    }

    /*returns the index of the searched panel*/
    private int getFormIndex(MouseEvent evt) {
        if (((Component) evt.getSource()).getName().substring(0).contains("frmPrestamo")) {
            return 5;
        }
        if (((Component) evt.getSource()).getName().substring(0).contains("frmTerminarPrestamo")) {
            return 6;
        }
        if (((Component) evt.getSource()).getName().substring(0).contains("frmVehiculo")) {
            return 7;
        }
        if (((Component) evt.getSource()).getName().substring(0).contains("frmDepartamento")) {
            return 8;
        }
        if (((Component) evt.getSource()).getName().substring(0).contains("frmUsuario")) {
            return 9;
        }
        if (((Component) evt.getSource()).getName().substring(0).contains("frmMantenimiento")) {
            return 10;
        }
        return -1;
    }
//
//    /*returns the index of the searched panel*/
//    private int getConsIndex(MouseEvent evt) {
//        if (((Component) evt.getSource()).getName().contains("cnsPrestamos")) {
//            return 11;
//        }
//        if (((Component) evt.getSource()).getName().contains("cnsVehiculos")) {
//            return 12;
//        }
//        if (((Component) evt.getSource()).getName().contains("cnsDepartamentos")) {
//            return 13;
//        }
//        if (((Component) evt.getSource()).getName().contains("cnsUsuarios")) {
//            return 14;
//        }
//        if (((Component) evt.getSource()).getName().contains("cnsMantenimientos")) {
//            return 15;
//        }
//        return -1;
//    }

    /*switch the JPanel and title to show on panel named Hot*/
    private void viewInHot(int swtich) {
        switch (swtich) {
            case 0:
                pool.lblSubTitulo.setText("Prestamos");
                visibleInHot(0);
                break;
            case 1:
                pool.lblSubTitulo.setText("Vehiculos");
                visibleInHot(1);
                break;
            case 2:
                pool.lblSubTitulo.setText("Departamentos");
                visibleInHot(2);
                break;
            case 3:
                pool.lblSubTitulo.setText("Usuarios");
                visibleInHot(3);
                break;
            case 4:
                pool.lblSubTitulo.setText("Mantenimientos");
                visibleInHot(4);
                break;
            case 5:
                pool.lblSubTitulo.setText("Prestamo");
                visibleInHot(5);
                break;
            case 6:
                pool.lblSubTitulo.setText("Terminar Prestamo");
                visibleInHot(6);
                break;
            case 7:
                pool.lblSubTitulo.setText("Vehiculo");
                visibleInHot(7);
                break;
            case 8:
                pool.lblSubTitulo.setText("Departamento");
                visibleInHot(8);
                break;
            case 9:
                pool.lblSubTitulo.setText("Usuario");
                visibleInHot(9);
                break;
            case 10:
                pool.lblSubTitulo.setText("Mantenimiento");
                visibleInHot(10);
                break;
            case 11:
                pool.lblSubTitulo.setText("Prestamo Seleccionado");
                visibleInHot(11);
                break;
            case 12:
                pool.lblSubTitulo.setText("Vehiculo Seleccionado");
                visibleInHot(12);
                break;
            case 13:
                pool.lblSubTitulo.setText("Departamento Seleccionado");
                visibleInHot(13);
                break;
            case 14:
                pool.lblSubTitulo.setText("Usuario seleccionado");
                visibleInHot(14);
                break;
            case 15:
                pool.lblSubTitulo.setText("Mantenimiento seleccionado");
                visibleInHot(14);
                break;
            case -1:
                JOptionPane.showMessageDialog(null, "Error");
                break;
            default:
                //arrojar custom error 
                break;
        }
    }

    /*make only the index panel visible*/
    private void visibleInHot(int index) {
        for (int x = 0; x < jPanelList.size(); x++) {
            jPanelList.get(x).setVisible(false);
        }
        jPanelList.get(index).setVisible(true);
    }

    /*init JPanel list*/
    private void fillPanelList() {
        //agregar paneles MENUS
        jPanelList.addLast(pool.pnlSubMenuPrestamos);                     //index 0
        jPanelList.addLast(pool.pnlSubMenuVehiculos);                     //index 1  
        jPanelList.addLast(pool.pnlSubMenuDepartamentos);                 //index 2
        jPanelList.addLast(pool.pnlSubMenuUsuarios);                      //index 3
        jPanelList.addLast(pool.pnlSubMenuMantenimientos);                //index 4
        //agregar paneles formulario
        jPanelList.addLast(pool.frmPrestamo);                             //index 5 
        jPanelList.addLast(pool.frmTerminarPrestamo);                     //index 6
        jPanelList.addLast(pool.frmVehiculo);                             //index 7
        jPanelList.addLast(pool.frmDepartamento);                         //index 8
        jPanelList.addLast(pool.frmUsuario);                              //index 9
        jPanelList.addLast(pool.frmMantenimiento);                        //index 10
        //agregar paneles de eliminacion
        jPanelList.addLast(pool.slcPrestamo);                             //index 11
        jPanelList.addLast(pool.slcVehiculo);                             //index 12
        jPanelList.addLast(pool.slcDepartamento);                         //index 13
        jPanelList.addLast(pool.slcUsuario);                              //index 14
        jPanelList.addLast(pool.slcMantenimiento);                        //index 15

    }

    private void loadCmbPrestamo() throws Exception {
//        Client c = new Client();
        pool.cmbCdvPrestamo.setModel((ComboBoxModel<String>) c.resquest("cmbCdvPrestamo"));
        pool.cmbNombreDpto.setModel((ComboBoxModel<String>) c.resquest("cmbNomDeptos"));
//        c.desconectar();
    }

    private void manageSaveEvent(MouseEvent evt) throws Exception {
        if (((Component) evt.getSource()).getName().equals("svcPrestamo")) {
//            Client c = new Client();
            c.resquest("svcPrestamo", new Prestamo((Integer) pool.cmbCdvPrestamo.getSelectedItem(),
                    (String) pool.cmbTipoPrestamo.getSelectedItem(),
                    (String) pool.cmbNombreDpto.getSelectedItem(),
                    pool.txtNombreResguardante.getText(),
                    pool.txaDestinoMotivo.getText(),
                    pool.sldAproximadoGasolina.getValue(),
                    pool.txtFechaSalida.getText(),
                    pool.txtHoraSalida.getText(),
                    Integer.parseInt(pool.valesGasolina.getText()),
                    "Encargado",
                    "En curso"));
            loadCmbPrestamo();
            pool.tblMain.setModel((TableModel) c.resquest("cnsPrestamo"));
//            c.desconectar();
        }
        if (((Component) evt.getSource()).getName().equals("svcPrestamoTerminado")) {
//            Client c = new Client();
            c.resquest("svcPrestamoTerminado", new StringBuilder(pool.txtCdv1.getText() + "-" + pool.date.getText() + "-" + pool.time.getText()));

            pool.tblMain.setModel((TableModel) c.resquest("cnsPrestamo"));
//            c.desconectar();
        }
        if (((Component) evt.getSource()).getName().equals("svcVehiculo")) {
//            Client c = new Client();
            c.resquest("svcVehiculo", new Vehiculo(Integer.parseInt(pool.txtCdv2.getText()),
                    pool.txtPlacas.getText(),
                    pool.cmbTipoVehiculo.getSelectedItem().toString(),
                    pool.txtMarca.getText(),
                    pool.txtModelo.getText()));
            pool.tblMain.setModel((TableModel) c.resquest("cnsVehiculo"));
//            c.desconectar();
        }
        if (((Component) evt.getSource()).getName().equals("svcDepartamento")) {
//            Client c = new Client();
            c.resquest("svcDepartamento", new Departamento(pool.txtNombreDepartamento.getText(),
                    pool.txtNombreDepartamento.getText(),
                    Integer.parseInt(pool.txtGasolinaPresupuestada.getText()),
                    Integer.parseInt(pool.cmbDiaActualizarPresupuesto.getSelectedItem().toString())));
            pool.tblMain.setModel((TableModel) c.resquest("cnsDepartamento"));
//            c.desconectar();
        }
    }

    private void manageConsultEvent(MouseEvent evt) throws Exception {
//        Client c = new Client();
        if (((Component) evt.getSource()).getName().contains("cnsPrestamos")) {
            pool.tblMain.setModel((TableModel) c.resquest("cnsPrestamo"));
        }

        if (((Component) evt.getSource()).getName().contains("cnsVehiculos")) {
            pool.tblMain.setModel((TableModel) c.resquest("cnsVehiculo"));
        }

        if (((Component) evt.getSource()).getName().contains("cnsDepartamentos")) {
            pool.tblMain.setModel((TableModel) c.resquest("cnsDepartamento"));
        }
//        c.desconectar();
    }

    private void manageDeleteEvent(MouseEvent evt) throws IOException, Exception {
//        Client c = new Client();
        if (((Component) evt.getSource()).getName().contains("elmVehiculo")) {
            c.resquest("elmVehiculo", new StringBuilder(pool.txtElemV.getText()));
            pool.tblMain.setModel((TableModel) c.resquest("cnsVehiculo"));
        }
    }

    private int getEliminacionIndex(MouseEvent evt) {
        if (((Component) evt.getSource()).getName().substring(0).contains("elmVehiculo")) {
            return 12;

        }
        if (((Component) evt.getSource()).getName().substring(0).contains("elmDepto")) {
            return 13;
        }
        return -1;
    }
}
