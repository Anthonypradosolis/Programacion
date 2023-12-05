public class Main {
    public static void main(String[] args) {
        Consumo objCo = new Consumo();
        objCo.setlitros(50);
        objCo.setpGas(1.57);
        Consumo objCon = new Consumo(300,25 ,80 ,1.65);
        double consumoMedio = objCon.consumoMedio();
        objCon.setlitros(35);
        System.out.println("Consumo medio: "+consumoMedio+" litros por 100 km");
        double velocidadMedia = objCon.getvMed();
        System.out.println("Velocidad media: "+velocidadMedia+"km/h");
    }
}