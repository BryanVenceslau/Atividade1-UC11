package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectaDAO {
    
    
    public Connection connectDB(){
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?user=root&password=");      
        } catch (SQLException | ClassNotFoundException erro){
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + erro.getMessage());
        }
        return conn;
    }   
    
    public void desconectar() throws SQLException{
        conn.close();
    }
}