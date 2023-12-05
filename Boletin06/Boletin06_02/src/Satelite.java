public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciatierra;
    public Satelite() {
        meridiano=paralelo=distanciatierra=0;
    }
    public Satelite(double m, double p, double dt) {
        meridiano=m;
        paralelo=p;
        distanciatierra=dt;
    }
    public void verPosicion() {
        System.out.println("El saletite se encuentra: "+ paralelo+" meridiano: "+meridiano+ " a una distancia de la tierra: "+ distanciatierra);
    }
}
