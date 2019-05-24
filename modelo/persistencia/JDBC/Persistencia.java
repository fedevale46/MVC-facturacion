package modelo.persistencia.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public class Persistencia {

    private static String login = "root";
    private static String password = "root";
    private static String url = "jdbc:mysql://localhost/facturacion?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
    private static Connection conn = null;

    public static Connection createConnection() {

        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection(url, login, password);
            } catch (ClassNotFoundException e) {
                System.out.println(e);
            } catch (SQLException e) {
                System.out.println(e);
            } catch (java.lang.InstantiationException e) {
                System.out.println(e);
            } catch (java.lang.IllegalAccessException e) {
                System.out.println(e);
            }
        }
        return conn;
    }
    
    public static void closeConnection() {
        try {
            if(conn!=null){
                conn.close();
                conn=null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
