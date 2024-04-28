import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VisualizarMisiones extends JFrame {
    private JPanel centerPanel;
    private JTable missionsTable;
    private DefaultTableModel modelTable;
    private JComboBox<String> missionNameBox;
    private JTextArea missionsReport;
    private JButton confirm;

    public VisualizarMisiones() {
        initializeWindow();
        initializeCenterPanel();
        initializeTable();
        initializeSelectAndInfoPanel();
    }

    private void initializeWindow() {
        setTitle("Misiones");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initializeCenterPanel() {
        centerPanel = new JPanel(new BorderLayout());
        add(centerPanel);
    }

    private void initializeTable() {
        modelTable = new DefaultTableModel(new Object[][]{}, new Object[]{"Misiones"});
        missionsTable = new JTable(modelTable);
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setBackground(Color.CYAN);

        for (int i = 0; i < missionsTable.getColumnCount(); i++) {
            missionsTable.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }

        JScrollPane scrollPane = new JScrollPane(missionsTable);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
    }

    private void initializeSelectAndInfoPanel() {
        JPanel selectAndInfoPanel = new JPanel(new BorderLayout());
        centerPanel.add(selectAndInfoPanel, BorderLayout.SOUTH);

        missionNameBox = new JComboBox<>();
        for (String element : CrearMision.getMissionName()) {
            missionNameBox.addItem(element);
        }
        selectAndInfoPanel.add(missionNameBox, BorderLayout.WEST);

        missionsReport = new JTextArea();
        selectAndInfoPanel.add(new JScrollPane(missionsReport), BorderLayout.CENTER);

        confirm = new JButton("Confirmar");
        confirm.setBackground(Color.GREEN);
        confirm.setForeground(Color.WHITE);
        selectAndInfoPanel.add(confirm, BorderLayout.EAST);
        confirm.addActionListener(this::insertInformation);

        setVisible(true);
    }

    public void insertInformation(ActionEvent e) {
        if (checkEmptyContent()) {
            String nameFile = (String) missionNameBox.getSelectedItem();
            try (FileReader fileReader = new FileReader(nameFile);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                String line;
                missionsReport.setText("Mostrando información de la misión: " + nameFile);
                modelTable.setRowCount(0); // Limpiar tabla antes de añadir nueva información

                while ((line = bufferedReader.readLine()) != null) {
                    modelTable.addRow(new Object[]{line});
                }
            } catch (IOException ex) {
                missionsReport.setText("Lo sentimos, la misión no se encontró o no hay misiones disponibles");
            }
        }
    }

    private boolean checkEmptyContent() {
        return missionNameBox.getSelectedIndex() != -1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(VisualizarMisiones::new);
    }
}

