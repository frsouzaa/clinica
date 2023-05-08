package clinica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaPaciente extends JFrame {
    private JPanel pagePaciente;
    private JPasswordField passwordField1;
    private JTextField telefone;
    private JTextField nome;
    private JTextField cpf;
    private JTextField idade;
    private JButton salvar;
    private JButton voltar;

    public JanelaPaciente()  {
        setContentPane(pagePaciente);
        setTitle("Paciente");
        setSize(380,460);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);

        salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paciente paciente = new Paciente(nome.getText(), cpf.getText(), telefone.getText(), 'M', Integer.parseInt(idade.getText()));
                System.out.println("Sucesso");
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