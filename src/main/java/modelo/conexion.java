package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion {
    private static String usuario="postgres", contra="0512",url="jdbc:postgresql://localhost:5432/consecionaria";
private Connection con;
        public Connection getCon() throws SQLException {
            try {
                con=DriverManager.getConnection(url, usuario, contra);
            } catch (Exception e) {
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, e);
            }
            return con;
        }
    }

