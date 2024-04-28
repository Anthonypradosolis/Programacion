import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
public class ReportesYTrayectoriaNave extends JFrame {
    private JPanel centerPanel;
    private JButton generateReportButton;
    private JButton viewShipReport;
    private JButton shipTrayectoryButton;

    public ReportesYTrayectoriaNave() throws IOException {
        initializeWindow();
        initializeCenterPanel();
        initializeButtons();
    }

    private void initializeWindow() {
        setTitle("Reportes y progresos");
        setVisible(true);
        setBounds(500,500,600,600);
    }

    private void initializeCenterPanel() {
        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        add(centerPanel);
    }

    private void initializeButtons() {
        generateReportButton = createButton("Generar reporte", Color.GREEN, BorderLayout.EAST, e -> new GenerarReporte());
        viewShipReport = createButton("Ver reportes de misiones", Color.ORANGE, BorderLayout.WEST, e -> new VerReporte());
        shipTrayectoryButton = createButton("Trayectoria de las naves", Color.BLUE, BorderLayout.SOUTH, null);
    }

    private JButton createButton(String text, Color color, String borderLayout, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.setBackground(color);
        button.setForeground(Color.WHITE);
        centerPanel.add(button, borderLayout);
        if (actionListener != null) {
            button.addActionListener(actionListener);
        }
        return button;
    }
}
