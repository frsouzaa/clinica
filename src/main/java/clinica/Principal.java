package clinica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame {
    private JPanel panel1;
    private JButton exame;
    private JButton medico;
    private JButton paciente;
    private JButton recepcionista;
    private JButton receita;
    private JButton sair;

    public Principal()  {
        setContentPane(panel1);
        setTitle("Sistema de Clinica");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        medico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaMedico janelaMedico = new JanelaMedico();
            }
        });

        paciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaPaciente janelaPaciente = new JanelaPaciente();
            }
        });

        exame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaExame janelaExame = new JanelaExame();
            }
        });

        recepcionista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaRecepcionista janelaRecepcionista = new JanelaRecepcionista();
            }
        });

        receita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaReceita janelaReceita = new JanelaReceita();
            }
        });

        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}