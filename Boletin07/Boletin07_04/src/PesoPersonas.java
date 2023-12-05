import javax.swing.JOptionPane;
public class PesoPersonas {
    public void PesoPersonas() {
        String nombre1= JOptionPane.showInputDialog("Escribe el nombre de la primera persona");
        double peso1=Double.parseDouble(JOptionPane.showInputDialog("Escribe el peso de la persona 1"));
        String nombre2=JOptionPane.showInputDialog("Escribe el nombre de la segunda persona");
        double peso2=Double.parseDouble(JOptionPane.showInputDialog("Escribe el peso de la persona 2"));
        if (peso1>peso2)
            JOptionPane.showMessageDialog(null,"La persona 1 se llama "+ nombre1+ " pesa "+ (peso1-peso2)+" kilos mas que " + nombre2);
        else
            JOptionPane.showMessageDialog(null,"La persona 2 se llama "+ nombre2+ " pesa "+ (peso2-peso1)+" kilos mas que " + nombre1);
    }
}