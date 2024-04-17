import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Convertidor_Temperatura extends JFrame {
         private JTextField temperaturaCelsius;
        private JTextField temperaturaFahrenheit;
        private JButton botonConvertirACelsius;
        private JButton botonConvertirAFahrenheit;

        public Convertidor_Temperatura() {
            super("Convertidor de Temperatura");
            setLayout(new FlowLayout());

            temperaturaCelsius = new JTextField(10);
            temperaturaFahrenheit = new JTextField(10);
            botonConvertirACelsius = new JButton("Convertir a Celsius");
            botonConvertirAFahrenheit = new JButton("Convertir a Fahrenheit");

            add(temperaturaCelsius);
            add(botonConvertirACelsius);
            add(temperaturaFahrenheit);
            add(botonConvertirAFahrenheit);
            setLocationRelativeTo(null);


            botonConvertirACelsius.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double fahrenheit = Double.parseDouble(temperaturaFahrenheit.getText());
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    temperaturaCelsius.setText(String.format("%.2f", celsius));
                }
            });

            botonConvertirAFahrenheit.addActionListener(new ConvertirAFahrenheit());
        }

        private class ConvertirAFahrenheit implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                double celsius = Double.parseDouble(temperaturaCelsius.getText());
                double fahrenheit = celsius * 9 / 5 + 32;
                temperaturaFahrenheit.setText(String.format("%.2f", fahrenheit));
            }
        }

}
