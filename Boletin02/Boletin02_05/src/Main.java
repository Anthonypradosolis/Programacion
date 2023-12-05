import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Consumo objCo= new Consumo();
        objCo.setLitros(50);
        objCo.setPGas(1.75);
        Consumo objCon = new Consumo();
        Scanner sc= new Scanner(System.in);
        System.out.println("escribe los kilometros");
        double km=sc.nextDouble();
        System.out.println("escribe los litros");
        double litros=sc.nextDouble();
        System.out.println("escribe la velocidad media");
        double vMed=sc.nextDouble();
        System.out.println("escribe el precio de la gasolina");
        double pGas=sc.nextDouble();
        objCon.consumoMedio();
    }
}