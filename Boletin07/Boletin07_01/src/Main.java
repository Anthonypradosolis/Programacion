import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        NumeroPositivo np = new NumeroPositivo();
        int num;
        System.out.println("Escribe un numero");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        np.Numpositivo(num);
    }
}