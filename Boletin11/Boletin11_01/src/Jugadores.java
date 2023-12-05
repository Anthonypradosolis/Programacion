import javax.swing.JOptionPane;
public class Jugadores {
    private int num;
    private int intentos;
    private int i=0;
    private int adivinar;
    public void JugadorUno(){
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entre 1 y 50"));
        }while(num<1||num>50);
        intentos=Integer.parseInt(JOptionPane.showInputDialog("Escribe los intentos para el segundo jugador"));
        do{
            adivinar=Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero que tienes que adivinar"));
            if(adivinar>num){
                JOptionPane.showMessageDialog(null, "El numero que tienes que adivinar es menor");
            }
            if(adivinar<num){
                JOptionPane.showMessageDialog(null, "El numero que tienes que advinar es mayor ");
            }
            i++;
        }while(adivinar!=num&&i<intentos);
        if(intentos==i) {
            JOptionPane.showMessageDialog(null, "Se te acabaron los intentos");
        }
        if(adivinar==num){
            JOptionPane.showMessageDialog(null, "Felicidades adivinaste el numero");
        }
    }
}