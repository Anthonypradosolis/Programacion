import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.IOException;

public class MenuPrincipal extends JFrame {
    private JPanel centerPanel;
    private JPanel buttonsPanel;
    private JButton createMisionButton;
    private JButton assignShipsAndCrewButton;
    private JButton viewMissionStatus;
    private JButton reportsTrayectoryButton;

    public MenuPrincipal() {
        initializeWindow();
        initializeCenterPanel();
        initializeButtonsPanel();
        initializeButtons();
    }

    private void initializeWindow() {
        setTitle("NASA");
        setVisible(true);
        setBounds(600, 600, 600, 600);
    }

    private void initializeCenterPanel() {
        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        add(centerPanel);
    }

    private void initializeButtonsPanel() {
        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.Y_AXIS));
        Border borde = BorderFactory.createLineBorder(Color.BLACK, 2);
        buttonsPanel.setBorder(borde);
        buttonsPanel.setBackground(Color.BLACK);
        centerPanel.add(buttonsPanel, BorderLayout.SOUTH);
    }

    private void initializeButtons() {
        createMisionButton = createButton("Crear Mision", Color.BLUE);
        assignShipsAndCrewButton = createButton("Asignar naves y tripulaciones", Color.CYAN);
        viewMissionStatus = createButton("Visualizar  mision", Color.ORANGE);
        reportsTrayectoryButton = createButton("Reportes y Trayectorias de las naves", Color.MAGENTA);

        createMisionButton.addActionListener(e -> new CrearMision());
        assignShipsAndCrewButton.addActionListener(e -> new NavesYTripulaciones());
        viewMissionStatus.addActionListener(e -> new VisualizarMisiones());
        reportsTrayectoryButton.addActionListener(e -> {
            try {
                new ReportesYTrayectoriaNave();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    private JButton createButton(String text, Color color) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(200, 60));
        button.setBackground(color);
        button.setForeground(Color.WHITE);
        buttonsPanel.add(button, BorderLayout.SOUTH);
        return button;
    }
}
