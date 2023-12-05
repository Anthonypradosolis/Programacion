import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float precinicial, precfinal, porcentaje;
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el precio inicial");
        precinicial=sc.nextFloat();
        System.out.println("dime el precio final");
        precfinal=sc.nextFloat();
        porcentaje=(100-(precfinal/precinicial)*100);
        System.out.println("el porcentaje es= " + porcentaje +" %");
    }
}