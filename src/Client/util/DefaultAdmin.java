/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.util;


/**
 *
 * @author pablo.alejos
 */
public interface DefaultAdmin {
   public void insert();
   public void drop();
   public void update();
   public void select();

    /**
     *
     * @return javax.swing.table.DefaultTableModel
     */
    public javax.swing.table.DefaultTableModel generateTableModel();
    /**
     *
     * @return
     */
    public java.sql.ResultSet getResultSet();
    
}
