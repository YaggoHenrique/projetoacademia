import javax.swing.*;
import java.awt.*;

public class TelaPlanos extends JFrame {
    public TelaPlanos() {
        setTitle("Planos Disponíveis");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] colunas = { "Plano", "Duracão", "Valor" };
        String[][] dados = {
                { "Mensal", "1 mês", "R$ 85,00" },
                { "Trimestral", "3 meses", "R$ 225,00" },
                { "Semestral", "6 meses", "R$ 410,00" },
                { "Anual", "12 meses", "R$ 720,00" },
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