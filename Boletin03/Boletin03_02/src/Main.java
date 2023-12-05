import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float gc, fa, ke;
        Scanner sc= new Scanner(System.in);
        System.out.println("dime los grados centigrados");
        gc=sc.nextFloat();
        fa=(gc*9/5)+32;
        ke=(float)(gc+273.15);
        System.out.println("De grados centigrados a Fahrenheit= "+ fa+"\nDe grados centigrados a Kelvin= "+ ke);
    }
}