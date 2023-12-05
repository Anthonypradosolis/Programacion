import java.util.Scanner;
public class BaseAlturaPositivos {
    public void BaseAlturaPositivos () {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double area;
        do {
            System.out.println("Teclea la base:");
            base = sc.nextDouble();
        } while(base <= 0);
        do {
            System.out.println("Teclea la altura");
            altura = sc.nextDouble();
        }while(altura <=0);
        area = base * altura;
        System.out.println("El area del rectangulo es: " + area+ " m²");
    }
}