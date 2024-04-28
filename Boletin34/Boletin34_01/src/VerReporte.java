import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Map;

public class VerReporte extends JFrame {
    private JPanel centerPanel;
    private JTable missionsTable;
    private DefaultTableModel modelTable;
    private JComboBox<String> missionNameBox;
    private JButton confirm;

    public VerReporte(){
        initializeWindow();
        initializeCenterPanel();
        initializeTable();
        initializeSelectAndInfoPanel();
    }

    private void initializeWindow() {
        setTitle("Reportes de Misiones");
        setVisible(true);
        setBounds(600, 600, 600, 600);
    }

    private void initializeCenterPanel() {
        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        add(centerPanel, BorderLayout.CENTER);
    }

    private void initializeTable() {
        modelTable = new DefaultTableModel(
                new Object[][]{
                        {},
                },
                new Object[]{"Reportes"}
        );
        missionsTable = new JTable(modelTable);
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setBackground(Color.CYAN);

        for (int i = 0; i < missionsTable.getColumnCount(); i++) {
            missionsTable.getColumnModel().getColumn(i).setCellRenderer(cellRenderer);
        }

        JScrollPane scrollPane = new JScrollPane(missionsTable);
        scrollPane.setBackground(Color.BLACK);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
    }

    private void initializeSelectAndInfoPanel() {
        JPanel selectAndInfoPanel = new JPanel();
        selectAndInfoPanel.setLayout(new BorderLayout());
        centerPanel.add(selectAndInfoPanel, BorderLayout.SOUTH);

        missionNameBox = new JComboBox<>();
        for (String element:GenerarReporte.getMissionsState().keySet()){
            missionNameBox.addItem(element);
        }
        selectAndInfoPanel.add(missionNameBox, BorderLayout.WEST);

        confirm = new JButton("confirmar");
        confirm.setBackground(Color.GREEN);
        confirm.setForeground(Color.WHITE);
        selectAndInfoPanel.add(confirm, BorderLayout.SOUTH);
        confirm.addActionListener(this::insertInformation);
    }

    public void insertInformation(ActionEvent e){
        if(checkEmptyContent()){
            confirm.setEnabled(true);
            String nameMission = (String) missionNameBox.getSelectedItem();
            for (Map.Entry<String, String> entry : GenerarReporte.getMissionsState().entrySet()) {
                String clave = entry.getKey();
                String valor = entry.getValue();
                modelTable.addRow(new Object[]{clave});
                modelTable.addRow(new Object[]{valor});
            }
        }
    }

    private boolean checkEmptyContent(){
        int selectIndex = missionNameBox.getSelectedIndex();
        return selectIndex != -1;
    }
}
