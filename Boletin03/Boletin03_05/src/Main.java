import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float sueldofijo, sueldobruto, comision, itv, quilometraje, km, dietas,ddpmt, sueldoliquido, IRPF, rss=36 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el sueldo fijo");
        sueldofijo=sc.nextFloat();
        System.out.println("dime la comision del importe total de ventas");
        itv=sc.nextFloat();
        comision=5%itv;
        System.out.println("dime el kilometraje");
        km=sc.nextFloat();
        quilometraje=2*km;
        System.out.println("dime los dias de desplazamiento");
        ddpmt=sc.nextFloat();
        dietas=30*ddpmt;
        IRPF=18%sueldofijo;
        sueldobruto=sueldofijo+comision+quilometraje+dietas;
        sueldoliquido=sueldobruto-IRPF-rss;
        System.out.println("tu sueldo bruto es ="+ sueldobruto+" $");
        System.out.println("tu sueldo liquido es ="+ sueldoliquido+" $");
    }
}