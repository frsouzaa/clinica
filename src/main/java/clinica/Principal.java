package clinica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame {
    private JLabel label1;
    private JTextField textField1;
    private JButton acessarButton;
    private JPanel panel1;
    private JPasswordField passwordField1;

    public Principal()  {
        setContentPane(panel1);
        setTitle("Sistema de Clinica");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        acessarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText(textField1.getText());
            }
        });
    }
}