import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class CrearMision extends JFrame {
    private JPanel centerPanel;
    private JTextField missionNameText;
    private JTextField releaseDateText;
    private JTextField targetText;
    private JTextField missionStatementText;
    private JComboBox<String> spacecraftUsedList;
    private JTextArea confirmAreaText;
    private JButton confirm;
    private static final ArrayList<String> missionName = new ArrayList<>();

    public CrearMision() {
        initializeWindow();
        initializeCenterPanel();
        initializeInformationPanel();
    }

    private void initializeWindow() {
        setTitle("Crear Misiones");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initializeCenterPanel() {
        centerPanel = new JPanel(new BorderLayout());
        add(centerPanel, BorderLayout.CENTER);
    }

    private void initializeInformationPanel() {
        JPanel informationPanel = new JPanel(new GridBagLayout());
        Border border = BorderFactory.createLineBorder(Color.CYAN, 10);
        informationPanel.setBorder(border);
        informationPanel.setBackground(Color.BLACK);
        GridBagConstraints gbc = new GridBagConstraints();

        missionNameText = createTextField(gbc, informationPanel, "Nombre de la misión:", 0, 0);
        releaseDateText = createTextField(gbc, informationPanel, "Fecha de lanzamiento:", 1, 0);
        targetText = createTextField(gbc, informationPanel, "Objetivo de la misión:", 2, 0);
        missionStatementText = createTextField(gbc, informationPanel, "Estado de la misión:", 3, 0);

        confirmAreaText = new JTextArea(3, 20);
        confirmAreaText.setEditable(false);
        gbc.gridx = 2;
        gbc.gridy = 3;
        informationPanel.add(new JScrollPane(confirmAreaText), gbc);

        confirm = new JButton("Confirmar");
        gbc.gridx = 5;
        gbc.gridy = 1;
        informationPanel.add(confirm, gbc);
        confirm.addActionListener(this::addMissionFile);

        centerPanel.add(informationPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private JTextField createTextField(GridBagConstraints gbc, JPanel panel, String label, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(new JLabel(label), gbc);
        gbc.gridy = y + 1;
        JTextField textField = new JTextField(9);
        panel.add(textField, gbc);
        return textField;
    }

    public void addMissionFile(ActionEvent e) {
        if (checkEmptyContent()) {
            try {
                String missionName = missionNameText.getText();
                String releaseDate = releaseDateText.getText();
                String target = targetText.getText();
                String missionStatement = missionStatementText.getText();
                String spacecraftUsed = (String) spacecraftUsedList.getSelectedItem();
                String filePath = missionName + ".txt";
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

                writer.write("Nombre de la misión: " + missionName + "\n");
                writer.write("Fecha de lanzamiento: " + releaseDate + "\n");
                writer.write("Objetivo de la misión: " + target + "\n");
                writer.write("Estado de la misión: " + missionStatement + "\n");
                writer.write("Nave de la misión: " + spacecraftUsed + "\n");

                writer.close();
                confirmAreaText.setText("Misión creada correctamente");
                CrearMision.missionName.add(filePath);
            } catch (IOException ex) {
                confirmAreaText.setText("La misión no pudo crearse");
            }
        } else {
            confirmAreaText.setText("Rellene todos los campos");
        }
    }

    private boolean checkEmptyContent() {
        int selectedIndex = spacecraftUsedList.getSelectedIndex();
        return !missionNameText.getText().isEmpty() && !releaseDateText.getText().isEmpty() && !targetText.getText().isEmpty() && !missionStatementText.getText().isEmpty() && selectedIndex != -1;
    }

    public static ArrayList<String> getMissionName() {
        return missionName;
    }
}
