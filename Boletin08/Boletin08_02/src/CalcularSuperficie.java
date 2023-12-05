import javax.swing.JOptionPane;
public class CalcularSuperficie {
    public void CalcularSuperficieObjetos() {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Sabiendo que \n1=cuadrado \n2=triangulo \n3=circulo \nescribe un numero "));
        switch (n1) {
            case 1: System.out.println("Escribe el valor de la altura");
                float a=Float.parseFloat(JOptionPane.showInputDialog("Valor de la altura "));
                float resul;
                resul=a*a;
                System.out.println("El area del cuadrado es: "+ resul + " m²");
                break;
            case 2: System.out.println("Escribe el valor de la altura y la base");
                float al=Float.parseFloat(JOptionPane.showInputDialog("Valor de la altura "));
                float b=Float.parseFloat(JOptionPane.showInputDialog("Valor de la base "));
                float result;
                result=(al*b)/2;
                System.out.println("El area del triangulo es:" +result+ " m²");
                break;
            case 3: System.out.println("Escribe el valor del radio");
                float r=Float.parseFloat(JOptionPane.showInputDialog("Valor del radio "));
                double resulta;
                resulta= (Math.PI*(Math.pow(r, 2)));
                System.out.println("El area del circulo es: " +resulta+ " m²");
                break;
            default: System.out.println("Opcion incorrecta");
                // Public float pedirFloat("Dame lado") {
                // float dato=
                // return dato;
        }
    }
}