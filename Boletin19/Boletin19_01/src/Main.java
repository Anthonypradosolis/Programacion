//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        ConvertirTemperaturas objct = new ConvertirTemperaturas();
        float escribe=0.0f;
        do{
            try{
                escribe =Float.parseFloat(JOptionPane.showInputDialog("Introduce la temperatura en grados centigrados: "));
                float temf = objct.centigradosAFharenheit(escribe);
                float temar = objct.centigradosAReamur(escribe);
                JOptionPane.showMessageDialog(null, "Grados Fahrenheit: "+temf+ "\nGrados Reamur: "+temar);

            }catch(TemperaturaErradaExcepcion e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }while(escribe<80);


    }
}