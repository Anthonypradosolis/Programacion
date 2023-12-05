public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.getVelocidad();
        System.out.println("Velocidad inicial: "+coche1.getVelocidad());
        coche1.acelerar(20);
        System.out.println("Aceleracion: "+coche1.getVelocidad());
        coche1.frenar(4);
        System.out.println("Frenar: "+coche1.getVelocidad());
    }
}