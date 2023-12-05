import javax.swing.JOptionPane;
public class Coche {
    private static String matricula;
    private static String marca;
    public Coche() {
    }
    public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public static void datosCoche(){
        matricula= JOptionPane.showInputDialog("Escribe la matricula");
        marca = JOptionPane.showInputDialog("Escribe la marca");
    }
    public static void facturacoche(){
        double tiempo =Float.parseFloat(JOptionPane.showInputDialog("Escribe el tiempo que estuvo el coche en el garaje")) ;
        double precio;
        double pagado;
        if(tiempo<=3){
            precio = tiempo * 1.5;
            JOptionPane.showMessageDialog(null, "Precio a pagar por las horas: "+precio+ "€");
        }
        else{
            precio = 3*1.5 + (tiempo-3)*0.2;
            JOptionPane.showMessageDialog(null, "Precio a pagar por las horas: "+precio+ "€");
        }
        do{
            pagado=Double.parseDouble(JOptionPane.showInputDialog("Escribe el precio que vas a pagar por el tiempo del garaje: "));
            if(pagado<precio){
                JOptionPane.showMessageDialog(null, "El monto pagado es menor al precio. Por favor, paga la cantidad correcta");
            }
        }while(pagado<precio);
        JOptionPane.showMessageDialog(null,"Te devolvemos el cambio: "+(Math.abs(precio-pagado))+" €");
        System.out.println("Matricula:"+ matricula+"\nMarca: "+marca+"\nPrecio a pagar: "+precio+"\nDinero pagado: " +pagado+"\nDinero devuelto:"+(Math.abs(precio-pagado)));
        System.out.println("¡Gracias por usar nuestro aparcadero!");
    }
}