import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaHome extends JFrame {
    @SuppressWarnings("unused")
    public TelaHome() {
        setTitle("Sistema da academia Malhe+");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = getWidth();
        int height = getHeight();
        int x = (screenSize.width - width) / 2;
        int y = (screenSize.height - height) / 2;
        setLocation(x, y);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(6, 1, 10, 10));

        painel.add(new JLabel("Olá, você está no sistema de gestão da academia Malhe+", JLabel.CENTER));

        JButton btnAlunos = new JButton("Alunos");
        JButton btnPlanos = new JButton("Planos");
        JButton btnMensalidades = new JButton("Mensalidades");
        JButton btnSair = new JButton("Sair");

        painel.add(btnAlunos);
        painel.add(btnPlanos);
        painel.add(btnMensalidades);
        painel.add(btnSair);

        btnAlunos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaAlunos();
            }
        });

        btnPlanos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaPlanos();
            }
        });

        btnMensalidades.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaMensalidades();
            }
        });

        btnSair.addActionListener(e -> dispose());

        add(painel);
        setVisible(true);

        add(painel);
        setVisible(true);
    }
}