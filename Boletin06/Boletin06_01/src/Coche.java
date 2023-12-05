public class Coche {
    private int velocidad;
    public Coche() {
        velocidad=0;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public void acelerar(int valor) {
        velocidad +=valor;
    }
    public void frenar(int menos) {
        velocidad -=menos;
    }
}