package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorConexao {
    private static Connection conexao;

    public static Connection pegarConexao()
        throws ClassNotFoundException, SQLException{

            String url = "jdbc:mysql://localhost/dblocadora?characterEncoding=latin1";
            String usuario = "root";
            String senha = "Haduken12#"; 

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, usuario, senha);
            return conexao;
        }
}
