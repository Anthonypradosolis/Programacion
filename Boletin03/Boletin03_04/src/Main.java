import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int euros, billete100, billete20, billete5, moneda;
        Scanner sc = new Scanner(System.in);
        System.out.println("dame el total de euros");
        euros=sc.nextInt();
        billete100=euros/100;
        euros%= 100;
        System.out.println("billete de 100="+ billete100);
        billete20=euros/20;
        euros%= 20;
        System.out.println("billete de 20="+ billete20);
        billete5=euros/5;
        euros%= 5;
        System.out.println("billete de 5="+ billete5);
        moneda=euros/1;
        System.out.println("moneda="+ moneda);
    }
}