import java.util.Scanner;
public class SueldoTrabajador {
    public void SuelTraba(){
        Scanner sc = new Scanner(System.in);
        double salario;
        int contadorSalarioEnRango = 0;
        int contadorSalarioMenor = 0;
        int totalTrabajadores = 0;
        System.out.println("Introduce los salarios de los trabajadores. Introduce 0 para terminar.");
        do {
            salario = sc.nextDouble();
            if (salario > 0) {
                totalTrabajadores++;
                if (salario >= 1000 && salario <= 1750) {
                    contadorSalarioEnRango++;
                } else if (salario < 1000) {
                    contadorSalarioMenor++;
                }
            }
        } while (salario != 0);
        double porcentajeSalarioMenor = ((double) contadorSalarioMenor / totalTrabajadores) * 100;
        System.out.println("Número de trabajadores que ganan entre 1000 y 1750 €: " + contadorSalarioEnRango);
        System.out.println("Porcentaje de trabajadores que ganan menos de 1000 €: " + porcentajeSalarioMenor + "%");
    }
}