package clinica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import clinica.DAO.ExameDAO;

public class JanelaExame extends JFrame {
    private JPanel pageExame;
    private JTextField data;
    private JButton salvar;
    private JTextField descritivo;
    private JButton voltar;

    public JanelaExame()  {
        setContentPane(pageExame);
        setTitle("Exame");
        setSize(380,330);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Exame obj = new Exame();
                    obj.setDescritivo(descritivo.getText());
                    obj.setData(LocalDate.now());
                    ExameDAO exameDAO = new ExameDAO();
                    exameDAO.create(obj);
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
    }
}