package clinica.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import clinica.Conexao;
import clinica.Recepcionista;
import java.util.ArrayList;
import java.util.List;

public class RecepcionistaDAO {

    private static Conexao conexao = new Conexao();

    public int create(Recepcionista recepcionista) {
        conexao.conectar();
        String Sql = "insert into recepcionista(nome, cpf, telefone, senha) values(?,?,?,?)";
        try{
            PreparedStatement stmt = conexao.prepareStatement(Sql);
            stmt.setString(1, recepcionista.getNome());
            stmt.setString(2, recepcionista.getCpf());
            stmt.setString(3, recepcionista.getTelefone());
            stmt.setString(4, recepcionista.getSenha());
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

    public static List<Recepcionista> getListaRecepcionistas() {
        List<Recepcionista> listaRecepcionistas = new ArrayList<>();
        conexao.conectar();
        String Sql = "SELECT * FROM recepcionista";
        try {
            PreparedStatement stmt = conexao.prepareStatement(Sql);
            ResultSet retorno = stmt.executeQuery();
            while (retorno.next()) {
                String nome = retorno.getString("nome");
                String telefone = retorno.getString("telefone");
                String senha = retorno.getString("senha");
                String cpf = retorno.getString("cpf");

                Recepcionista recepcionista = new Recepcionista(telefone, cpf);
                recepcionista.setNome(nome);
                recepcionista.setSenha(senha);
                listaRecepcionistas.add(recepcionista);
            }
            return listaRecepcionistas;
        } catch (SQLException err) {
            System.err.println(err.getMessage());
            return null;
        }
    }

    public Recepcionista read(String cpf) {
        conexao.conectar();
        String Sql = "select * from recepcionista where cpf=?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(Sql);
            stmt.setString(1, cpf);
            ResultSet retorno = stmt.executeQuery();
            if(!retorno.isClosed()){
                retorno.next();
                Recepcionista recepcionista = new Recepcionista();
                recepcionista.setNome(retorno.getString("nome"));
                recepcionista.setCpf(retorno.getString("cpf"));
                recepcionista.setSenha(retorno.getString("senha"));
                recepcionista.setTelefone(retorno.getString("telefone"));
                return recepcionista;
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

    public int update(Recepcionista recepcionista, String cpf){
        conexao.conectar();
        String Sql = "update recepcionista set nome=?, cpf=?, telefone=?, senha=? where cpf=?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(Sql);
            stmt.setString(1, recepcionista.getNome());
            stmt.setString(2, recepcionista.getCpf());
            stmt.setString(3, recepcionista.getTelefone());
            stmt.setString(4, recepcionista.getSenha());
            stmt.setString(5, cpf);
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

    public int delete(String cpf) {
        conexao.conectar();
        String sql = "DELETE FROM recepcionista WHERE cpf=?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cpf);
            return stmt.executeUpdate();
        } catch (SQLException err) {
            System.err.println(err.getMessage());
            return 0;
        } finally {
            conexao.desconectar();
        }
    }

}
