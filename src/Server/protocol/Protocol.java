package Server.protocol;

import entity.Departamento;
import entity.Prestamo;
import entity.Resquest;
import entity.Vehiculo;
//import java.util.LinkedList;

public class Protocol {

//    private final LinkedList<String> statements;
    private final SQLAdmin sql;

    public Protocol() {
//        statements = null;
//        fillResquestList();
        sql = new SQLAdmin();
    }

    public Object adminSQL(Object input) {
        Resquest resquest = (Resquest) input;
        int j = statementIndex(resquest.getResquest());
        switch (j) {
            case 0:
                Prestamo p = (Prestamo) resquest.getData();
                sql.savePrestamo(p, p.getVehiculo(), p.getDepartamento(), p.getValesGasolina());
                return "";
            case 1:
                StringBuilder buildP = (StringBuilder) resquest.getData();
                sql.savePrestamoTerminado(
                        Integer.parseInt(buildP.substring(0, buildP.indexOf("-"))),
                        buildP.substring(buildP.indexOf("-")+1, buildP.lastIndexOf("-")),
                        buildP.substring(buildP.lastIndexOf("-")+1,buildP.length()));
                return "";
            case 2:
                Vehiculo v = (Vehiculo) resquest.getData();
                sql.saveVehiculo(v);
                return "";
            case 3:
                Departamento d = (Departamento) resquest.getData();
                sql.saveDepartamento(d);
            case 4:
                return sql.tablePrestamos();
            case 5:
                return sql.tableVehiculos();
            case 6:
                return sql.tableDepartamentos();
            case 7:
                return sql.getCmbModelVehiculos();
            case 8:
                return sql.getCmbModelDptos();
            case 9:
                return sql.elmVehiculo(Integer.parseInt(resquest.getData().toString()));
        }
        return null;
    }

    private int statementIndex(String resquest) {
        if (resquest.equals("svcPrestamo")) {
            return 0;
        }
        if (resquest.equals("svcPrestamoTerminado")) {
            return 1;
        }
        if (resquest.equals("svcVehiculo")) {
            return 2;
        }
        if (resquest.equals("svcDepartamento")) {
            return 3;
        }
        if (resquest.equals("cnsPrestamo")) {
            return 4;
        }
        if (resquest.equals("cnsVehiculo")) {
            return 5;
        }
        if (resquest.equals("cnsDepartamento")) {
            return 6;
        }
        if (resquest.equals("cmbCdvPrestamo")) {
            return 7;
        }
        if (resquest.equals("cmbNomDeptos")) {
            return 8;
        }
        if (resquest.equals("elmVehiculo")) {
            return 9;
        }
        return -1;
    }
}
