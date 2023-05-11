package clinica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class JanelaMedico extends JFrame {
    private JPanel pageMedico;
    private JTextField nome;
    private JTextField crm;
    private JTextField especialidade;
    private JTextField telefone;
    private JPasswordField senha;
    private JButton salvar;
    private JButton voltar;

    public JanelaMedico()  {
        setContentPane(pageMedico);
        setTitle("Médico");
        setSize(380,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Medico obj = new Medico(crm.getText(), telefone.getText(), especialidade.getText());
                    obj.setNome(nome.getText());
                    obj.setSenha(senha.getText());
                    System.out.println("Sucesso");
                } catch(Exception err){
                    System.out.println("Erro");
                }
            }
        });

        voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Principal principal = new Principal();
            }
        });
    }
}