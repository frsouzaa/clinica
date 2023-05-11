package clinica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Conexao {
    private Connection conexao;

    public boolean conectar(){
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/clinica?autoReconnect=true&useSSL=false";
            String user = "root";
            String password = "Password0*";
            this.conexao = DriverManager.getConnection(url, user, password);
        }
        catch(Exception err) {
            System.err.println("ERRO "+ err.getMessage() + err.getCause());
            return false;
        }
        return true;
    }

    public boolean desconectar(){
        try{
            if(!this.conexao.isClosed()){
                this.conexao.close();
            }
        }
        catch(SQLException err) {
            System.err.println(err.getMessage());
            return false;
        }
        return true;
    }

    public Statement criarStatement() {
        try{
            return this.conexao.createStatement();
        }
        catch(SQLException err) {
            System.err.println(err.getMessage());
            return null;
        }
    }

    public Connection getConnection(){
        return this.conexao;
    }

    public PreparedStatement prepareStatement(String sql) {
        try{
            return this.conexao.prepareStatement(sql);
        }
        catch(SQLException err) {
            System.err.println(err.getMessage());
            return null;
        }
    }
}
