import javax.swing.JOptionPane;
public class Persona {
    private static String nombre;
    private static String apellidos;
    private static String nif;
    public Persona() {
    }
    public Persona(String nombre, String apellidos, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }
    public static void caracPer(){
        nombre=JOptionPane.showInputDialog("Escribe su nombre");
        apellidos=JOptionPane.showInputDialog("Escribe sus apellidos");
        nif=JOptionPane.showInputDialog("Escribe tu NIF");
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + '}';
    }
}