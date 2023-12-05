
public class Main {
    public static void main(String[] args) {
        float lado=3, area;
        area=lado*lado;
        // tambien
        area=(float) Math.pow(lado, 2);
        System.out.println("area del cuadrado="+area);
        // sin declarar la variable area

        System.out.println("area2="+ lado*lado);
    }
}
