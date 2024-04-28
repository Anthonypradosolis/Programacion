import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;

public class NavesYTripulaciones extends JFrame {
    private JPanel centerPanel;
    private JTextField shipNameText;
    private JTextField crewMembersText;
    private JTextArea confirmationText;
    private JButton confirm;
    private static final HashMap<String, String> naveTripulacion = new HashMap<>();

    public NavesYTripulaciones() {
        initializeWindow();
        initializeCenterPanel();
        initializeInformationPanel();
    }

    private void initializeWindow() {
        setTitle("Naves y tripulaciones");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initializeCenterPanel() {
        centerPanel = new JPanel(new GridBagLayout());
        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
        centerPanel.setBorder(border);
        add(centerPanel);
    }

    private void initializeInformationPanel() {
        GridBagConstraints gbc = new GridBagConstraints();

        shipNameText = createTextField(gbc, "Nombre de la nave:", 0);
        crewMembersText = createTextField(gbc, "Nombre de la tripulación:", 1);

        confirmationText = new JTextArea(3, 20);
        confirmationText.setEditable(false);
        gbc.gridy++;
        centerPanel.add(new JScrollPane(confirmationText), gbc);

        confirm = new JButton("Confirmar");
        gbc.gridy++;
        centerPanel.add(confirm, gbc);
        confirm.addActionListener(this::addShipCrewMission);

        setVisible(true);
    }

    private JTextField createTextField(GridBagConstraints gbc, String label, int y) {
        gbc.gridx = 0;
        gbc.gridy = y;
        gbc.anchor = GridBagConstraints.LINE_END;
        centerPanel.add(new JLabel(label), gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JTextField textField = new JTextField(20);
        centerPanel.add(textField, gbc);

        return textField;
    }

    private void addShipCrewMission(ActionEvent e) {
        String shipName = shipNameText.getText();
        String crewMembers = crewMembersText.getText();

        if (!shipName.isEmpty() && !crewMembers.isEmpty()) {
            naveTripulacion.put(shipName, crewMembers);
            confirmationText.setText("Nave y tripulación añadida correctamente");
            shipNameText.setText("");
            crewMembersText.setText("");
        } else {
            confirmationText.setText("Rellene los campos que faltan");
        }
    }

    public static HashMap<String, String> getNaveTripulacion() {
        return naveTripulacion;
    }
}
