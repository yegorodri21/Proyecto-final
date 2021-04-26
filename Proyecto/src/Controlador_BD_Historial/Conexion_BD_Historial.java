package Controlador_BD_Historial;

/**
 *
 * @author Usuario
 */

import Conexion_BD.Conexion_BD;
import modelo.historial;
import java.sql.Connection;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

public class Conexion_BD_Historial {
    Conexion_BD conexion = new Conexion_BD();
    
    private Connection con;
    
     public boolean ingresarPersona(historial hist) {
        boolean registrar = false;
        //Interfaz de acceso a la base de datos
        java.sql.Statement stm = null;
        //Conexion con la base de datos.
        con = null;
        String sql;
        sql = "INSERT INTO `web`.`historial` (`direccion`, `Fecha_hora`) VALUES ('"+hist.getDireccion() + "', now())";
        try {
            //Es una instancia de la conexion previamente creada.
            con = conexion.Conexion_Mysql();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return registrar;
    }
     
     public DefaultTableModel mostrarHistorial() {
         String columnas[] = {"Enlace", "Fecha"};
        DefaultTableModel modeloTabla = new DefaultTableModel(null, columnas);
        Connection con = null;
        String lista[] = new String[2];
        String sql = "SELECT direccion,Fecha_hora FROM historial ";
        java.sql.Statement stm;
        try {
           con = conexion.Conexion_Mysql();
            stm = con.createStatement();
            stm.execute(sql);
            ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                lista[0] = res.getString(1);
                lista[1] = res.getString(2);
//                lista[2] = res.getString(3);

                modeloTabla.addRow(lista);
            }

             stm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        return modeloTabla;
    }
     
     public boolean eliminarHistorial(String histo){
            
            boolean eliminar= false;
                    java.sql.Statement stm=null;
                    Connection con=null;
             String sql = "DELETE FROM `web`.`historial` WHERE ("
                     + "`Fecha_hora` = '"+String.valueOf(histo)+"');";
             try {
            
            con= conexion.Conexion_Mysql();
            stm= con.createStatement();
            stm.execute(sql);
            eliminar = true;
            stm.close();
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        } 
          return eliminar;
   }
      public boolean eliminartodo(){
            
            boolean eliminar= false;
                    java.sql.Statement stm=null;
                    Connection con=null;
             String sql = "TRUNCATE TABLE historial;";
             try {
            
            con= conexion.Conexion_Mysql();
            stm= con.createStatement();
            stm.execute(sql);
            eliminar = true;
            stm.close();
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        } 
          return eliminar;
   }
}

