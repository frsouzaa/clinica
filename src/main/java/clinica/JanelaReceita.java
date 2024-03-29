package clinica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import clinica.DAO.ReceitaDAO;

public class JanelaReceita extends JFrame {
    private JPanel pageReceita;
    private JTextField data;
    private JTextField descritivo;
    private JButton salvar;
    private JButton voltar;

    public JanelaReceita()  {
        setContentPane(pageReceita);
        setTitle("Receita");
        setSize(380,330);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Receita obj = new Receita();
                    obj.setDescritivo(descritivo.getText());
                    obj.setData(LocalDate.now());
                    ReceitaDAO receitaDAO = new ReceitaDAO();
                    receitaDAO.create(obj);
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
