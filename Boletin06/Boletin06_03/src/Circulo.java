public class Circulo {
    private double radio;
    private double PI;
    private double area;
    private double longitud;
    public Circulo() {
        this.radio=6;
        this.PI=3.14;
    }
    public Circulo(double r, double PI) {
        radio = r;
        this.PI = PI;
    }
    public double calcularArea() {
        double radioalcuadrado=Math.pow(radio, 2);
        return area=radioalcuadrado * Math.PI;
    }
    public double calcularLongitud() {
        return longitud = 2*Math.PI*radio;
    }
}