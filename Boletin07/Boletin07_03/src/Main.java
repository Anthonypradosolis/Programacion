import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        SignoNum obj = new SignoNum();
        System.out.println("Escribe un numero");
        num = sc.nextInt();
        obj.SigNum(num);
    }
}