import javax.swing.JOptionPane;
public class TresNumDis {
    public void TresNumDis() {
        double num1=Double.parseDouble(JOptionPane.showInputDialog("Escribe el primer numero que sea distinto a los otros"));
        double num2=Double.parseDouble(JOptionPane.showInputDialog("Escribe el segundo numero que sea distinto a los otros"));
        double num3=Double.parseDouble(JOptionPane.showInputDialog("Escribe el tercer numero que sea distinto a los otros"));
        if (num1>num2&&num1>num3)
            System.out.println("El numero 1 es el mayor");
        if (num2>num1&&num2>num3)
            System.out.println("El numero 2 es el mayor");
        if (num3>num1&&num3>2)
            System.out.println("El numero 3 es el mayor");
    }
}