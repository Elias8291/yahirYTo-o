package control;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Conexion;

public class UsuarioDAO {
    private Conexion conexion;

    public UsuarioDAO() {
        this.conexion = new Conexion();
    }

    public boolean verificarUsuario(String nombreUsuario, String contraseña) {
        String sql = "SELECT * FROM usuario WHERE nombre_usuario = ? AND contraseña = ?";
        try {
            conexion.conectar();
            PreparedStatement statement = conexion.getConnection().prepareStatement(sql);
            statement.setString(1, nombreUsuario);
            statement.setString(2, contraseña);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return false;
    }
}