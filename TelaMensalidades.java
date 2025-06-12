import javax.swing.*;
import java.awt.*;

public class TelaMensalidades extends JFrame {
    public TelaMensalidades() {
        setTitle("MENSALIDADES");
        setSize(600, 400);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = getWidth();
        int height = getHeight();
        int x = (screenSize.width - width) / 2;
        int y = (screenSize.height - height) / 2;
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] colunas = { "Nome", "Status" };
        String[][] dados = {
                { "João Antônio", "PAGO" },
                { "Kevin Lucas", "PENDENTE" },
                { "Ana Luiza", "PENDENTE" },
                { "Rafael", "PAGO" },
                { "Lionel Messi", "PENDENTE" }
        };

        JTable tabela = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabela);

        tabela.setFillsViewportHeight(true);
        tabela.setRowHeight(25);

        JPanel painel = new JPanel(new BorderLayout());
        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        painel.add(new JLabel("Situacão das Mensalidades", SwingConstants.CENTER), BorderLayout.NORTH);
        painel.add(scrollPane, BorderLayout.CENTER);

        add(painel);
        setVisible(true);
    }
}
