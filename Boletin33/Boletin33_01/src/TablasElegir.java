import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 * Ejercicio el cual creamos una interzar para luego visualizarla
 */
public class TablasElegir {
    private JTextField tablanombre;
    private JTextField apellidotabla;
    private JComboBox<String> boxcursos;
    private DefaultTableModel modeloTabla;
    private JTable tabla;

    /**
     * Creamos la ventana, la tabla, los valores que iran a la tabla, el panel para seleccionar la clase
     * Y la visualizacion de la tabla
     */

    public TablasElegir() {
        JFrame frame = new JFrame("Interfaz de la Tabla");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel panelNombre = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaNombre = new JLabel("Nombre:");
        tablanombre = new JTextField(10);
        panelNombre.add(etiquetaNombre);
        panelNombre.add(tablanombre);

        JPanel panelApellido = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel etiquetaApellido = new JLabel("Apellido:");
        apellidotabla = new JTextField(10);
        panelApellido.add(etiquetaApellido);
        panelApellido.add(apellidotabla);


        String[] cursos = {"DAM1", "DAM2", "ASIR", "DAW"};
        boxcursos = new JComboBox<>(cursos);
        boxcursos.setPreferredSize(new Dimension(120, 20));
        panelNombre.add(boxcursos);
        panel.add(panelNombre);

        JButton botonAgregar = new JButton("Añadir a la tabla");
        botonAgregar.addActionListener(e -> {
            String nombre = tablanombre.getText();
            String apellido = apellidotabla.getText();
            String curso = (String) boxcursos.getSelectedItem();
            modeloTabla.addRow(new Object[]{nombre, apellido, curso});
        });
        panelApellido.add(botonAgregar);
        panel.add(panelApellido);

        modeloTabla = new DefaultTableModel(new Object[]{"Nombre", "Apellido", "Curso"}, 0);
        tabla = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tabla);
        panel.add(scrollPane);
        frame.setVisible(true);
    }

}
