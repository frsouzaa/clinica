package clinica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaRecepcionista extends JFrame {
    private JPanel pageRecepcionista;
    private JTextField cpf;
    private JTextField telefone;
    private JTextField nome;
    private JPasswordField senha;
    private JButton salvar;
    private JButton voltar;


    public JanelaRecepcionista()  {
        setContentPane(pageRecepcionista);
        setTitle("Recepcionista");
        setSize(380,460);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Recepcionista obj = new Recepcionista(telefone.getText(), cpf.getText());
                obj.setNome(nome.getText());
                obj.setSenha(senha.getText());
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
