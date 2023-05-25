package clinica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import clinica.DAO.RecepcionistaDAO;
import clinica.tabelas.TabelaRecepcionista;

public class JanelaRecepcionista extends JFrame {
    private JPanel pageRecepcionista;
    private JTextField cpf;
    private JTextField telefone;
    private JTextField nome;
    private JPasswordField senha;
    private JButton salvar;
    private JButton voltar;
    private JTable tabela;
    private JButton pesquisar;

    public JanelaRecepcionista()  {
        setContentPane(pageRecepcionista);
        setTitle("Recepcionista");
        setSize(380,480);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Recepcionista obj = new Recepcionista(telefone.getText(), cpf.getText());
                    obj.setNome(nome.getText());
                    obj.setSenha(senha.getText());
                    RecepcionistaDAO recepcionistaDAO = new RecepcionistaDAO();
                    recepcionistaDAO.create(obj);
                } catch (Exception err) {
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
                        "Nome", "Telefone", "Senha", "CPF"
                }
        ));
        pack();
    }

    private void carregarLista() {
        List<Recepcionista> listaRecepcionistas = RecepcionistaDAO.getListaRecepcionistas();
        TabelaRecepcionista tabelaRecepcionista = new TabelaRecepcionista(listaRecepcionistas);
        tabela.setModel(tabelaRecepcionista);
    }
}
