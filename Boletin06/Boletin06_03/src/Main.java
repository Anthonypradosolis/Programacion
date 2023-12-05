public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
            circulo1.calcularArea();
            System.out.println("Area del primer circulo: "+circulo1.calcularArea());
            circulo1.calcularLongitud();
            System.out.println("Longitud del primer circulo: "+circulo1.calcularLongitud());
            Circulo circulo2 = new Circulo(4,3.14);
        circulo2.calcularArea();
            System.out.println("Area del segundo circulo: "+circulo2.calcularArea());
            circulo2.calcularLongitud();
            System.out.println("Longitud del segundo circulo: "+circulo2.calcularLongitud());
    }
}