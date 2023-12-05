
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int c1;
        do {
            c1=Integer.parseInt(JOptionPane.showInputDialog(null,"Elige el tipo de cuenta: \n1=Cuenta Corriente \n2=Cuenta Ahorro \n3=Finalizar"));
            switch(c1){
                case 1:
                    System.out.println("Escribe los datos pertinentes:");
                    Persona.caracPer();
                    long numcuenta=Long.parseLong(JOptionPane.showInputDialog("Escribe el numero de cuenta")) ;
                    Persona cliente = new Persona();
                    CuentaCorriente objc = new CuentaCorriente(numcuenta,cliente);
                    double ingresar = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto deseas ingresar?"));
                    objc.ingresar(ingresar);
                    double retirar = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto deseas retirar?"));
                    objc.retirar(retirar);
                    double nuevoSaldo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el nuevo saldo?"));
                    objc.actualizarSaldo(nuevoSaldo);
                    System.out.println("El interés de tu cuenta corriente es: " + objc.getInteres());
                    System.out.println(objc.toString());
                    break;
                case 2:
                    System.out.println("Escribe los datos pertinentes");
                    numcuenta=Long.parseLong(JOptionPane.showInputDialog("Escribe el numero de cuenta")) ;
                    Persona.caracPer();
                    cliente = new Persona();
                    double minsaldo = Double.parseDouble(JOptionPane.showInputDialog("Escribe el saldo mínimo requerido"));
                    double interesvariable=Double.parseDouble(JOptionPane.showInputDialog("Escribe el interes"));
                    CuentaAhorro obja = new CuentaAhorro(numcuenta,cliente,interesvariable,minsaldo);
                    ingresar = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto deseas ingresar?"));
                    obja.ingresar(ingresar);
                    retirar = Double.parseDouble(JOptionPane.showInputDialog("¿Cuánto deseas retirar?"));
                    obja.retirar(retirar);
                    nuevoSaldo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el nuevo saldo?"));
                    obja.actualizarSaldo(nuevoSaldo);
                    System.out.println(obja.toString());
                    break;
            }
        } while (c1 != 3);
    }

    }
}