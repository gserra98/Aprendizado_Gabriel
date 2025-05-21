import java.sql.*;

public class UsuarioDAO {
    public void buscarUsuario(String nomeUsuario) throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/app", "root", "123456");
        Statement stmt = conexao.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios WHERE nome = '" + nomeUsuario + "'");
        
        while (rs.next()) {
            System.out.println("Usuário encontrado: " + rs.getString("nome"));
        }

        rs.close();
        stmt.close();
        conexao.close();
    }
}