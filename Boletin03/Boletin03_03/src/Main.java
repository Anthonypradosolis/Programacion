import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int billete100, billete20, billete5, moneda, suma;
        Scanner sc= new Scanner(System.in);
        System.out.println("dame el numero de billetes de 100");
        billete100= sc.nextInt();
        System.out.println("dame el numero de billetes de 20");
        billete20=sc.nextInt();
        System.out.println("dame el numero de billetes de 5");
        billete5=sc.nextInt();
        System.out.println("dame el numero de monedas de 1 euro");
        moneda=sc.nextInt();
        suma=billete100*100+billete20*20+billete5*5+moneda*1;
        System.out.println("suma= " + suma+" euros");
    }
}