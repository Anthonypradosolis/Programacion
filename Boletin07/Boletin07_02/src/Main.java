import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        short num1;
        short num2;
        Scanner sc = new Scanner(System.in);
        SumaResta obj = new SumaResta();
        System.out.println("escribre dos numeros");
        num1 = sc.nextShort();
        num2=sc.nextShort();
        obj.RestaSuma(num1, num2);
    }
}