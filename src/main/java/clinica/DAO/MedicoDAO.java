package clinica.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import clinica.Conexao;
import clinica.Medico;

public class MedicoDAO {

    private static Conexao conexao = new Conexao();

    public int create(Medico medico) {
        conexao.conectar();
        String Sql = "insert into medico(nome, crm, telefone, especialidade, senha) values(?,?,?,?,?)";
        try{
            PreparedStatement stmt = conexao.prepareStatement(Sql);
            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getCrm());
            stmt.setString(4, medico.getEspecialidade());
            stmt.setString(5, medico.getSenha());
            stmt.setString(3, medico.getTelefone());
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

    public static List<Medico> getListaMedicos() {
        List<Medico> listaMedicos = new ArrayList<>();
        conexao.conectar();
        String Sql = "SELECT * FROM medico";
        try {
            PreparedStatement stmt = conexao.prepareStatement(Sql);
            ResultSet retorno = stmt.executeQuery();
            while (retorno.next()) {
                String nome = retorno.getString("nome");
                String crm = retorno.getString("crm");
                String telefone = retorno.getString("telefone");
                String senha = retorno.getString("senha");
                String especialidade = retorno.getString("especialidade");

                Medico medico = new Medico(crm, telefone, especialidade);
                medico.setNome(nome);
                medico.setSenha(senha);
                listaMedicos.add(medico);
            }
            return listaMedicos;
        } catch (SQLException err) {
            System.err.println(err.getMessage());
            return null;
        }
    }

    public Medico read(String crm) {
        conexao.conectar();
        String Sql = "select * from medico where crm=?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(Sql);
            stmt.setString(1, crm);
            ResultSet retorno = stmt.executeQuery();
            if(!retorno.isClosed()){
                retorno.next();
                Medico m1 = new Medico();
                m1.setNome(retorno.getString("nome"));
                m1.setCrm(retorno.getString("crm"));
                m1.setEspecialidade(retorno.getString("especialidade"));
                m1.setSenha(retorno.getString("senha"));
                m1.setTelefone(retorno.getString("telefone"));
                return m1;
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

    public int update(Medico medico, String crm){
        conexao.conectar();
        String Sql = "update medico set nome=?, crm=?, telefone=?, especialidade=?, senha=? where crm=?";
        try{
            PreparedStatement stmt = conexao.prepareStatement(Sql);
            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getCrm());
            stmt.setString(3, medico.getTelefone());
            stmt.setString(4, medico.getEspecialidade());
            stmt.setString(5, medico.getSenha());
            stmt.setString(6, crm);
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

    public int delete(String crm) {
        conexao.conectar();
        String sql = "DELETE FROM medico WHERE crm=?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, crm);
            return stmt.executeUpdate();
        } catch (SQLException err) {
            System.err.println(err.getMessage());
            return 0;
        } finally {
            conexao.desconectar();
        }
    }

}
