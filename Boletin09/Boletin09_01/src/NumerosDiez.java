import java.util.Scanner;
public class NumerosDiez {
    public void Numdiez() {

        Scanner scanner = new Scanner(System.in);
        int positivos = 0, negativos = 0, ceros = 0, i = 0;
        while (i < 10) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            int numero = scanner.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
            i++;
        }
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}