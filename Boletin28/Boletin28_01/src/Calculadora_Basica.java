import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora_Basica extends JFrame implements ActionListener {
    private JTextField operandField1;
    private JTextField operandField2;
    private JButton sumButton;
    private JButton subtractButton;
    private JTextArea resultArea;

    public Calculadora_Basica() {
        setTitle("Calculadora Básica");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        operandField1 = new JTextField();
        operandField2 = new JTextField();
        sumButton = new JButton("+");
        subtractButton = new JButton("-");
        resultArea = new JTextArea();
        resultArea.setEditable(false);

        add(new JLabel("Numerin 1:"));
        add(operandField1);
        add(new JLabel("Numerin 2:"));
        add(operandField2);
        add(sumButton);
        add(subtractButton);
        add(new JLabel("Resultado:"));
        add(resultArea);

        sumButton.addActionListener(this);
        subtractButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double operand1 = Double.parseDouble(operandField1.getText());
            double operand2 = Double.parseDouble(operandField2.getText());
            double result;
            if (e.getSource() == sumButton) {
                result = operand1 + operand2;
            } else {
                result = operand1 - operand2;
            }
            resultArea.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, introduzca números válidos en los operandos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


}
