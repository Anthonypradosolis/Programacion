//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Tamaño del array (número de alumnos)
        int numeroAlumnos = 30;
        // Crear el array para almacenar las notas
        int[] notas = new int[numeroAlumnos];
        // Cargar el array con las notas
        cargarNotas(notas, scanner);
        // Visualizar el número de aprobados y suspensos
        visualizarAprobadosSuspensos(notas);
        // Calcular y visualizar la nota media de la clase
        double notaMedia = calcularNotaMedia(notas);
        System.out.println("Nota media de la clase: " + notaMedia);
        // Visualizar la nota más alta
        int notaMaxima = obtenerNotaMaxima(notas);
        System.out.println("Nota más alta: " + notaMaxima);
    }

    /**
     *  Método para cargar el array con las notas
     * @param notas
     * @param scanner
     */
    private static void cargarNotas(int[] notas, Scanner scanner) {
        System.out.println("Introduce las notas de los alumnos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }
    }

    /**
     *  Método para visualizar el número de aprobados y suspensos
     * @param notas
     */
    private static void visualizarAprobadosSuspensos(int[] notas) {
        int aprobados = 0;
        int suspensos = 0;
        for (int nota : notas) {
            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);
    }

    /**
     * Método para calcular la nota media de la clase
     * @param notas
     * @return
     */
    private static double calcularNotaMedia(int[] notas) {
        int total = 0;

        for (int nota : notas) {
            total += nota;
        }
        return (double) total / notas.length;
    }
    /**
     *  Método para obtener la nota más alta
     * @param notas
     * @return
     */
    private static int obtenerNotaMaxima(int[] notas) {
        int maxima = notas[0];
        for (int nota : notas) {
            if (nota > maxima) {
                maxima = nota;
            }
        }
        return maxima;
    }

}