public class SumaProducto {
    public void SumProduc() {
        double suma = 0;
        double producto = 1;
        double i = 10;

        while (i <= 90) {
            suma += i;
            producto *= i;
            i++;
        }
        System.out.println("La suma de los números entre 10 y 90 es: " + suma);
        System.out.println("El producto de los números entre 10 y 90 es: " + producto);
    }
}