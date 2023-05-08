package clinica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

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
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Exame obj = new Exame();
                    obj.setDescritivo(descritivo.getText());
                    obj.setData(LocalDate.now());
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