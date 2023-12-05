import javax.swing.JOptionPane;
public class TablaMultiplicar {
    public void TablaMult(){
        int num;
        int i=1;
        do{
            num= Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entre 1 y el 9"));
            System.out.println("TABLA DEL: "+num);
        }while(num<=0);

        while(i<=10&&i>0) {
            System.out.println(num+" * "+i+" = "+ (i*num));
            i++;
        }
        if (i==0) {
            System.out.println("Se acaba el programa");
        }
    }
}