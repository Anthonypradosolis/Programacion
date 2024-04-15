import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField op1;
    private JTextField op2;
    private int n1, n2, res, aux;
    private JTextArea resultado;
    private JButton suma, resta, multi, div, limpiar, calcular;




    public Calculadora(){
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,500);
        setVisible(true);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        suma = new JButton("Suma");
        resta = new JButton("Resta");
        multi = new JButton("Multiplicacion");
        div = new JButton("Division");

        suma.addActionListener(this);
        resta.addActionListener(this);
        multi.addActionListener(this);
        div.addActionListener(this);

        JPanel calculo = new JPanel();
        calculo.setLayout(new GridLayout(4,4));
        calculo.add(suma);
        calculo.add(resta);
        calculo.add(multi);
        calculo.add(div);
        add(calculo, BorderLayout.CENTER);

        op1 = new JTextField(10);
        op2 = new JTextField(10);
        resultado = new JTextArea(1,10);
        resultado.setEditable(false);

        JPanel ingresos = new JPanel();
        ingresos.setLayout(new GridLayout(1,3));
        ingresos.add(new Label("Numero_1"));
        ingresos.add(op1);
        ingresos.add(new Label("Numero_2"));
        ingresos.add(op2);
        ingresos.add(new Label("Resultado"));
        ingresos.add(resultado);
        add(ingresos,BorderLayout.NORTH);

        JPanel especiales = new JPanel();
        especiales.setLayout(new GridLayout(2,1));
        limpiar = new JButton("Limpiar");
        calcular = new JButton("=");
        limpiar.addActionListener(this);
        calcular.addActionListener(this);
        especiales.add(limpiar);
        especiales.add(calcular);
        add(especiales, BorderLayout.EAST);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            n1 = Integer.parseInt(op1.getText());
            n2 = Integer.parseInt(op2.getText());
            if(e.getSource() == suma){
                aux = 1;
            }
            else if(e.getSource() == resta){
                aux = 2;
            }
            else if(e.getSource() == multi){
                aux = 3;
            }
            else if(e.getSource() == div){
                aux = 4;
            }
            if(e.getSource() == limpiar){
                aux = 0;
                op1.setText(null);
                op2.setText(null);
                resultado.setText(null);
            }
            if(e.getSource() == calcular){
                switch(aux){
                    case 1 -> {
                        res = n1 + n2;
                        resultado.setText(String.valueOf(res));
                    }
                    case 2 -> {
                        res = n1 - n2;
                        resultado.setText(String.valueOf(res));
                    }
                    case 3 -> {
                        res = n1 * n2;
                        resultado.setText(String.valueOf(res));
                    }
                    case 4 -> {
                        res = n1 / n2;
                        resultado.setText(String.valueOf(res));
                    }
                    default -> System.out.println("Tienes que seleccionar uno");
                }
            }
        } catch (NumberFormatException ae) {
            System.out.println("Pon un Numero");
        }
    }
}
