
package Conexion_BD;

/**
 *
 * @author Usuario
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion_BD {
    
      private static final String nombre = "web";
    private static final String user = "root";
    private static final String pass = "pajarito21";
    private static final String lineaBase = "jdbc:mysql://localhost:3306/" + nombre + "? useUnicode=true&use"
            + " JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private Connection con = null;

    public Connection Conexion_Mysql() {

        try {
            con = DriverManager.getConnection(lineaBase, user, pass);
            if (con != null) {
                System.out.println("Conexión exitosa");
            }
        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return con;
    }
}
