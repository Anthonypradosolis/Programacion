public class Consumo {
    // atributos
    private double km;
    private double litros;
    private double vMed;
    private double pGas;
    // constructores
    public  Consumo() {
        this.km=0;
        this.litros=0;
        this.vMed=0;
        this.pGas=0;
    }
    public Consumo(double km, double litros, double vMed, double pGas) {
        this.km=km;
        this.litros=litros;
        this.vMed=vMed;
        this.pGas=pGas;
    }
    // metodos
    public double getTiempo() {
        return km/vMed;
    }
    public double consumoMedio() {
        return (litros/km)*pGas*100;
    }
    public double consumoPrecio() {
        return (litros/km) *pGas*100;
    }
    public void setKms(double km) {
        this.km=km;
    }
    public void setlitros(double litros) {
        this.litros=litros;
    }
    public double getvMed() {
        return vMed;
    }
    public void setvMed(double vMed) {
        this.vMed=vMed;
    }
    public void setpGas(double pGas) {
        this.pGas=pGas;
    }
    public double pedirDouble(double dato) {
        return dato;
    }
}
