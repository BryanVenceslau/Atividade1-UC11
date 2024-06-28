package dao;

import data.ProdutosDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutosDAO {
    Connection conn;
    PreparedStatement st;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public int cadastrarProduto (ProdutosDTO produto){   
        int linhaAfetada;
        try {
            st = conn.prepareStatement("INSERT INTO filmes(nome, datalancamento, categoria) VALUES(?,?,?)");
            st.setString(1, filme.getNome());
            st.setDate(2, filme.getDataLancamento());
            st.setString(3, filme.getCategoria());
            linhaAfetada = st.executeUpdate();
            
            return linhaAfetada;
        } catch (SQLException e) {
            System.out.println("Não foi possível cadastrar o filme. Verifique os valores! " + e.getMessage());
            
            return e.getErrorCode();
        }
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){ 
        return listagem;
    }      
}