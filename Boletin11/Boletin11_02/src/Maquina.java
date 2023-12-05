import javax.swing.JOptionPane;
import java.util.Random;
public class Maquina {
    private int i = 0;
    boolean acertado = false;
    Random r = new Random();
    int numr = r.nextInt(50) + 1;
    public void MaquinaJuego() {
        JOptionPane.showMessageDialog(null, "Numero generado");
        while (!acertado) {
            int adivinar = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero que tienes que adivinar"));
            i++;
            int diferencia = Math.abs(adivinar - numr);
            if (adivinar == numr) {
                JOptionPane.showMessageDialog(null, "Acertaste el numero");
                JOptionPane.showMessageDialog(null, "Has necesitado " + i + " intendos");
                acertado = true;
            } else {
                if (diferencia > 20) {
                    JOptionPane.showMessageDialog(null, "Muy lejos");
                }
                if (diferencia >= 10 && diferencia <= 20) {
                    JOptionPane.showMessageDialog(null, "Lejos ");
                }
                if (diferencia > 5 && diferencia < 10) {
                    JOptionPane.showMessageDialog(null, "Cerca ");
                }
                if (diferencia <= 5) {
                    JOptionPane.showMessageDialog(null, "Muy cerca ");
                }
            }
        }
    }
}