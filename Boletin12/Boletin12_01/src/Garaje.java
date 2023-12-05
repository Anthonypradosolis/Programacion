import javax.swing.JOptionPane;
public class Garaje {
    public static int numcoches=0;
    private static Coche coche;
    public Garaje() {
    }
    public  void plazas(){
        do{
            menu();
        } while (numcoches < 5);
        JOptionPane.showMessageDialog(null, "Plazas Completas");
    }
    public void menu(){
        int seleccion=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion: \n0=Aparcar \n1=Salir del garaje \n2=Finalizar"));
        switch (seleccion) {
            case 0:
                JOptionPane.showMessageDialog(null, "Quiero entrar en el garaje");
                JOptionPane.showMessageDialog(null, "¡Hay plazas disponibles!");
                Coche.datosCoche();
                Garaje.numcoches++;
                Coche.facturacoche();
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Saliste del garaje");
                Garaje.numcoches--;
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Finalizado");
                System.exit(0);
                break;
            default:System.out.println("Opcion Incorrecta");
        }
    }
}