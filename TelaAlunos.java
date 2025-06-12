import javax.swing.*;
import java.awt.*;

public class TelaAlunos extends JFrame {
    public TelaAlunos() {
        setTitle("Planos Disponíveis");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] colunas = { "Nome", "Idade", "CPF", "Telefone" };
        String[][] dados = {
                { "João Antônio", "22", "111.222.333-44", "(61)11111-5555" },
                { "Kevin Lucas", "45", "111.222.333-44", "(61)11111-5555" },
                { "Ana Luiza", "19", "111.222.333-44", "(61)11111-5555" },
                { "Rafael", "37", "111.222.333-44", "(61)11111-5555" },
        };

        JTable tabela = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabela);

        tabela.setFillsViewportHeight(true);
        tabela.setRowHeight(25);

        JPanel painel = new JPanel(new BorderLayout());
        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        painel.add(new JLabel("Planos Disponiveis", SwingConstants.CENTER), BorderLayout.NORTH);
        painel.add(scrollPane, BorderLayout.CENTER);

        add(painel);
        setVisible(true);
    }
}
