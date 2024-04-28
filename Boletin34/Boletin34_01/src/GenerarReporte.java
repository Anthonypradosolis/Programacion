import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;

public class GenerarReporte extends JFrame {
    private JPanel centerPanel;
    private JComboBox<String> missionNameBox;
    private JTextField crewInformationText;
    private JTextField shipStatusText;
    private JTextField progressBarNumber;
    private JTextArea confirmReport;
    private static final HashMap<String, String> missionsState = new HashMap<>();

    public GenerarReporte() {
        initializeWindow();
        initializeCenterPanel();
        initializeComboBoxPanel();
        initializeReportContentPanel();
    }

    private void initializeWindow() {
        setTitle("Generar Reporte");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initializeCenterPanel() {
        centerPanel = new JPanel(new BorderLayout());
        add(centerPanel);
    }

    private void initializeComboBoxPanel() {
        JPanel jComboBoxPanel = new JPanel(new BorderLayout());
        centerPanel.add(jComboBoxPanel, BorderLayout.WEST);

        missionNameBox = new JComboBox<>();
        for (String element : CrearMision.getMissionName()) {
            missionNameBox.addItem(element);
        }
        jComboBoxPanel.add(missionNameBox);

        JButton confirmBoxButton = new JButton("Confirmar selección");
        jComboBoxPanel.add(confirmBoxButton, BorderLayout.SOUTH);
        confirmBoxButton.addActionListener(this::actionPerformed);
    }

    private void initializeReportContentPanel() {
        JPanel reportContentPanel = new JPanel(new GridLayout(4, 2));
        centerPanel.add(new JScrollPane(reportContentPanel), BorderLayout.CENTER);

        crewInformationText = createTextField(reportContentPanel, "Información de la tripulación");
        shipStatusText = createTextField(reportContentPanel, "Estado de la nave");
        progressBarNumber = createTextField(reportContentPanel, "Porcentaje progreso de la nave");

        JProgressBar missionProgressBar = new JProgressBar();
        reportContentPanel.add(missionProgressBar);

        confirmReport = new JTextArea();
        reportContentPanel.add(confirmReport);
    }

    private JTextField createTextField(JPanel panel, String label) {
        panel.add(new JLabel(label));
        JTextField textField = new JTextField();
        panel.add(textField);
        return textField;
    }

    private void actionPerformed(ActionEvent e) {
        if (checkIndexEmpty()) {
            confirmReport.setText("Reporte creado correctamente");
            String missionName = (String) missionNameBox.getSelectedItem();
            String informationMissionName = "Información de la tripulación: " + crewInformationText.getText() +
                    "\nEstado de la misión: " + shipStatusText.getText() +
                    "\nProgreso de la misión: " + progressBarNumber.getText() + "%";
            missionsState.put(missionName, informationMissionName);
        } else {
            confirmReport.setText("Seleccione una misión para el reporte");
        }
    }

    private boolean checkIndexEmpty() {
        return missionNameBox.getSelectedIndex() != -1;
    }

    public static HashMap<String, String> getMissionsState() {
        return missionsState;
    }
}
