package OrganizadorRenta;

/**
 *
 * @author nahuelfredes
 */
import java.sql.*;

public class Conexion {

    private static Connection cnx = null;

    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (cnx == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/Chat", "root", "2012nahuel");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
          
        }
        return cnx;
    }

    public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }

    public void setMensajes(Connection conexion, String remitente, String mensaje) throws SQLException {
        PreparedStatement consulta;
        consulta = conexion.prepareStatement("insert into chat (remitente,mensaje) values('" + remitente + "'" + ",'" + mensaje + "')");
        consulta.execute();
    }

    public String getMensajes(Connection conexion) throws SQLException, ClassNotFoundException {
        PreparedStatement consulta;
        consulta = conexion.prepareStatement("select remitente,mensaje from chat");
        ResultSet resultado = consulta.executeQuery();
        String texto = null;
        try {
            while (resultado.next()) {
                if (texto == null) {
                    texto = resultado.getString("remitente") + ":" + resultado.getString("mensaje") + "\n";
                } else {
                    texto += resultado.getString("remitente") + ":" + resultado.getString("mensaje") + "\n";
                }
            }
            return texto;
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

}
