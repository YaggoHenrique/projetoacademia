import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaDeLogin extends JFrame {
    private JTextField campoUser;
    private JPasswordField campoSenha;

    public TelaDeLogin() {
        setTitle("Acesso ao administrador!");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = getWidth();
        int height = getHeight();
        int x = (screenSize.width - width) / 2;
        int y = (screenSize.height - height) / 2;
        setLocation(x, y);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 2, 10, 10));

        painel.add(new JLabel("Usuário:"));
        campoUser = new JTextField();
        painel.add(campoUser);

        painel.add(new JLabel("Senha:"));
        campoSenha = new JPasswordField();
        painel.add(campoSenha);

        JButton btnAcess = new JButton();
        painel.add(btnAcess);

        btnAcess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUser.getText();
                String senha = new String(campoSenha.getPassword());

                if (usuario.equals("admin") && senha.equals("0000")) {
                    dispose();
                    new TelaHome();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inccorretos(as)", "ERRO",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(painel);
        setVisible(true);
    }

}