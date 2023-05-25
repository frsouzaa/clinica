package clinica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import clinica.DAO.MedicoDAO;
import clinica.tabelas.TabelaMedico;

public class JanelaMedico extends JFrame {
    private JPanel pageMedico;
    private JTextField nome;
    private JTextField crm;
    private JTextField especialidade;
    private JTextField telefone;
    private JPasswordField senha;
    private JButton salvar;
    private JButton voltar;
    private JTable tabela;
    private JButton pesquisar;

    public JanelaMedico()  {
        setContentPane(pageMedico);
        setTitle("Médico");
        setSize(380,600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Medico obj = new Medico(crm.getText(), telefone.getText(), especialidade.getText());
                    obj.setNome(nome.getText());
                    obj.setSenha(senha.getText());
                    MedicoDAO medicoDAO = new MedicoDAO();
                    medicoDAO.create(obj);
                } catch(Exception err){
                    System.out.println("Erro");
                }
            }
        });

        voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        pesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarLista();
            }
        });

        initComponents();
    }

    private void initComponents() {
        tabela.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
//                        {null, null, null, null},
                },
                new String [] {
                        "Nome", "CRM", "Telefone", "Especialidade", "Senha"
                }
        ));
        pack();
    }

    private void carregarLista() {
        List<Medico> listaMedicos = MedicoDAO.getListaMedicos();
        TabelaMedico tabelaMedico = new TabelaMedico(listaMedicos);
        tabela.setModel(tabelaMedico);
    }
}