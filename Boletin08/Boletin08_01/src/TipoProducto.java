import javax.swing.JOptionPane;
public class TipoProducto {
    public void TipoProducto() {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero:"));
        if (n1<=100)
            System.out.println("El articulo pc: es bajo");
        if (n1>100&&n1<=500)
            System.out.println("El articulo pc: es medio");
        if (n1>500&&n1<=1000)
            System.out.println("El articulo pc: es alto");
        if (n1>1000)
            System.out.println("El articulo pc: es de alta calidad");
    }
}