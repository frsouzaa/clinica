package clinica.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import clinica.Conexao;
import clinica.Exame;

public class ExameDAO {

    private Conexao conexao = new Conexao();

    public int create(Exame receita) {
        conexao.conectar();
        String Sql = "insert into exame(consulta, data, descritivo) values(?,?,?)";
        try{
            PreparedStatement stmt = conexao.prepareStatement(Sql);
            stmt.setString(1, "X");
            stmt.setString(2, String.valueOf(receita.getData()));
            stmt.setString(3, receita.getDescritivo());
            return stmt.executeUpdate();
        }
        catch(SQLException err){
            System.err.println(err.getMessage());
            return 0;
        }
        finally{
            conexao.desconectar();
        }
    }

    public Exame read(String descritivo) {
        conexao.conectar();
        String Sql = "select * from exame where descritivo=?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(Sql);
            stmt.setString(1, descritivo);
            ResultSet retorno = stmt.executeQuery();
            if(!retorno.isClosed()){
                retorno.next();
                Exame exame = new Exame();
                exame.setData(LocalDate.parse(retorno.getString("data")));
                exame.setDescritivo(retorno.getString("descritivo"));
                return exame;
            } else {
                return null;
            }
        }
        catch(SQLException err){
            System.err.println(err.getMessage());
            return null;
        }
        finally{
            conexao.desconectar();
        }
    }

    public int update(Exame exame, String descritivo){
        conexao.conectar();
        String Sql = "update receita set consulta=?, data=?, descritivo=? where descritivo=?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(Sql);
            stmt.setString(1, "X");
            stmt.setString(2, String.valueOf(exame.getData()));
            stmt.setString(3, exame.getDescritivo());
            stmt.setString(4, descritivo);
            return stmt.executeUpdate();
        }
        catch(SQLException err){
            System.err.println(err.getMessage());
            return 0;
        }
        finally{
            conexao.desconectar();
        }
    }

    public int delete(String descritivo) {
        conexao.conectar();
        String sql = "DELETE FROM exame WHERE descritivo=?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, descritivo);
            return stmt.executeUpdate();
        } catch (SQLException err) {
            System.err.println(err.getMessage());
            return 0;
        } finally {
            conexao.desconectar();
        }
    }

}
