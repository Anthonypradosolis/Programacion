public class Consumo {
    private double km;
    private double litros;
    private double vMed;
    private double pGas;
    public Consumo(){
    }
    public Consumo(double km, double litros, double vMed, double pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }
    public double getTiempo() {
        return km/vMed;
    }
    public double consumoMedio() {
        return (litros/km)*pGas*100;
    }
    public double consumoEuros() {
        return (litros/km)*pGas*100;
    }
    public void setKm(double km) {
        this.km=km;
    }
    public void setLitros(double litros) {
        this.litros=litros;
    }
    public void setvMed(double vMed) {
        this.vMed=vMed;
    }
    public void setPGas(double pGas) {
    }
    public double pedirDouble(double dato) {
        return dato;
    }
}