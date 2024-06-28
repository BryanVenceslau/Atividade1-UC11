import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public final class conectaDAO {
    private Connection conn;
    private final String url = "jdbc:mysql://localhost:3306/uc11?useSSL=false";
    private final String user = "root";
    private final String senha = "1234";
    
    public conectaDAO() {
        connectDB();
    }
    
    public Connection connectDB(){
        try { 
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, senha);
            }
            return conn;
        } catch (SQLException | ClassNotFoundException erro){
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO: " + erro.getMessage());
            return null;
        }
    }

    public Connection getConnection() {
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "Conexão é nula.");
        }
        return conn;
    }
}