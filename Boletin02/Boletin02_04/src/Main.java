import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num1, num2, sumar, restar, producto, cociente;
        Scanner sc = new Scanner(System.in);
        System.out.println("tecla un primer numero");
        num1 = sc.nextDouble();
        System.out.println("tecla un segundo numero");
        num2 = sc.nextDouble();
        sumar= num1 + num2;
        restar= num1 - num2;
        producto= num1 * num2;
        cociente= num1 / num2;
        System.out.println("sumar="+ sumar+"\nrestar="+restar+"\nproducto="+producto+"\ncociente="+cociente);
        // cambia en las operaciones
        // double num1, num2;
        // double suma = num1+num2;
        // double resta = num1-num2;
        // System.out.println("sumar="+ sumar);
        // System.out.println("restar="+ restar);
        // System.out.println("producto=" +(num1*num2));
        // System.out.println("cociente=" +(num1/num2));
    }
}