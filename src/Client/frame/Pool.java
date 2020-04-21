package Client.frame;

import Client.util.DateTime;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo.alejos
 */
public class Pool extends javax.swing.JFrame {

    private final DateTime dateTime;
    EventAdmin windowEventControl;

    public static void UITheme() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public Pool() {
        initComponents();
        this.setLocationRelativeTo(null);
        pnlSideMenu.setVisible(true);
        pnlHot.setVisible(true);
        pnCold.setVisible(true);
        dateTime = new DateTime(this);
        windowEventControl = new EventAdmin(this);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/driver_40px.png"));

        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroupCarroceria = new javax.swing.ButtonGroup();
        buttonGroupCopasRines = new javax.swing.ButtonGroup();
        buttonGroupTapiceria = new javax.swing.ButtonGroup();
        buttonGroupVidrios = new javax.swing.ButtonGroup();
        buttonGroupEspejos = new javax.swing.ButtonGroup();
        buttonGroupRefaccion = new javax.swing.ButtonGroup();
        buttonGroupGatoCruzeta = new javax.swing.ButtonGroup();
        buttonGroupLuces = new javax.swing.ButtonGroup();
        buttonGroupRadio = new javax.swing.ButtonGroup();
        buttonGroupTablero = new javax.swing.ButtonGroup();
        buttonGroupAireAC = new javax.swing.ButtonGroup();
        pnlMain = new javax.swing.JPanel();
        pnlSideMenu = new javax.swing.JPanel();
        pnlInfo = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        lblSistema = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        pnlHome = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlMenuPrestamos = new javax.swing.JPanel();
        icnMenuPrestamos = new javax.swing.JLabel();
        pnlMenuVehiculos = new javax.swing.JPanel();
        icnMenuVehiculos = new javax.swing.JLabel();
        pnlMenuDepartamentos = new javax.swing.JPanel();
        icnMenuDepartamentos = new javax.swing.JLabel();
        pnlMenuUsuarios = new javax.swing.JPanel();
        icnMenuUsuarios = new javax.swing.JLabel();
        pnlMenuMantenimientos = new javax.swing.JPanel();
        icnMenuMantenimientos = new javax.swing.JLabel();
        pnlHot = new javax.swing.JPanel();
        lblSubTitulo = new javax.swing.JLabel();
        pnlSubMenuPrestamos = new javax.swing.JPanel();
        icnNewPrestamo = new javax.swing.JLabel();
        icnNewConsultPrestamos = new javax.swing.JLabel();
        icnTerminarPrestamo = new javax.swing.JLabel();
        frmPrestamo = new javax.swing.JPanel();
        bckPrestamos = new javax.swing.JLabel();
        icnSavePrestamo = new javax.swing.JLabel();
        lblCdv = new javax.swing.JLabel();
        cmbCdvPrestamo = new javax.swing.JComboBox<>();
        lblTipoPrestamo = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        lblNombreResguardante = new javax.swing.JLabel();
        lblDestinoMotivo = new javax.swing.JLabel();
        lblFechaSalida = new javax.swing.JLabel();
        lblAproximadoGasolina = new javax.swing.JLabel();
        lblHoraSalida = new javax.swing.JLabel();
        cmbNombreDpto = new javax.swing.JComboBox<>();
        cmbTipoPrestamo = new javax.swing.JComboBox<>();
        sldAproximadoGasolina = new javax.swing.JSlider();
        txtNombreResguardante = new javax.swing.JTextField();
        txtFechaSalida = new javax.swing.JTextField();
        txtHoraSalida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDestinoMotivo = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        valesGasolina = new javax.swing.JTextField();
        frmTerminarPrestamo = new javax.swing.JPanel();
        bckPrestamos1 = new javax.swing.JLabel();
        lblCdv1 = new javax.swing.JLabel();
        lblCondicionesVehiculo = new javax.swing.JLabel();
        txtCdv1 = new javax.swing.JTextField();
        icnSavePrestamoTerminado = new javax.swing.JLabel();
        pnlCondicionesBoxes = new javax.swing.JPanel();
        lblCarroceria = new javax.swing.JLabel();
        chkCarroceria = new javax.swing.JCheckBox();
        chkCarroceria1 = new javax.swing.JCheckBox();
        lblCarroceria4 = new javax.swing.JLabel();
        chkCopasRines = new javax.swing.JCheckBox();
        chkCopasRines1 = new javax.swing.JCheckBox();
        lblCarroceria5 = new javax.swing.JLabel();
        chkTapiceria = new javax.swing.JCheckBox();
        chkTapiceria1 = new javax.swing.JCheckBox();
        lblCarroceria3 = new javax.swing.JLabel();
        chkVidrios = new javax.swing.JCheckBox();
        chkVidrios1 = new javax.swing.JCheckBox();
        lblCarroceria7 = new javax.swing.JLabel();
        chkEspejos = new javax.swing.JCheckBox();
        chkEspejos1 = new javax.swing.JCheckBox();
        lblCarroceria1 = new javax.swing.JLabel();
        chkRefaccion = new javax.swing.JCheckBox();
        chkRefaccion1 = new javax.swing.JCheckBox();
        lblCarroceria9 = new javax.swing.JLabel();
        chkGatoCruzeta = new javax.swing.JCheckBox();
        chkGatoCruzeta1 = new javax.swing.JCheckBox();
        lblCarroceria8 = new javax.swing.JLabel();
        chkLuces = new javax.swing.JCheckBox();
        chkLuces1 = new javax.swing.JCheckBox();
        lblCarroceria10 = new javax.swing.JLabel();
        chkRadio = new javax.swing.JCheckBox();
        chkRadio1 = new javax.swing.JCheckBox();
        lblCarroceria2 = new javax.swing.JLabel();
        chkTablero = new javax.swing.JCheckBox();
        chkTablero1 = new javax.swing.JCheckBox();
        lblCarroceria6 = new javax.swing.JLabel();
        chkAireAC = new javax.swing.JCheckBox();
        chkAireAC1 = new javax.swing.JCheckBox();
        slcPrestamo = new javax.swing.JPanel();
        pnlSubMenuVehiculos = new javax.swing.JPanel();
        icnNewVehiculo = new javax.swing.JLabel();
        icnNewConsultVehiculos = new javax.swing.JLabel();
        icnOpcionNoDisponible2 = new javax.swing.JLabel();
        frmVehiculo = new javax.swing.JPanel();
        bckVehiculos = new javax.swing.JLabel();
        icnSaveVehiculo = new javax.swing.JLabel();
        lblCdv2 = new javax.swing.JLabel();
        lblPlacas = new javax.swing.JLabel();
        lblTipoVehiculo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        txtCdv2 = new javax.swing.JTextField();
        txtPlacas = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        cmbTipoVehiculo = new javax.swing.JComboBox<>();
        slcVehiculo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtElemV = new javax.swing.JTextField();
        bckPrestamos2 = new javax.swing.JLabel();
        elmVehiculo = new javax.swing.JLabel();
        pnlSubMenuDepartamentos = new javax.swing.JPanel();
        icnNewDepartamento = new javax.swing.JLabel();
        icnNewConsultDepartamentos = new javax.swing.JLabel();
        icnOpcionNoDisponible1 = new javax.swing.JLabel();
        frmDepartamento = new javax.swing.JPanel();
        bckDepartamentos = new javax.swing.JLabel();
        icnSaveDepartamento = new javax.swing.JLabel();
        lblNombreDepartamento = new javax.swing.JLabel();
        lblJefeDepartamento = new javax.swing.JLabel();
        lblNombreJefeDepartamento = new javax.swing.JLabel();
        lblGasolinaPresupuestada = new javax.swing.JLabel();
        lblActualizarPresupuestoDia = new javax.swing.JLabel();
        lblDeCadaMes = new javax.swing.JLabel();
        txtNombreDepartamento = new javax.swing.JTextField();
        txtNombreJefeDepartamento = new javax.swing.JTextField();
        txtGasolinaPresupuestada = new javax.swing.JTextField();
        cmbDiaActualizarPresupuesto = new javax.swing.JComboBox<>();
        slcDepartamento = new javax.swing.JPanel();
        pnlSubMenuUsuarios = new javax.swing.JPanel();
        icnNewUsuario = new javax.swing.JLabel();
        icnNewConsultUsuarios = new javax.swing.JLabel();
        icnOpcionNoDisponible3 = new javax.swing.JLabel();
        frmUsuario = new javax.swing.JPanel();
        bckUsuarios = new javax.swing.JLabel();
        icnSaveUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        slcUsuario = new javax.swing.JPanel();
        pnlSubMenuMantenimientos = new javax.swing.JPanel();
        icnNewMantenimiento = new javax.swing.JLabel();
        icnConsultMantenimientos = new javax.swing.JLabel();
        icnOpcionNoDisponible4 = new javax.swing.JLabel();
        frmMantenimiento = new javax.swing.JPanel();
        slcMantenimiento = new javax.swing.JPanel();
        pnCold = new javax.swing.JPanel();
        pnlFilter = new javax.swing.JPanel();
        lblSubTitulo2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cmbCampoSort = new javax.swing.JComboBox<>();
        chkAscendente = new javax.swing.JCheckBox();
        chkDescendente = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        scrollPaneMainTable = new javax.swing.JScrollPane();
        tblMain = new javax.swing.JTable();
        lblSubTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pool Vehicular");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setMinimumSize(getPreferredSize());
        setName("frameMain"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setMaximumSize(new java.awt.Dimension(1000, 500));
        pnlMain.setMinimumSize(new java.awt.Dimension(1000, 500));
        pnlMain.setName("pnlMain"); // NOI18N
        pnlMain.setPreferredSize(new java.awt.Dimension(1000, 500));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSideMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlSideMenu.setAlignmentX(0.0F);
        pnlSideMenu.setAlignmentY(0.0F);
        pnlSideMenu.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pnlSideMenu.setMaximumSize(new java.awt.Dimension(200, 400));
        pnlSideMenu.setMinimumSize(new java.awt.Dimension(200, 400));
        pnlSideMenu.setName("pnlSideMenu"); // NOI18N
        pnlSideMenu.setOpaque(false);
        pnlSideMenu.setPreferredSize(new java.awt.Dimension(200, 400));
        pnlSideMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlInfo.setMaximumSize(new java.awt.Dimension(200, 100));
        pnlInfo.setMinimumSize(new java.awt.Dimension(200, 100));
        pnlInfo.setName("pnlInfo"); // NOI18N
        pnlInfo.setOpaque(false);
        pnlInfo.setPreferredSize(new java.awt.Dimension(200, 100));
        pnlInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlInfo.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 25));
        pnlInfo.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 130, 25));

        lblUsername.setText("Usuario:");
        lblUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlInfo.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 90, 25));
        pnlInfo.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 90, 25));

        lblSistema.setText("Accion");
        lblSistema.setName("cmdSistema"); // NOI18N
        pnlInfo.add(lblSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 90, 25));

        lblEstado.setForeground(new java.awt.Color(255, 0, 0));
        lblEstado.setName("cmdSistema"); // NOI18N
        pnlInfo.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 75, 90, 25));

        pnlSideMenu.add(pnlInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 180, -1));

        pnlHome.setBackground(new java.awt.Color(255, 255, 255));
        pnlHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlHome.setPreferredSize(new java.awt.Dimension(200, 40));
        pnlHome.setLayout(new java.awt.CardLayout());

        lblTitulo.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 153, 255));
        lblTitulo.setText("Pool Vehicular ");
        pnlHome.add(lblTitulo, "card2");

        pnlSideMenu.add(pnlHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        pnlMenuPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlMenuPrestamos.setMaximumSize(new java.awt.Dimension(200, 40));
        pnlMenuPrestamos.setMinimumSize(new java.awt.Dimension(200, 40));
        pnlMenuPrestamos.setName("pnlMenuPrestamos"); // NOI18N
        pnlMenuPrestamos.setOpaque(false);
        pnlMenuPrestamos.setPreferredSize(new java.awt.Dimension(200, 40));
        pnlMenuPrestamos.setLayout(new java.awt.GridLayout(1, 0));

        icnMenuPrestamos.setBackground(new java.awt.Color(255, 255, 255));
        icnMenuPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car_theft_40px.png"))); // NOI18N
        icnMenuPrestamos.setText("Prestamos");
        icnMenuPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnMenuPrestamos.setMaximumSize(new java.awt.Dimension(40, 40));
        icnMenuPrestamos.setMinimumSize(new java.awt.Dimension(40, 40));
        icnMenuPrestamos.setName("icnMenuPrestamos"); // NOI18N
        icnMenuPrestamos.setOpaque(true);
        icnMenuPrestamos.setPreferredSize(new java.awt.Dimension(40, 40));
        icnMenuPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icnMenuPrestamosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnMenuPrestamosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnMenuPrestamosMouseExited(evt);
            }
        });
        pnlMenuPrestamos.add(icnMenuPrestamos);

        pnlSideMenu.add(pnlMenuPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, -1));

        pnlMenuVehiculos.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenuVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlMenuVehiculos.setDoubleBuffered(false);
        pnlMenuVehiculos.setName("pnlMenuVehiculos"); // NOI18N
        pnlMenuVehiculos.setPreferredSize(new java.awt.Dimension(200, 40));
        pnlMenuVehiculos.setLayout(new java.awt.GridLayout(1, 0));

        icnMenuVehiculos.setBackground(new java.awt.Color(255, 255, 255));
        icnMenuVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car_40px.png"))); // NOI18N
        icnMenuVehiculos.setText("Vehiculos");
        icnMenuVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnMenuVehiculos.setMaximumSize(new java.awt.Dimension(40, 40));
        icnMenuVehiculos.setMinimumSize(new java.awt.Dimension(40, 40));
        icnMenuVehiculos.setName("icnMenuVehiculos"); // NOI18N
        icnMenuVehiculos.setOpaque(true);
        icnMenuVehiculos.setPreferredSize(new java.awt.Dimension(40, 40));
        icnMenuVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icnMenuVehiculosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnMenuVehiculosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnMenuVehiculosMouseExited(evt);
            }
        });
        pnlMenuVehiculos.add(icnMenuVehiculos);

        pnlSideMenu.add(pnlMenuVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, -1));

        pnlMenuDepartamentos.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenuDepartamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlMenuDepartamentos.setDoubleBuffered(false);
        pnlMenuDepartamentos.setFocusTraversalPolicyProvider(true);
        pnlMenuDepartamentos.setName("pnlMenuDepartamentos"); // NOI18N
        pnlMenuDepartamentos.setPreferredSize(new java.awt.Dimension(200, 40));
        pnlMenuDepartamentos.setLayout(new java.awt.GridLayout(1, 0));

        icnMenuDepartamentos.setBackground(new java.awt.Color(255, 255, 255));
        icnMenuDepartamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/departamentos.png"))); // NOI18N
        icnMenuDepartamentos.setText("Departamentos");
        icnMenuDepartamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnMenuDepartamentos.setMaximumSize(new java.awt.Dimension(40, 40));
        icnMenuDepartamentos.setMinimumSize(new java.awt.Dimension(40, 40));
        icnMenuDepartamentos.setName("icnMenuDepartamentos"); // NOI18N
        icnMenuDepartamentos.setOpaque(true);
        icnMenuDepartamentos.setPreferredSize(new java.awt.Dimension(40, 40));
        icnMenuDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icnMenuDepartamentosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnMenuDepartamentosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnMenuDepartamentosMouseExited(evt);
            }
        });
        pnlMenuDepartamentos.add(icnMenuDepartamentos);

        pnlSideMenu.add(pnlMenuDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, -1));

        pnlMenuUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenuUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlMenuUsuarios.setDoubleBuffered(false);
        pnlMenuUsuarios.setName("pnlMenuUsuarios"); // NOI18N
        pnlMenuUsuarios.setPreferredSize(new java.awt.Dimension(200, 40));
        pnlMenuUsuarios.setLayout(new java.awt.GridLayout(1, 0));

        icnMenuUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        icnMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify user.png"))); // NOI18N
        icnMenuUsuarios.setText("Usuarios");
        icnMenuUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnMenuUsuarios.setMaximumSize(new java.awt.Dimension(40, 40));
        icnMenuUsuarios.setMinimumSize(new java.awt.Dimension(40, 40));
        icnMenuUsuarios.setName("icnMenuUsuarios"); // NOI18N
        icnMenuUsuarios.setOpaque(true);
        icnMenuUsuarios.setPreferredSize(new java.awt.Dimension(40, 40));
        icnMenuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icnMenuUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnMenuUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnMenuUsuariosMouseExited(evt);
            }
        });
        pnlMenuUsuarios.add(icnMenuUsuarios);

        pnlSideMenu.add(pnlMenuUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, -1));

        pnlMenuMantenimientos.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenuMantenimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlMenuMantenimientos.setMaximumSize(new java.awt.Dimension(190, 40));
        pnlMenuMantenimientos.setMinimumSize(new java.awt.Dimension(190, 40));
        pnlMenuMantenimientos.setName("pnlMenuMantenimientos"); // NOI18N
        pnlMenuMantenimientos.setPreferredSize(new java.awt.Dimension(190, 40));
        pnlMenuMantenimientos.setLayout(new java.awt.GridLayout(1, 0));

        icnMenuMantenimientos.setBackground(new java.awt.Color(255, 255, 255));
        icnMenuMantenimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maintenance_40px.png"))); // NOI18N
        icnMenuMantenimientos.setLabelFor(icnMenuPrestamos);
        icnMenuMantenimientos.setText("Mantenimientos");
        icnMenuMantenimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnMenuMantenimientos.setMaximumSize(new java.awt.Dimension(40, 40));
        icnMenuMantenimientos.setMinimumSize(new java.awt.Dimension(40, 40));
        icnMenuMantenimientos.setName("icnMenuMantenimientos"); // NOI18N
        icnMenuMantenimientos.setOpaque(true);
        icnMenuMantenimientos.setPreferredSize(new java.awt.Dimension(40, 40));
        icnMenuMantenimientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icnMenuMantenimientosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnMenuMantenimientosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnMenuMantenimientosMouseExited(evt);
            }
        });
        pnlMenuMantenimientos.add(icnMenuMantenimientos);

        pnlSideMenu.add(pnlMenuMantenimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 180, -1));

        pnlMain.add(pnlSideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 140, -1));

        pnlHot.setBackground(new java.awt.Color(255, 255, 255));
        pnlHot.setAlignmentX(0.0F);
        pnlHot.setAlignmentY(0.0F);
        pnlHot.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pnlHot.setMaximumSize(new java.awt.Dimension(200, 500));
        pnlHot.setMinimumSize(new java.awt.Dimension(200, 500));
        pnlHot.setName("pnlHot"); // NOI18N
        pnlHot.setOpaque(false);
        pnlHot.setPreferredSize(new java.awt.Dimension(200, 500));
        pnlHot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSubTitulo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblSubTitulo.setText("Seleccione una funcion");
        lblSubTitulo.setMaximumSize(new java.awt.Dimension(200, 20));
        lblSubTitulo.setMinimumSize(new java.awt.Dimension(200, 20));
        lblSubTitulo.setName("lblSubTitulo"); // NOI18N
        lblSubTitulo.setPreferredSize(new java.awt.Dimension(200, 20));
        pnlHot.add(lblSubTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 180, 20));

        pnlSubMenuPrestamos.setMaximumSize(new java.awt.Dimension(200, 470));
        pnlSubMenuPrestamos.setMinimumSize(new java.awt.Dimension(200, 470));
        pnlSubMenuPrestamos.setName("pnlSubMenuPrestamos"); // NOI18N
        pnlSubMenuPrestamos.setOpaque(false);
        pnlSubMenuPrestamos.setPreferredSize(new java.awt.Dimension(200, 470));
        pnlSubMenuPrestamos.setVisible(false);
        pnlSubMenuPrestamos.setLayout(new java.awt.GridLayout(3, 0));

        icnNewPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        icnNewPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow right material outline.png"))); // NOI18N
        icnNewPrestamo.setText("Empezar prestamo");
        icnNewPrestamo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        icnNewPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnNewPrestamo.setMaximumSize(new java.awt.Dimension(200, 40));
        icnNewPrestamo.setMinimumSize(new java.awt.Dimension(200, 40));
        icnNewPrestamo.setName("frmPrestamo"); // NOI18N
        icnNewPrestamo.setOpaque(true);
        icnNewPrestamo.setPreferredSize(new java.awt.Dimension(200, 40));
        icnNewPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icnNewPrestamoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnNewPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnNewPrestamoMouseExited(evt);
            }
        });
        pnlSubMenuPrestamos.add(icnNewPrestamo);

        icnNewConsultPrestamos.setBackground(new java.awt.Color(255, 255, 255));
        icnNewConsultPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultar material outline.png"))); // NOI18N
        icnNewConsultPrestamos.setText("Consultar prestamos");
        icnNewConsultPrestamos.setAutoscrolls(true);
        icnNewConsultPrestamos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        icnNewConsultPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnNewConsultPrestamos.setMaximumSize(new java.awt.Dimension(200, 40));
        icnNewConsultPrestamos.setMinimumSize(new java.awt.Dimension(200, 40));
        icnNewConsultPrestamos.setName("cnsPrestamos"); // NOI18N
        icnNewConsultPrestamos.setOpaque(true);
        icnNewConsultPrestamos.setPreferredSize(new java.awt.Dimension(200, 40));
        icnNewConsultPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icnNewConsultPrestamosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnNewConsultPrestamosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnNewConsultPrestamosMouseExited(evt);
            }
        });
        pnlSubMenuPrestamos.add(icnNewConsultPrestamos);

        icnTerminarPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        icnTerminarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close material outline.png"))); // NOI18N
        icnTerminarPrestamo.setText("Terminar prestamo");
        icnTerminarPrestamo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        icnTerminarPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnTerminarPrestamo.setMaximumSize(new java.awt.Dimension(200, 40));
        icnTerminarPrestamo.setMinimumSize(new java.awt.Dimension(200, 40));
        icnTerminarPrestamo.setName("frmTerminarPrestamo"); // NOI18N
        icnTerminarPrestamo.setOpaque(true);
        icnTerminarPrestamo.setPreferredSize(new java.awt.Dimension(200, 40));
        icnTerminarPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icnTerminarPrestamoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnTerminarPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnTerminarPrestamoMouseExited(evt);
            }
        });
        pnlSubMenuPrestamos.add(icnTerminarPrestamo);

        pnlHot.add(pnlSubMenuPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

        frmPrestamo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        frmPrestamo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        frmPrestamo.setMaximumSize(new java.awt.Dimension(200, 470));
        frmPrestamo.setMinimumSize(new java.awt.Dimension(200, 470));
        frmPrestamo.setName("frmPrestamo"); // NOI18N
        frmPrestamo.setOpaque(false);
        frmPrestamo.setPreferredSize(new java.awt.Dimension(200, 470));
        frmPrestamo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        frmPrestamo.setVisible(false);

        bckPrestamos.setBackground(new java.awt.Color(255, 255, 255));
        bckPrestamos.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        bckPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow left material outline.png"))); // NOI18N
        bckPrestamos.setText("volver a prestamos");
        bckPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bckPrestamos.setName("bckMenuPrestamos"); // NOI18N
        bckPrestamos.setOpaque(true);
        bckPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bckPrestamosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bckPrestamosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bckPrestamosMouseExited(evt);
            }
        });
        frmPrestamo.add(bckPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 15, 188, -1));

        icnSavePrestamo.setBackground(new java.awt.Color(255, 255, 255));
        icnSavePrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save material outline.png"))); // NOI18N
        icnSavePrestamo.setText("Guardar Prestamo");
        icnSavePrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icnSavePrestamo.setName("svcPrestamo"); // NOI18N
        icnSavePrestamo.setOpaque(true);
        icnSavePrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icnSavePrestamoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icnSavePrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icnSavePrestamoMouseExited(evt);
            }
        });
        frmPrestamo.add(icnSavePrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 430, 188, -1));

        lblCdv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCdv.setText("Codigo del vehiculo");
        lblCdv.setPreferredSize(new java.awt.Dimension(110, 20));
        frmPrestamo.add(lblCdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 50, -1, -1));

        cmbCdvPrestamo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cmbCdvPrestamo.setMaximumRowCount(10);
        cmbCdvPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbCdvPrestamo.setName("cmbCdvs"); // NOI18N
        cmbCdvPrestamo.setPreferredSize(new java.awt.Dimension(75, 20));
        frmPrestamo.add(cmbCdvPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        lblTipoPrestamo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblTipoPrestamo.setText("Tipo de prestamo");
        lblTipoPrestamo.setPreferredSize(new java.awt.Dimension(100, 20));
        frmPrestamo.add(lblTipoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 80, -1, -1));

        lblDepartamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDepartamento.setText("Departamento");
        lblDepartamento.setPreferredSize(new java.awt.Dimension(80, 20));
        frmPrestamo.add(lblDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 110, -1, -1));

        lblNombreResguardante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblNombreResguardante.setText("Nombre del Resguardante");
        lblNombreResguardante.setPreferredSize(new java.awt.Dimension(147, 20));
        frmPrestamo.add(lblNombreResguardante, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 140, -1, -1));

        lblDestinoMotivo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblDestinoMotivo.setText("Destino o motivo");
        frmPrestamo.add(lblDestinoMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 194, 100, -1));

        lblFechaSalida.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblFechaSalida.setText("Fecha de salida");
        frmPrestamo.add(lblFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 340, 118, 20));

        lblAproximadoGasolina.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblAproximadoGasolina.setText("Aproximado Tanque Gasolina");
        frmPrestamo.add(lblAproximadoGasolina, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 280, 180, -1));

        lblHoraSalida.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblHoraSalida.setText("Hora de salida");
        frmPrestamo.add(lblHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 370, 118, 20));

        cmbNombreDpto.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cmbNombreDpto.setMaximumRowCount(10);
        cmbNombreDpto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbNombreDpto.setName("cmbDepartamentos"); // NOI18N
        cmbNombreDpto.setOpaque(false);
        cmbNombreDpto.setPreferredSize(new java.awt.Dimension(105, 20));
        frmPrestamo.add(cmbNombreDpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        cmbTipoPrestamo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cmbTipoPrestamo.setMaximumRowCount(2);
        cmbTipoPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local", "Foraneo" }));
        cmbTipoPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbTipoPrestamo.setOpaque(false);
        cmbTipoPrestamo.setPreferredSize(new java.awt.Dimension(90, 20));
        cmbTipoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoPrestamoActionPerformed(evt);
            }
        });
        frmPrestamo.add(cmbTipoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 80, -1, -1));

        sldAproximadoGasolina.setPaintTicks(true);
        sldAproximadoGasolina.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sldAproximadoGasolina.setName(""); // NOI18N
        sldAproximadoGasolina.setOpaque(false);
        sldAproximadoGasolina.setValueIsAdjusting(true);
        sldAproximadoGasolina.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldAproximadoGasolinaStateChanged(evt);
            }
        });
        frmPrestamo.add(sldAproximadoGasolina, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 300, 188, 30));

        txtNombreResguardante.setPreferredSize(new java.awt.Dimension(190, 20));
        txtNombreResguardante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreResguardanteActionPerformed(evt);
            }
        });
        frmPrestamo.add(txtNombreResguardante, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 165, -1, -1));

        txtFechaSalida.setEditable(false);
        txtFechaSalida.setPreferredSize(new java.awt.Dimension(85, 20));
        frmPrestamo.add(txtFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        txtHoraSalida.setEditable(false);
        txtHoraSalida.setPreferredSize(new java.awt.Dimension(85, 20));
        txtHoraSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraSalidaActionPerformed(evt);
            }
        });
        frmPrestamo.add(txtHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txaDestinoMotivo.setColumns(20);
        txaDestinoMotivo.setRows(3);
        txaDestinoMotivo.setName(""); // NOI18N
        jScrollPane1.setViewportView(txaDestinoMotivo);

        frmPrestamo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 219, 188, 56));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Monto vales Gasolina");
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 20));
        frmPrestamo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 400, -1, -1));

        valesGasolina.setPreferredSize(new java.awt.Dimension(65, 20));
        valesGasolina.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)
                    || c == KeyEvent.VK_DELETE)) {
                evt.consume();
            }
        }
    });
    frmPrestamo.add(valesGasolina, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

    pnlHot.add(frmPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    frmTerminarPrestamo.setMaximumSize(new java.awt.Dimension(200, 470));
    frmTerminarPrestamo.setMinimumSize(new java.awt.Dimension(200, 470));
    frmTerminarPrestamo.setName("frmTerminarPrestamo"); // NOI18N
    frmTerminarPrestamo.setOpaque(false);
    frmTerminarPrestamo.setVisible(false);
    frmTerminarPrestamo.setPreferredSize(new java.awt.Dimension(200, 470));
    frmTerminarPrestamo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    bckPrestamos1.setBackground(new java.awt.Color(255, 255, 255));
    bckPrestamos1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
    bckPrestamos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow left material outline.png"))); // NOI18N
    bckPrestamos1.setText("volver a prestamos");
    bckPrestamos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    bckPrestamos1.setName("bckMenuPrestamos"); // NOI18N
    bckPrestamos1.setOpaque(true);
    bckPrestamos1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            bckPrestamos1MouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            bckPrestamos1MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            bckPrestamos1MouseExited(evt);
        }
    });
    frmTerminarPrestamo.add(bckPrestamos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 200, -1));

    lblCdv1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    lblCdv1.setText("Codigo del vehiculo");
    frmTerminarPrestamo.add(lblCdv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 110, 20));

    lblCondicionesVehiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    lblCondicionesVehiculo.setText("Condiciones entrada del vehiculo");
    frmTerminarPrestamo.add(lblCondicionesVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, -1));
    frmTerminarPrestamo.add(txtCdv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 80, -1));

    icnSavePrestamoTerminado.setBackground(new java.awt.Color(255, 255, 255));
    icnSavePrestamoTerminado.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
    icnSavePrestamoTerminado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save material outline.png"))); // NOI18N
    icnSavePrestamoTerminado.setText("guardar prestamo terminado");
    icnSavePrestamoTerminado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    icnSavePrestamoTerminado.setName("svcPrestamoTerminado"); // NOI18N
    icnSavePrestamoTerminado.setOpaque(true);
    icnSavePrestamoTerminado.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnSavePrestamoTerminadoMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnSavePrestamoTerminadoMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnSavePrestamoTerminadoMouseExited(evt);
        }
    });
    frmTerminarPrestamo.add(icnSavePrestamoTerminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 394, 200, -1));

    pnlCondicionesBoxes.setOpaque(false);
    pnlCondicionesBoxes.setLayout(new java.awt.GridLayout(11, 3));

    lblCarroceria.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    lblCarroceria.setText("Carroceria");
    pnlCondicionesBoxes.add(lblCarroceria);

    buttonGroupCarroceria.add(chkCarroceria);
    chkCarroceria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkCarroceria.setSelected(true);
    chkCarroceria.setText("Bien");
    chkCarroceria.setOpaque(false);
    pnlCondicionesBoxes.add(chkCarroceria);

    buttonGroupCarroceria.add(chkCarroceria1);
    chkCarroceria1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkCarroceria1.setText("Mal");
    chkCarroceria1.setOpaque(false);
    pnlCondicionesBoxes.add(chkCarroceria1);

    lblCarroceria4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    lblCarroceria4.setText("Copas/Rines");
    pnlCondicionesBoxes.add(lblCarroceria4);

    buttonGroupCopasRines.add(chkCopasRines);
    chkCopasRines.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkCopasRines.setSelected(true);
    chkCopasRines.setText("Bien");
    chkCopasRines.setOpaque(false);
    pnlCondicionesBoxes.add(chkCopasRines);

    buttonGroupCopasRines.add(chkCopasRines1);
    chkCopasRines1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkCopasRines1.setText("Mal");
    chkCopasRines1.setOpaque(false);
    pnlCondicionesBoxes.add(chkCopasRines1);

    lblCarroceria5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    lblCarroceria5.setText("Tapiceria");
    pnlCondicionesBoxes.add(lblCarroceria5);

    buttonGroupTapiceria.add(chkTapiceria);
    chkTapiceria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkTapiceria.setSelected(true);
    chkTapiceria.setText("Bien");
    chkTapiceria.setOpaque(false);
    pnlCondicionesBoxes.add(chkTapiceria);

    buttonGroupTapiceria.add(chkTapiceria1);
    chkTapiceria1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkTapiceria1.setText("Mal");
    chkTapiceria1.setOpaque(false);
    pnlCondicionesBoxes.add(chkTapiceria1);

    lblCarroceria3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    lblCarroceria3.setText("Vidrios");
    pnlCondicionesBoxes.add(lblCarroceria3);

    buttonGroupVidrios.add(chkVidrios);
    chkVidrios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkVidrios.setSelected(true);
    chkVidrios.setText("Bien");
    chkVidrios.setOpaque(false);
    pnlCondicionesBoxes.add(chkVidrios);

    buttonGroupVidrios.add(chkVidrios1);
    chkVidrios1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkVidrios1.setText("Mal");
    chkVidrios1.setOpaque(false);
    pnlCondicionesBoxes.add(chkVidrios1);

    lblCarroceria7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    lblCarroceria7.setText("Espejos");
    pnlCondicionesBoxes.add(lblCarroceria7);

    buttonGroupEspejos.add(chkEspejos);
    chkEspejos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkEspejos.setSelected(true);
    chkEspejos.setText("Bien");
    chkEspejos.setOpaque(false);
    chkEspejos.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkEspejosActionPerformed(evt);
        }
    });
    pnlCondicionesBoxes.add(chkEspejos);

    buttonGroupEspejos.add(chkEspejos1);
    chkEspejos1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkEspejos1.setText("Mal");
    chkEspejos1.setOpaque(false);
    pnlCondicionesBoxes.add(chkEspejos1);

    lblCarroceria1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    lblCarroceria1.setText("Refaccion");
    pnlCondicionesBoxes.add(lblCarroceria1);

    buttonGroupRefaccion.add(chkRefaccion);
    chkRefaccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkRefaccion.setSelected(true);
    chkRefaccion.setText("Bien");
    chkRefaccion.setOpaque(false);
    pnlCondicionesBoxes.add(chkRefaccion);

    buttonGroupRefaccion.add(chkRefaccion1);
    chkRefaccion1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkRefaccion1.setText("Mal");
    chkRefaccion1.setOpaque(false);
    pnlCondicionesBoxes.add(chkRefaccion1);

    lblCarroceria9.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    lblCarroceria9.setText("Gato/Cruzeta");
    pnlCondicionesBoxes.add(lblCarroceria9);

    buttonGroupGatoCruzeta.add(chkGatoCruzeta);
    chkGatoCruzeta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkGatoCruzeta.setSelected(true);
    chkGatoCruzeta.setText("Bien");
    chkGatoCruzeta.setOpaque(false);
    pnlCondicionesBoxes.add(chkGatoCruzeta);

    buttonGroupGatoCruzeta.add(chkGatoCruzeta1);
    chkGatoCruzeta1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkGatoCruzeta1.setText("Mal");
    chkGatoCruzeta1.setOpaque(false);
    pnlCondicionesBoxes.add(chkGatoCruzeta1);

    lblCarroceria8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    lblCarroceria8.setText("Luces");
    pnlCondicionesBoxes.add(lblCarroceria8);

    buttonGroupLuces.add(chkLuces);
    chkLuces.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkLuces.setSelected(true);
    chkLuces.setText("Bien");
    chkLuces.setOpaque(false);
    pnlCondicionesBoxes.add(chkLuces);

    buttonGroupLuces.add(chkLuces1);
    chkLuces1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkLuces1.setText("Mal");
    chkLuces1.setOpaque(false);
    pnlCondicionesBoxes.add(chkLuces1);

    lblCarroceria10.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    lblCarroceria10.setText("Radio");
    pnlCondicionesBoxes.add(lblCarroceria10);

    buttonGroupRadio.add(chkRadio);
    chkRadio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkRadio.setSelected(true);
    chkRadio.setText("Bien");
    chkRadio.setOpaque(false);
    pnlCondicionesBoxes.add(chkRadio);

    buttonGroupRadio.add(chkRadio1);
    chkRadio1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkRadio1.setText("Mal");
    chkRadio1.setOpaque(false);
    pnlCondicionesBoxes.add(chkRadio1);

    lblCarroceria2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    lblCarroceria2.setText("Tablero");
    pnlCondicionesBoxes.add(lblCarroceria2);

    buttonGroupTablero.add(chkTablero);
    chkTablero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkTablero.setSelected(true);
    chkTablero.setText("Bien");
    chkTablero.setOpaque(false);
    pnlCondicionesBoxes.add(chkTablero);

    buttonGroupTablero.add(chkTablero1);
    chkTablero1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkTablero1.setText("Mal");
    chkTablero1.setOpaque(false);
    pnlCondicionesBoxes.add(chkTablero1);

    lblCarroceria6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    lblCarroceria6.setText("A/AC");
    pnlCondicionesBoxes.add(lblCarroceria6);

    buttonGroupAireAC.add(chkAireAC);
    chkAireAC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkAireAC.setSelected(true);
    chkAireAC.setText("Bien");
    chkAireAC.setOpaque(false);
    pnlCondicionesBoxes.add(chkAireAC);

    buttonGroupAireAC.add(chkAireAC1);
    chkAireAC1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    chkAireAC1.setText("Mal");
    chkAireAC1.setOpaque(false);
    pnlCondicionesBoxes.add(chkAireAC1);

    frmTerminarPrestamo.add(pnlCondicionesBoxes, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 140, -1, 250));

    pnlHot.add(frmTerminarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    slcPrestamo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    slcPrestamo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    slcPrestamo.setMaximumSize(new java.awt.Dimension(200, 470));
    slcPrestamo.setMinimumSize(new java.awt.Dimension(200, 470));
    slcPrestamo.setName("slcPrestamo"); // NOI18N
    slcPrestamo.setOpaque(false);
    slcPrestamo.setPreferredSize(new java.awt.Dimension(200, 470));
    slcPrestamo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    slcPrestamo.setVisible(false);
    pnlHot.add(slcPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    pnlSubMenuVehiculos.setMaximumSize(new java.awt.Dimension(200, 470));
    pnlSubMenuVehiculos.setMinimumSize(new java.awt.Dimension(200, 470));
    pnlSubMenuVehiculos.setName("pnlSubMenuVehiculos"); // NOI18N
    pnlSubMenuVehiculos.setOpaque(false);
    pnlSubMenuVehiculos.setPreferredSize(new java.awt.Dimension(200, 470));
    pnlSubMenuVehiculos.setVisible(false);
    pnlSubMenuVehiculos.setLayout(new java.awt.GridLayout(3, 1));

    icnNewVehiculo.setBackground(new java.awt.Color(255, 255, 255));
    icnNewVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow right material outline.png"))); // NOI18N
    icnNewVehiculo.setText("Ingresar vehiculo al pool");
    icnNewVehiculo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    icnNewVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    icnNewVehiculo.setMaximumSize(new java.awt.Dimension(200, 40));
    icnNewVehiculo.setMinimumSize(new java.awt.Dimension(200, 40));
    icnNewVehiculo.setName("frmVehiculo"); // NOI18N
    icnNewVehiculo.setOpaque(true);
    icnNewVehiculo.setPreferredSize(new java.awt.Dimension(200, 40));
    icnNewVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnNewVehiculoMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnNewVehiculoMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnNewVehiculoMouseExited(evt);
        }
    });
    pnlSubMenuVehiculos.add(icnNewVehiculo);

    icnNewConsultVehiculos.setBackground(new java.awt.Color(255, 255, 255));
    icnNewConsultVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultar material outline.png"))); // NOI18N
    icnNewConsultVehiculos.setText("Mostrar vehiculos en pool");
    icnNewConsultVehiculos.setAutoscrolls(true);
    icnNewConsultVehiculos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    icnNewConsultVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    icnNewConsultVehiculos.setMaximumSize(new java.awt.Dimension(200, 40));
    icnNewConsultVehiculos.setMinimumSize(new java.awt.Dimension(200, 40));
    icnNewConsultVehiculos.setName("cnsVehiculos"); // NOI18N
    icnNewConsultVehiculos.setOpaque(true);
    icnNewConsultVehiculos.setPreferredSize(new java.awt.Dimension(200, 40));
    icnNewConsultVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnNewConsultVehiculosMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnNewConsultVehiculosMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnNewConsultVehiculosMouseExited(evt);
        }
    });
    pnlSubMenuVehiculos.add(icnNewConsultVehiculos);

    icnOpcionNoDisponible2.setBackground(new java.awt.Color(255, 255, 255));
    icnOpcionNoDisponible2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close material outline.png"))); // NOI18N
    icnOpcionNoDisponible2.setText("Eliminacion");
    icnOpcionNoDisponible2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    icnOpcionNoDisponible2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    icnOpcionNoDisponible2.setMaximumSize(new java.awt.Dimension(200, 40));
    icnOpcionNoDisponible2.setMinimumSize(new java.awt.Dimension(200, 40));
    icnOpcionNoDisponible2.setName("frmelmVehiculo"); // NOI18N
    icnOpcionNoDisponible2.setOpaque(true);
    icnOpcionNoDisponible2.setPreferredSize(new java.awt.Dimension(200, 40));
    icnOpcionNoDisponible2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnOpcionNoDisponible2MouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnOpcionNoDisponible2MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnOpcionNoDisponible2MouseExited(evt);
        }
    });
    pnlSubMenuVehiculos.add(icnOpcionNoDisponible2);

    pnlHot.add(pnlSubMenuVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    frmVehiculo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    frmVehiculo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    frmVehiculo.setMaximumSize(new java.awt.Dimension(200, 470));
    frmVehiculo.setMinimumSize(new java.awt.Dimension(200, 470));
    frmVehiculo.setName("frmVehiculo"); // NOI18N
    frmVehiculo.setOpaque(false);
    frmVehiculo.setPreferredSize(new java.awt.Dimension(200, 470));
    frmVehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    frmVehiculo.setVisible(false);

    bckVehiculos.setBackground(new java.awt.Color(255, 255, 255));
    bckVehiculos.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
    bckVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow left material outline.png"))); // NOI18N
    bckVehiculos.setText("volver a vehiculos");
    bckVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    bckVehiculos.setName("bckMenuVehiculos"); // NOI18N
    bckVehiculos.setOpaque(true);
    bckVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            bckVehiculosMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            bckVehiculosMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            bckVehiculosMouseExited(evt);
        }
    });
    frmVehiculo.add(bckVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 200, -1));

    icnSaveVehiculo.setBackground(new java.awt.Color(255, 255, 255));
    icnSaveVehiculo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
    icnSaveVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save material outline.png"))); // NOI18N
    icnSaveVehiculo.setText("guardar vehiculo");
    icnSaveVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    icnSaveVehiculo.setName("svcVehiculo"); // NOI18N
    icnSaveVehiculo.setOpaque(true);
    icnSaveVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnSaveVehiculoMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnSaveVehiculoMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnSaveVehiculoMouseExited(evt);
        }
    });
    frmVehiculo.add(icnSaveVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 394, 200, -1));

    lblCdv2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    lblCdv2.setText("Codigo del vehiculo");
    frmVehiculo.add(lblCdv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 90, 110, 20));

    lblPlacas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    lblPlacas.setText("Placas");
    frmVehiculo.add(lblPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, 20));

    lblTipoVehiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    lblTipoVehiculo.setText("Tipo");
    frmVehiculo.add(lblTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, 20));

    lblMarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    lblMarca.setText("Marca");
    frmVehiculo.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 20));

    lblModelo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    lblModelo.setText("Modelo");
    frmVehiculo.add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 20));

    txtCdv2.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)
                || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }
    });
    frmVehiculo.add(txtCdv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 70, -1));
    frmVehiculo.add(txtPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 70, -1));
    frmVehiculo.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 70, -1));
    frmVehiculo.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 70, -1));

    cmbTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oficial", "Rentado" }));
    frmVehiculo.add(cmbTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 70, -1));

    pnlHot.add(frmVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    slcVehiculo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    slcVehiculo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    slcVehiculo.setMaximumSize(new java.awt.Dimension(200, 470));
    slcVehiculo.setMinimumSize(new java.awt.Dimension(200, 470));
    slcVehiculo.setName("pnlElmVehiculo"); // NOI18N
    slcVehiculo.setOpaque(false);
    slcVehiculo.setPreferredSize(new java.awt.Dimension(200, 470));
    slcVehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    slcVehiculo.setVisible(false);

    jLabel4.setText("Codigo del vehiculo a eliminar");
    slcVehiculo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, 20));
    slcVehiculo.add(txtElemV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 20));

    bckPrestamos2.setBackground(new java.awt.Color(255, 255, 255));
    bckPrestamos2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    bckPrestamos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow left material outline.png"))); // NOI18N
    bckPrestamos2.setText("Volver a vehiculos");
    bckPrestamos2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    bckPrestamos2.setName("bckMenuVehiculos"); // NOI18N
    bckPrestamos2.setOpaque(true);
    bckPrestamos2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            bckPrestamos2MouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            bckPrestamos2MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            bckPrestamos2MouseExited(evt);
        }
    });
    slcVehiculo.add(bckPrestamos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 50, 190, 130));

    elmVehiculo.setBackground(new java.awt.Color(255, 255, 255));
    elmVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save material outline.png"))); // NOI18N
    elmVehiculo.setText("Borrar");
    elmVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    elmVehiculo.setName("elmVehiculo"); // NOI18N
    elmVehiculo.setOpaque(true);
    elmVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            elmVehiculoMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            elmVehiculoMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            elmVehiculoMouseExited(evt);
        }
    });
    slcVehiculo.add(elmVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, 80));

    pnlHot.add(slcVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    pnlSubMenuDepartamentos.setMaximumSize(new java.awt.Dimension(200, 470));
    pnlSubMenuDepartamentos.setMinimumSize(new java.awt.Dimension(200, 470));
    pnlSubMenuDepartamentos.setName("pnlSubMenuDepartamentos"); // NOI18N
    pnlSubMenuDepartamentos.setOpaque(false);
    pnlSubMenuDepartamentos.setPreferredSize(new java.awt.Dimension(200, 470));
    pnlSubMenuDepartamentos.setVisible(false);
    pnlSubMenuDepartamentos.setLayout(new java.awt.GridLayout(3, 1));

    icnNewDepartamento.setBackground(new java.awt.Color(255, 255, 255));
    icnNewDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow right material outline.png"))); // NOI18N
    icnNewDepartamento.setText("Agregar departamento");
    icnNewDepartamento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    icnNewDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    icnNewDepartamento.setMaximumSize(new java.awt.Dimension(200, 40));
    icnNewDepartamento.setMinimumSize(new java.awt.Dimension(200, 40));
    icnNewDepartamento.setName("frmDepartamento"); // NOI18N
    icnNewDepartamento.setOpaque(true);
    icnNewDepartamento.setPreferredSize(new java.awt.Dimension(200, 40));
    icnNewDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnNewDepartamentoMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnNewDepartamentoMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnNewDepartamentoMouseExited(evt);
        }
    });
    pnlSubMenuDepartamentos.add(icnNewDepartamento);

    icnNewConsultDepartamentos.setBackground(new java.awt.Color(255, 255, 255));
    icnNewConsultDepartamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultar material outline.png"))); // NOI18N
    icnNewConsultDepartamentos.setText("Ver departamentos existentes");
    icnNewConsultDepartamentos.setAutoscrolls(true);
    icnNewConsultDepartamentos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    icnNewConsultDepartamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    icnNewConsultDepartamentos.setMaximumSize(new java.awt.Dimension(200, 40));
    icnNewConsultDepartamentos.setMinimumSize(new java.awt.Dimension(200, 40));
    icnNewConsultDepartamentos.setName("cnsDepartamentos"); // NOI18N
    icnNewConsultDepartamentos.setOpaque(true);
    icnNewConsultDepartamentos.setPreferredSize(new java.awt.Dimension(200, 40));
    icnNewConsultDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnNewConsultDepartamentosMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnNewConsultDepartamentosMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnNewConsultDepartamentosMouseExited(evt);
        }
    });
    pnlSubMenuDepartamentos.add(icnNewConsultDepartamentos);

    icnOpcionNoDisponible1.setBackground(new java.awt.Color(255, 255, 255));
    icnOpcionNoDisponible1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close material outline.png"))); // NOI18N
    icnOpcionNoDisponible1.setText("Eliminar departamento");
    icnOpcionNoDisponible1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    icnOpcionNoDisponible1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    icnOpcionNoDisponible1.setMaximumSize(new java.awt.Dimension(200, 40));
    icnOpcionNoDisponible1.setMinimumSize(new java.awt.Dimension(200, 40));
    icnOpcionNoDisponible1.setName("notSupportedYet"); // NOI18N
    icnOpcionNoDisponible1.setOpaque(true);
    icnOpcionNoDisponible1.setPreferredSize(new java.awt.Dimension(200, 40));
    icnOpcionNoDisponible1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnOpcionNoDisponible1MouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnOpcionNoDisponible1MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnOpcionNoDisponible1MouseExited(evt);
        }
    });
    pnlSubMenuDepartamentos.add(icnOpcionNoDisponible1);

    pnlHot.add(pnlSubMenuDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    frmDepartamento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    frmDepartamento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    frmDepartamento.setMaximumSize(new java.awt.Dimension(200, 470));
    frmDepartamento.setMinimumSize(new java.awt.Dimension(200, 470));
    frmDepartamento.setName("frmDepartamento"); // NOI18N
    frmDepartamento.setOpaque(false);
    frmDepartamento.setPreferredSize(new java.awt.Dimension(200, 470));
    frmDepartamento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    frmDepartamento.setVisible(false);

    bckDepartamentos.setBackground(new java.awt.Color(255, 255, 255));
    bckDepartamentos.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
    bckDepartamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow left material outline.png"))); // NOI18N
    bckDepartamentos.setText("volver a departamentos");
    bckDepartamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    bckDepartamentos.setName("bckMenuDepartamentos"); // NOI18N
    bckDepartamentos.setOpaque(true);
    bckDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            bckDepartamentosMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            bckDepartamentosMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            bckDepartamentosMouseExited(evt);
        }
    });
    frmDepartamento.add(bckDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 200, -1));

    icnSaveDepartamento.setBackground(new java.awt.Color(255, 255, 255));
    icnSaveDepartamento.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
    icnSaveDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save material outline.png"))); // NOI18N
    icnSaveDepartamento.setText("guardar departamento");
    icnSaveDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    icnSaveDepartamento.setName("svcDepartamento"); // NOI18N
    icnSaveDepartamento.setOpaque(true);
    icnSaveDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnSaveDepartamentoMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnSaveDepartamentoMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnSaveDepartamentoMouseExited(evt);
        }
    });
    frmDepartamento.add(icnSaveDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 394, 200, -1));

    lblNombreDepartamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    lblNombreDepartamento.setText("Nombre del  departamento");
    frmDepartamento.add(lblNombreDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

    lblJefeDepartamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    lblJefeDepartamento.setText("Jefe del departamento");
    frmDepartamento.add(lblJefeDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

    lblNombreJefeDepartamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    lblNombreJefeDepartamento.setText("Nombre");
    frmDepartamento.add(lblNombreJefeDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

    lblGasolinaPresupuestada.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    lblGasolinaPresupuestada.setText("Gasolina presupuestada");
    frmDepartamento.add(lblGasolinaPresupuestada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

    lblActualizarPresupuestoDia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    lblActualizarPresupuestoDia.setText("Actualizar presupuesto el dia");
    frmDepartamento.add(lblActualizarPresupuestoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

    lblDeCadaMes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    lblDeCadaMes.setText("de cada mes");
    frmDepartamento.add(lblDeCadaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 20));
    frmDepartamento.add(txtNombreDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, -1));
    frmDepartamento.add(txtNombreJefeDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 170, -1));

    txtGasolinaPresupuestada.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)
                || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }
    });
    frmDepartamento.add(txtGasolinaPresupuestada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, -1));

    cmbDiaActualizarPresupuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
    frmDepartamento.add(cmbDiaActualizarPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 40, -1));

    pnlHot.add(frmDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    slcDepartamento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    slcDepartamento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    slcDepartamento.setMaximumSize(new java.awt.Dimension(200, 470));
    slcDepartamento.setMinimumSize(new java.awt.Dimension(200, 470));
    slcDepartamento.setName("slcDepartamento"); // NOI18N
    slcDepartamento.setOpaque(false);
    slcDepartamento.setPreferredSize(new java.awt.Dimension(200, 470));
    slcDepartamento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    slcDepartamento.setVisible(false);
    pnlHot.add(slcDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    pnlSubMenuUsuarios.setMaximumSize(new java.awt.Dimension(200, 470));
    pnlSubMenuUsuarios.setMinimumSize(new java.awt.Dimension(200, 470));
    pnlSubMenuUsuarios.setName("pnlSubMenuUsuarios"); // NOI18N
    pnlSubMenuUsuarios.setOpaque(false);
    pnlSubMenuUsuarios.setPreferredSize(new java.awt.Dimension(200, 470));
    pnlSubMenuUsuarios.setVisible(false);
    pnlSubMenuUsuarios.setLayout(new java.awt.GridLayout(3, 1));

    icnNewUsuario.setBackground(new java.awt.Color(255, 255, 255));
    icnNewUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow right material outline.png"))); // NOI18N
    icnNewUsuario.setText("Crear usuario");
    icnNewUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    icnNewUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    icnNewUsuario.setMaximumSize(new java.awt.Dimension(200, 40));
    icnNewUsuario.setMinimumSize(new java.awt.Dimension(200, 40));
    icnNewUsuario.setName("frmUsuario"); // NOI18N
    icnNewUsuario.setOpaque(true);
    icnNewUsuario.setPreferredSize(new java.awt.Dimension(200, 40));
    icnNewUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnNewUsuarioMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnNewUsuarioMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnNewUsuarioMouseExited(evt);
        }
    });
    pnlSubMenuUsuarios.add(icnNewUsuario);

    icnNewConsultUsuarios.setBackground(new java.awt.Color(255, 255, 255));
    icnNewConsultUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultar material outline.png"))); // NOI18N
    icnNewConsultUsuarios.setText("Consultar usuarios");
    icnNewConsultUsuarios.setAutoscrolls(true);
    icnNewConsultUsuarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    icnNewConsultUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    icnNewConsultUsuarios.setMaximumSize(new java.awt.Dimension(200, 40));
    icnNewConsultUsuarios.setMinimumSize(new java.awt.Dimension(200, 40));
    icnNewConsultUsuarios.setName("cnsUsuarios"); // NOI18N
    icnNewConsultUsuarios.setOpaque(true);
    icnNewConsultUsuarios.setPreferredSize(new java.awt.Dimension(200, 40));
    icnNewConsultUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnNewConsultUsuariosMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnNewConsultUsuariosMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnNewConsultUsuariosMouseExited(evt);
        }
    });
    pnlSubMenuUsuarios.add(icnNewConsultUsuarios);

    icnOpcionNoDisponible3.setBackground(new java.awt.Color(255, 255, 255));
    icnOpcionNoDisponible3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close material outline.png"))); // NOI18N
    icnOpcionNoDisponible3.setText("proximamente");
    icnOpcionNoDisponible3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    icnOpcionNoDisponible3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    icnOpcionNoDisponible3.setMaximumSize(new java.awt.Dimension(200, 40));
    icnOpcionNoDisponible3.setMinimumSize(new java.awt.Dimension(200, 40));
    icnOpcionNoDisponible3.setName("notSupportedYed"); // NOI18N
    icnOpcionNoDisponible3.setOpaque(true);
    icnOpcionNoDisponible3.setPreferredSize(new java.awt.Dimension(200, 40));
    icnOpcionNoDisponible3.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnOpcionNoDisponible3MouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnOpcionNoDisponible3MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnOpcionNoDisponible3MouseExited(evt);
        }
    });
    pnlSubMenuUsuarios.add(icnOpcionNoDisponible3);

    pnlHot.add(pnlSubMenuUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    frmUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    frmUsuario.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    frmUsuario.setMaximumSize(new java.awt.Dimension(200, 470));
    frmUsuario.setMinimumSize(new java.awt.Dimension(200, 470));
    frmUsuario.setName("frmUsuario"); // NOI18N
    frmUsuario.setOpaque(false);
    frmUsuario.setPreferredSize(new java.awt.Dimension(200, 470));
    frmUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    frmUsuario.setVisible(false);

    bckUsuarios.setBackground(new java.awt.Color(255, 255, 255));
    bckUsuarios.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    bckUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow left material outline.png"))); // NOI18N
    bckUsuarios.setText("volver a usuarios");
    bckUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    bckUsuarios.setName("bckMenuUsuarios"); // NOI18N
    bckUsuarios.setOpaque(true);
    bckUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            bckUsuariosMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            bckUsuariosMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            bckUsuariosMouseExited(evt);
        }
    });
    frmUsuario.add(bckUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 200, -1));

    icnSaveUsuario.setBackground(new java.awt.Color(255, 255, 255));
    icnSaveUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save material outline.png"))); // NOI18N
    icnSaveUsuario.setText("guardar usuario");
    icnSaveUsuario.setName("svcUsuario"); // NOI18N
    icnSaveUsuario.setOpaque(true);
    icnSaveUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnSaveUsuarioMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnSaveUsuarioMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnSaveUsuarioMouseExited(evt);
        }
    });
    frmUsuario.add(icnSaveUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 394, 200, -1));

    jLabel3.setText("Nombre de usuario");
    frmUsuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
    frmUsuario.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 180, -1));

    pnlHot.add(frmUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    slcUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    slcUsuario.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    slcUsuario.setMaximumSize(new java.awt.Dimension(200, 470));
    slcUsuario.setMinimumSize(new java.awt.Dimension(200, 470));
    slcUsuario.setName("slcUsuario"); // NOI18N
    slcUsuario.setOpaque(false);
    slcUsuario.setPreferredSize(new java.awt.Dimension(200, 470));
    slcUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    slcUsuario.setVisible(false);
    pnlHot.add(slcUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    pnlSubMenuMantenimientos.setMaximumSize(new java.awt.Dimension(200, 470));
    pnlSubMenuMantenimientos.setMinimumSize(new java.awt.Dimension(200, 470));
    pnlSubMenuMantenimientos.setName("pnlSubMenuMantenimientos"); // NOI18N
    pnlSubMenuMantenimientos.setOpaque(false);
    pnlSubMenuMantenimientos.setPreferredSize(new java.awt.Dimension(200, 470));
    pnlSubMenuMantenimientos.setVisible(false);

    icnNewMantenimiento.setBackground(new java.awt.Color(255, 255, 255));
    icnNewMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow right material outline.png"))); // NOI18N
    icnNewMantenimiento.setText("Asignar vehiculo a mantenimiento");
    icnNewMantenimiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    icnNewMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    icnNewMantenimiento.setMaximumSize(new java.awt.Dimension(200, 40));
    icnNewMantenimiento.setMinimumSize(new java.awt.Dimension(200, 40));
    icnNewMantenimiento.setName("frmMantenimiento"); // NOI18N
    icnNewMantenimiento.setOpaque(true);
    icnNewMantenimiento.setPreferredSize(new java.awt.Dimension(200, 40));
    icnNewMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnNewMantenimientoMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnNewMantenimientoMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnNewMantenimientoMouseExited(evt);
        }
    });

    icnConsultMantenimientos.setBackground(new java.awt.Color(255, 255, 255));
    icnConsultMantenimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/consultar material outline.png"))); // NOI18N
    icnConsultMantenimientos.setText("Ver vehiculos en mantenimiento");
    icnConsultMantenimientos.setAutoscrolls(true);
    icnConsultMantenimientos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    icnConsultMantenimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    icnConsultMantenimientos.setMaximumSize(new java.awt.Dimension(200, 40));
    icnConsultMantenimientos.setMinimumSize(new java.awt.Dimension(200, 40));
    icnConsultMantenimientos.setName("cnsMantenimientos"); // NOI18N
    icnConsultMantenimientos.setOpaque(true);
    icnConsultMantenimientos.setPreferredSize(new java.awt.Dimension(200, 40));
    icnConsultMantenimientos.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnConsultMantenimientosMouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnConsultMantenimientosMouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnConsultMantenimientosMouseExited(evt);
        }
    });

    icnOpcionNoDisponible4.setBackground(new java.awt.Color(255, 255, 255));
    icnOpcionNoDisponible4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close material outline.png"))); // NOI18N
    icnOpcionNoDisponible4.setText("proximamente");
    icnOpcionNoDisponible4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    icnOpcionNoDisponible4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    icnOpcionNoDisponible4.setMaximumSize(new java.awt.Dimension(200, 40));
    icnOpcionNoDisponible4.setMinimumSize(new java.awt.Dimension(200, 40));
    icnOpcionNoDisponible4.setName("notSupportedYed"); // NOI18N
    icnOpcionNoDisponible4.setOpaque(true);
    icnOpcionNoDisponible4.setPreferredSize(new java.awt.Dimension(200, 40));
    icnOpcionNoDisponible4.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            icnOpcionNoDisponible4MouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            icnOpcionNoDisponible4MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            icnOpcionNoDisponible4MouseExited(evt);
        }
    });

    javax.swing.GroupLayout pnlSubMenuMantenimientosLayout = new javax.swing.GroupLayout(pnlSubMenuMantenimientos);
    pnlSubMenuMantenimientos.setLayout(pnlSubMenuMantenimientosLayout);
    pnlSubMenuMantenimientosLayout.setHorizontalGroup(
        pnlSubMenuMantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 200, Short.MAX_VALUE)
        .addGroup(pnlSubMenuMantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubMenuMantenimientosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlSubMenuMantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icnNewMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icnConsultMantenimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icnOpcionNoDisponible4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)))
    );
    pnlSubMenuMantenimientosLayout.setVerticalGroup(
        pnlSubMenuMantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 470, Short.MAX_VALUE)
        .addGroup(pnlSubMenuMantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSubMenuMantenimientosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(icnNewMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(icnConsultMantenimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(icnOpcionNoDisponible4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)))
    );

    pnlHot.add(pnlSubMenuMantenimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    frmMantenimiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    frmMantenimiento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    frmMantenimiento.setMaximumSize(new java.awt.Dimension(200, 470));
    frmMantenimiento.setMinimumSize(new java.awt.Dimension(200, 470));
    frmMantenimiento.setName("frmMantenimiento"); // NOI18N
    frmMantenimiento.setOpaque(false);
    frmMantenimiento.setPreferredSize(new java.awt.Dimension(200, 470));
    frmMantenimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    frmMantenimiento.setVisible(false);
    pnlHot.add(frmMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    slcMantenimiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    slcMantenimiento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    slcMantenimiento.setMaximumSize(new java.awt.Dimension(200, 470));
    slcMantenimiento.setMinimumSize(new java.awt.Dimension(200, 470));
    slcMantenimiento.setName("slcMantenimiento"); // NOI18N
    slcMantenimiento.setOpaque(false);
    slcMantenimiento.setPreferredSize(new java.awt.Dimension(200, 470));
    slcMantenimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    slcMantenimiento.setVisible(false);
    pnlHot.add(slcMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, -1, -1));

    pnlMain.add(pnlHot, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 0, 210, -1));

    pnCold.setBackground(new java.awt.Color(255, 255, 255));
    pnCold.setAlignmentX(0.0F);
    pnCold.setAlignmentY(0.0F);
    pnCold.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    pnCold.setMaximumSize(new java.awt.Dimension(800, 500));
    pnCold.setMinimumSize(new java.awt.Dimension(800, 500));
    pnCold.setName("pnlCold"); // NOI18N
    pnCold.setOpaque(false);
    pnCold.setPreferredSize(new java.awt.Dimension(800, 500));
    pnCold.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    pnlFilter.setBackground(new java.awt.Color(255, 255, 255));
    pnlFilter.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    pnlFilter.setMaximumSize(new java.awt.Dimension(200, 40));
    pnlFilter.setMinimumSize(new java.awt.Dimension(200, 40));
    pnlFilter.setName("pnlFilter"); // NOI18N
    pnlFilter.setOpaque(false);
    pnlFilter.setPreferredSize(new java.awt.Dimension(200, 40));
    pnlFilter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lblSubTitulo2.setBackground(new java.awt.Color(255, 255, 255));
    lblSubTitulo2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    lblSubTitulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filter_edit_24px.png"))); // NOI18N
    lblSubTitulo2.setText("Filtrar consultas");
    lblSubTitulo2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    lblSubTitulo2.setName("label filtrar consultas 1 sub titulo 2"); // NOI18N
    lblSubTitulo2.setOpaque(true);
    lblSubTitulo2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            lblSubTitulo2MouseClicked(evt);
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            lblSubTitulo2MouseEntered(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            lblSubTitulo2MouseExited(evt);
        }
    });
    pnlFilter.add(lblSubTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

    jTabbedPane1.setPreferredSize(new java.awt.Dimension(100, 40));

    jPanel1.add(cmbCampoSort);

    buttonGroup1.add(chkAscendente);
    chkAscendente.setSelected(true);
    chkAscendente.setText("Campo A");
    jPanel1.add(chkAscendente);

    buttonGroup1.add(chkDescendente);
    chkDescendente.setText("Campo B");
    jPanel1.add(chkDescendente);

    jTabbedPane1.addTab("Seleccionar fechas", jPanel1);

    jLabel1.setText("Dato");
    jPanel2.add(jLabel1);

    jTextField1.setMaximumSize(new java.awt.Dimension(100, 20));
    jTextField1.setMinimumSize(new java.awt.Dimension(100, 20));
    jTextField1.setPreferredSize(new java.awt.Dimension(100, 20));
    jTextField1.setRequestFocusEnabled(false);
    jPanel2.add(jTextField1);

    jTabbedPane1.addTab("Buscar ", jPanel2);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 225, Short.MAX_VALUE)
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("Mas opciones", jPanel3);

    pnlFilter.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 6, 230, 60));

    pnCold.add(pnlFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 415, 850, 80));

    scrollPaneMainTable.setBackground(new java.awt.Color(255, 255, 255));
    scrollPaneMainTable.setName("scrollPaneMainTable"); // NOI18N

    tblMain.setAutoCreateRowSorter(true);
    tblMain.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
    tblMain.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {},
            {},
            {},
            {}
        },
        new String [] {

        }
    ));
    tblMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    tblMain.setName("tblMain"); // NOI18N
    tblMain.getTableHeader().setReorderingAllowed(false);
    scrollPaneMainTable.setViewportView(tblMain);

    pnCold.add(scrollPaneMainTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 840, 391));

    lblSubTitulo1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    lblSubTitulo1.setText("Consultas y reportes");
    lblSubTitulo1.setName("lblSubTitulo1"); // NOI18N
    pnCold.add(lblSubTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, -1));

    pnlMain.add(pnCold, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 0, 850, 500));

    getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icnMenuPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuPrestamosMouseClicked
        mouseEvent(evt);
     }//GEN-LAST:event_icnMenuPrestamosMouseClicked

    private void icnMenuVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuVehiculosMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnMenuVehiculosMouseClicked

    private void icnMenuDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuDepartamentosMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnMenuDepartamentosMouseClicked

    private void icnMenuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuUsuariosMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnMenuUsuariosMouseClicked

    private void icnMenuMantenimientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuMantenimientosMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnMenuMantenimientosMouseClicked

    private void icnMenuPrestamosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuPrestamosMouseExited
        mouseExitedLabel(evt);
     }//GEN-LAST:event_icnMenuPrestamosMouseExited

    private void icnMenuVehiculosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuVehiculosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnMenuVehiculosMouseEntered

    private void icnMenuVehiculosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuVehiculosMouseExited
        mouseExitedLabel(evt);
     }//GEN-LAST:event_icnMenuVehiculosMouseExited

    private void icnMenuDepartamentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuDepartamentosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnMenuDepartamentosMouseEntered

    private void icnMenuDepartamentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuDepartamentosMouseExited
        mouseExitedLabel(evt);
     }//GEN-LAST:event_icnMenuDepartamentosMouseExited

    private void icnMenuUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuUsuariosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnMenuUsuariosMouseEntered

    private void icnMenuUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuUsuariosMouseExited
        mouseExitedLabel(evt);
     }//GEN-LAST:event_icnMenuUsuariosMouseExited

    private void icnMenuMantenimientosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuMantenimientosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnMenuMantenimientosMouseEntered

    private void icnMenuMantenimientosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuMantenimientosMouseExited
        mouseExitedLabel(evt);
     }//GEN-LAST:event_icnMenuMantenimientosMouseExited

    private void icnSavePrestamoTerminadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSavePrestamoTerminadoMouseExited
        mouseExitedLabel(evt);
     }//GEN-LAST:event_icnSavePrestamoTerminadoMouseExited

    private void icnSavePrestamoTerminadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSavePrestamoTerminadoMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnSavePrestamoTerminadoMouseEntered

    private void bckPrestamos1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckPrestamos1MouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_bckPrestamos1MouseExited

    private void bckPrestamos1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckPrestamos1MouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_bckPrestamos1MouseEntered

    private void bckPrestamos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckPrestamos1MouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_bckPrestamos1MouseClicked

    private void txtHoraSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraSalidaActionPerformed

    }//GEN-LAST:event_txtHoraSalidaActionPerformed

    private void txtNombreResguardanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreResguardanteActionPerformed

    }//GEN-LAST:event_txtNombreResguardanteActionPerformed

    private void cmbTipoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoPrestamoActionPerformed
        if (cmbTipoPrestamo.getSelectedItem().equals("Foraneo")) {
            txtFechaSalida.setEditable(true);
        } else {
            txtFechaSalida.setEditable(false);
        }
    }//GEN-LAST:event_cmbTipoPrestamoActionPerformed

    private void icnSavePrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSavePrestamoMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnSavePrestamoMouseExited

    private void icnSavePrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSavePrestamoMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnSavePrestamoMouseEntered

    private void bckPrestamosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckPrestamosMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_bckPrestamosMouseExited

    private void bckPrestamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckPrestamosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_bckPrestamosMouseEntered

    private void bckPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckPrestamosMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_bckPrestamosMouseClicked

    private void icnTerminarPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnTerminarPrestamoMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnTerminarPrestamoMouseExited

    private void icnTerminarPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnTerminarPrestamoMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnTerminarPrestamoMouseEntered

    private void icnTerminarPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnTerminarPrestamoMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnTerminarPrestamoMouseClicked

    private void icnNewConsultPrestamosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewConsultPrestamosMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnNewConsultPrestamosMouseExited

    private void icnNewConsultPrestamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewConsultPrestamosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnNewConsultPrestamosMouseEntered

    private void icnNewConsultPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewConsultPrestamosMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnNewConsultPrestamosMouseClicked

    private void icnNewPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewPrestamoMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnNewPrestamoMouseExited

    private void icnNewPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewPrestamoMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnNewPrestamoMouseEntered

    private void icnNewPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewPrestamoMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnNewPrestamoMouseClicked

    private void lblSubTitulo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSubTitulo2MouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_lblSubTitulo2MouseClicked

    private void lblSubTitulo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSubTitulo2MouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_lblSubTitulo2MouseEntered

    private void lblSubTitulo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSubTitulo2MouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_lblSubTitulo2MouseExited

    private void icnNewDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewDepartamentoMouseClicked
        mouseEvent(evt);
     }//GEN-LAST:event_icnNewDepartamentoMouseClicked

    private void icnNewDepartamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewDepartamentoMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnNewDepartamentoMouseEntered

    private void icnNewDepartamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewDepartamentoMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnNewDepartamentoMouseExited

    private void icnNewConsultDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewConsultDepartamentosMouseClicked
        mouseEvent(evt);
     }//GEN-LAST:event_icnNewConsultDepartamentosMouseClicked

    private void icnNewConsultDepartamentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewConsultDepartamentosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnNewConsultDepartamentosMouseEntered

    private void icnNewConsultDepartamentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewConsultDepartamentosMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnNewConsultDepartamentosMouseExited

    private void icnOpcionNoDisponible1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnOpcionNoDisponible1MouseClicked
        mouseEvent(evt);
     }//GEN-LAST:event_icnOpcionNoDisponible1MouseClicked

    private void icnOpcionNoDisponible1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnOpcionNoDisponible1MouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnOpcionNoDisponible1MouseEntered

    private void icnOpcionNoDisponible1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnOpcionNoDisponible1MouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnOpcionNoDisponible1MouseExited

    private void icnNewVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewVehiculoMouseClicked
        mouseEvent(evt);
     }//GEN-LAST:event_icnNewVehiculoMouseClicked

    private void icnNewVehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewVehiculoMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnNewVehiculoMouseEntered

    private void icnNewVehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewVehiculoMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnNewVehiculoMouseExited

    private void icnNewConsultVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewConsultVehiculosMouseClicked
        mouseEvent(evt);
     }//GEN-LAST:event_icnNewConsultVehiculosMouseClicked

    private void icnNewConsultVehiculosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewConsultVehiculosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnNewConsultVehiculosMouseEntered

    private void icnNewConsultVehiculosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewConsultVehiculosMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnNewConsultVehiculosMouseExited

    private void icnOpcionNoDisponible2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnOpcionNoDisponible2MouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnOpcionNoDisponible2MouseClicked

    private void icnOpcionNoDisponible2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnOpcionNoDisponible2MouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnOpcionNoDisponible2MouseEntered

    private void icnOpcionNoDisponible2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnOpcionNoDisponible2MouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnOpcionNoDisponible2MouseExited

    private void icnNewUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewUsuarioMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnNewUsuarioMouseClicked

    private void icnNewUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewUsuarioMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnNewUsuarioMouseEntered

    private void icnNewUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewUsuarioMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnNewUsuarioMouseExited

    private void icnNewConsultUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewConsultUsuariosMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnNewConsultUsuariosMouseClicked

    private void icnNewConsultUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewConsultUsuariosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnNewConsultUsuariosMouseEntered

    private void icnNewConsultUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewConsultUsuariosMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnNewConsultUsuariosMouseExited

    private void icnOpcionNoDisponible3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnOpcionNoDisponible3MouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnOpcionNoDisponible3MouseClicked

    private void icnOpcionNoDisponible3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnOpcionNoDisponible3MouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnOpcionNoDisponible3MouseEntered

    private void icnOpcionNoDisponible3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnOpcionNoDisponible3MouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnOpcionNoDisponible3MouseExited

    private void icnNewMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewMantenimientoMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnNewMantenimientoMouseClicked

    private void icnNewMantenimientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewMantenimientoMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnNewMantenimientoMouseEntered

    private void icnNewMantenimientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnNewMantenimientoMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnNewMantenimientoMouseExited

    private void icnConsultMantenimientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnConsultMantenimientosMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnConsultMantenimientosMouseClicked

    private void icnConsultMantenimientosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnConsultMantenimientosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnConsultMantenimientosMouseEntered

    private void icnConsultMantenimientosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnConsultMantenimientosMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnConsultMantenimientosMouseExited

    private void icnOpcionNoDisponible4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnOpcionNoDisponible4MouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnOpcionNoDisponible4MouseClicked

    private void icnOpcionNoDisponible4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnOpcionNoDisponible4MouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnOpcionNoDisponible4MouseEntered

    private void icnOpcionNoDisponible4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnOpcionNoDisponible4MouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnOpcionNoDisponible4MouseExited

    private void chkEspejosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEspejosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEspejosActionPerformed

    private void bckVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckVehiculosMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_bckVehiculosMouseClicked

    private void bckVehiculosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckVehiculosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_bckVehiculosMouseEntered

    private void bckVehiculosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckVehiculosMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_bckVehiculosMouseExited

    private void icnSaveVehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSaveVehiculoMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnSaveVehiculoMouseEntered

    private void icnSaveVehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSaveVehiculoMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnSaveVehiculoMouseExited

    private void bckDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckDepartamentosMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_bckDepartamentosMouseClicked

    private void bckDepartamentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckDepartamentosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_bckDepartamentosMouseEntered

    private void bckDepartamentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckDepartamentosMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_bckDepartamentosMouseExited

    private void icnSaveDepartamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSaveDepartamentoMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnSaveDepartamentoMouseEntered

    private void icnSaveDepartamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSaveDepartamentoMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnSaveDepartamentoMouseExited

    private void bckUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckUsuariosMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_bckUsuariosMouseClicked

    private void bckUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckUsuariosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_bckUsuariosMouseEntered

    private void bckUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckUsuariosMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_bckUsuariosMouseExited

    private void icnSaveUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSaveUsuarioMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnSaveUsuarioMouseEntered

    private void icnSaveUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSaveUsuarioMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_icnSaveUsuarioMouseExited

    private void icnMenuPrestamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnMenuPrestamosMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_icnMenuPrestamosMouseEntered

    private void icnSaveDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSaveDepartamentoMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnSaveDepartamentoMouseClicked

    private void icnSaveVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSaveVehiculoMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnSaveVehiculoMouseClicked

    private void icnSaveUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSaveUsuarioMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnSaveUsuarioMouseClicked

    private void icnSavePrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSavePrestamoMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnSavePrestamoMouseClicked

    private void sldAproximadoGasolinaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldAproximadoGasolinaStateChanged

    }//GEN-LAST:event_sldAproximadoGasolinaStateChanged

    private void icnSavePrestamoTerminadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnSavePrestamoTerminadoMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_icnSavePrestamoTerminadoMouseClicked

    private void bckPrestamos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckPrestamos2MouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_bckPrestamos2MouseClicked

    private void bckPrestamos2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckPrestamos2MouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_bckPrestamos2MouseEntered

    private void bckPrestamos2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckPrestamos2MouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_bckPrestamos2MouseExited

    private void elmVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elmVehiculoMouseClicked
        mouseEvent(evt);
    }//GEN-LAST:event_elmVehiculoMouseClicked

    private void elmVehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elmVehiculoMouseEntered
        mouseEnteredLabel(evt);
    }//GEN-LAST:event_elmVehiculoMouseEntered

    private void elmVehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elmVehiculoMouseExited
        mouseExitedLabel(evt);
    }//GEN-LAST:event_elmVehiculoMouseExited

    public void mouseEvent(java.awt.event.MouseEvent evt) {
        windowEventControl.manageMouseEvent(evt);
    }

    public void mouseEnteredLabel(java.awt.event.MouseEvent evt) {
        ((Component) evt.getSource()).setBackground(new Color(204, 234, 255));
    }

    public void mouseExitedLabel(java.awt.event.MouseEvent evt) {
        ((Component) evt.getSource()).setBackground(new Color(255, 255, 255));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel bckDepartamentos;
    public javax.swing.JLabel bckPrestamos;
    public javax.swing.JLabel bckPrestamos1;
    public javax.swing.JLabel bckPrestamos2;
    public javax.swing.JLabel bckUsuarios;
    public javax.swing.JLabel bckVehiculos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroupAireAC;
    private javax.swing.ButtonGroup buttonGroupCarroceria;
    private javax.swing.ButtonGroup buttonGroupCopasRines;
    private javax.swing.ButtonGroup buttonGroupEspejos;
    private javax.swing.ButtonGroup buttonGroupGatoCruzeta;
    private javax.swing.ButtonGroup buttonGroupLuces;
    private javax.swing.ButtonGroup buttonGroupRadio;
    private javax.swing.ButtonGroup buttonGroupRefaccion;
    private javax.swing.ButtonGroup buttonGroupTablero;
    private javax.swing.ButtonGroup buttonGroupTapiceria;
    private javax.swing.ButtonGroup buttonGroupVidrios;
    private javax.swing.JCheckBox chkAireAC;
    private javax.swing.JCheckBox chkAireAC1;
    public javax.swing.JCheckBox chkAscendente;
    private javax.swing.JCheckBox chkCarroceria;
    private javax.swing.JCheckBox chkCarroceria1;
    private javax.swing.JCheckBox chkCopasRines;
    private javax.swing.JCheckBox chkCopasRines1;
    public javax.swing.JCheckBox chkDescendente;
    private javax.swing.JCheckBox chkEspejos;
    private javax.swing.JCheckBox chkEspejos1;
    private javax.swing.JCheckBox chkGatoCruzeta;
    private javax.swing.JCheckBox chkGatoCruzeta1;
    private javax.swing.JCheckBox chkLuces;
    private javax.swing.JCheckBox chkLuces1;
    private javax.swing.JCheckBox chkRadio;
    private javax.swing.JCheckBox chkRadio1;
    private javax.swing.JCheckBox chkRefaccion;
    private javax.swing.JCheckBox chkRefaccion1;
    private javax.swing.JCheckBox chkTablero;
    private javax.swing.JCheckBox chkTablero1;
    private javax.swing.JCheckBox chkTapiceria;
    private javax.swing.JCheckBox chkTapiceria1;
    private javax.swing.JCheckBox chkVidrios;
    private javax.swing.JCheckBox chkVidrios1;
    public javax.swing.JComboBox<String> cmbCampoSort;
    public javax.swing.JComboBox<String> cmbCdvPrestamo;
    public javax.swing.JComboBox<String> cmbDiaActualizarPresupuesto;
    public javax.swing.JComboBox<String> cmbNombreDpto;
    public javax.swing.JComboBox<String> cmbTipoPrestamo;
    public javax.swing.JComboBox<String> cmbTipoVehiculo;
    public javax.swing.JLabel date;
    public javax.swing.JLabel elmVehiculo;
    public javax.swing.JPanel frmDepartamento;
    public javax.swing.JPanel frmMantenimiento;
    public javax.swing.JPanel frmPrestamo;
    public javax.swing.JPanel frmTerminarPrestamo;
    public javax.swing.JPanel frmUsuario;
    public javax.swing.JPanel frmVehiculo;
    private javax.swing.JLabel icnConsultMantenimientos;
    private javax.swing.JLabel icnMenuDepartamentos;
    private javax.swing.JLabel icnMenuMantenimientos;
    private javax.swing.JLabel icnMenuPrestamos;
    private javax.swing.JLabel icnMenuUsuarios;
    private javax.swing.JLabel icnMenuVehiculos;
    private javax.swing.JLabel icnNewConsultDepartamentos;
    private javax.swing.JLabel icnNewConsultPrestamos;
    private javax.swing.JLabel icnNewConsultUsuarios;
    private javax.swing.JLabel icnNewConsultVehiculos;
    private javax.swing.JLabel icnNewDepartamento;
    private javax.swing.JLabel icnNewMantenimiento;
    private javax.swing.JLabel icnNewPrestamo;
    private javax.swing.JLabel icnNewUsuario;
    private javax.swing.JLabel icnNewVehiculo;
    private javax.swing.JLabel icnOpcionNoDisponible1;
    private javax.swing.JLabel icnOpcionNoDisponible2;
    private javax.swing.JLabel icnOpcionNoDisponible3;
    private javax.swing.JLabel icnOpcionNoDisponible4;
    private javax.swing.JLabel icnSaveDepartamento;
    public javax.swing.JLabel icnSavePrestamo;
    private javax.swing.JLabel icnSavePrestamoTerminado;
    public javax.swing.JLabel icnSaveUsuario;
    public javax.swing.JLabel icnSaveVehiculo;
    private javax.swing.JLabel icnTerminarPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblActualizarPresupuestoDia;
    public javax.swing.JLabel lblAproximadoGasolina;
    private javax.swing.JLabel lblCarroceria;
    private javax.swing.JLabel lblCarroceria1;
    private javax.swing.JLabel lblCarroceria10;
    private javax.swing.JLabel lblCarroceria2;
    private javax.swing.JLabel lblCarroceria3;
    private javax.swing.JLabel lblCarroceria4;
    private javax.swing.JLabel lblCarroceria5;
    private javax.swing.JLabel lblCarroceria6;
    private javax.swing.JLabel lblCarroceria7;
    private javax.swing.JLabel lblCarroceria8;
    private javax.swing.JLabel lblCarroceria9;
    public javax.swing.JLabel lblCdv;
    public javax.swing.JLabel lblCdv1;
    public javax.swing.JLabel lblCdv2;
    private javax.swing.JLabel lblCondicionesVehiculo;
    private javax.swing.JLabel lblDeCadaMes;
    public javax.swing.JLabel lblDepartamento;
    public javax.swing.JLabel lblDestinoMotivo;
    public javax.swing.JLabel lblEstado;
    public javax.swing.JLabel lblFechaSalida;
    private javax.swing.JLabel lblGasolinaPresupuestada;
    public javax.swing.JLabel lblHoraSalida;
    private javax.swing.JLabel lblJefeDepartamento;
    public javax.swing.JLabel lblMarca;
    public javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNombreDepartamento;
    private javax.swing.JLabel lblNombreJefeDepartamento;
    public javax.swing.JLabel lblNombreResguardante;
    public javax.swing.JLabel lblPlacas;
    public javax.swing.JLabel lblSistema;
    public javax.swing.JLabel lblSubTitulo;
    public javax.swing.JLabel lblSubTitulo1;
    public javax.swing.JLabel lblSubTitulo2;
    public javax.swing.JLabel lblTipoPrestamo;
    public javax.swing.JLabel lblTipoVehiculo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnCold;
    private javax.swing.JPanel pnlCondicionesBoxes;
    private javax.swing.JPanel pnlFilter;
    private javax.swing.JPanel pnlHome;
    public javax.swing.JPanel pnlHot;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMenuDepartamentos;
    private javax.swing.JPanel pnlMenuMantenimientos;
    private javax.swing.JPanel pnlMenuPrestamos;
    private javax.swing.JPanel pnlMenuUsuarios;
    private javax.swing.JPanel pnlMenuVehiculos;
    private javax.swing.JPanel pnlSideMenu;
    public javax.swing.JPanel pnlSubMenuDepartamentos;
    public javax.swing.JPanel pnlSubMenuMantenimientos;
    public javax.swing.JPanel pnlSubMenuPrestamos;
    public javax.swing.JPanel pnlSubMenuUsuarios;
    public javax.swing.JPanel pnlSubMenuVehiculos;
    private javax.swing.JScrollPane scrollPaneMainTable;
    public javax.swing.JPanel slcDepartamento;
    public javax.swing.JPanel slcMantenimiento;
    public javax.swing.JPanel slcPrestamo;
    public javax.swing.JPanel slcUsuario;
    public javax.swing.JPanel slcVehiculo;
    public javax.swing.JSlider sldAproximadoGasolina;
    public javax.swing.JTable tblMain;
    public javax.swing.JLabel time;
    public javax.swing.JTextArea txaDestinoMotivo;
    public javax.swing.JTextField txtCdv1;
    public javax.swing.JTextField txtCdv2;
    public javax.swing.JTextField txtElemV;
    public javax.swing.JTextField txtFechaSalida;
    public javax.swing.JTextField txtGasolinaPresupuestada;
    public javax.swing.JTextField txtHoraSalida;
    public javax.swing.JTextField txtMarca;
    public javax.swing.JTextField txtModelo;
    public javax.swing.JTextField txtNombreDepartamento;
    public javax.swing.JTextField txtNombreJefeDepartamento;
    public javax.swing.JTextField txtNombreResguardante;
    public javax.swing.JTextField txtNombreUsuario;
    public javax.swing.JTextField txtPlacas;
    public javax.swing.JLabel user;
    public javax.swing.JTextField valesGasolina;
    // End of variables declaration//GEN-END:variables

}
