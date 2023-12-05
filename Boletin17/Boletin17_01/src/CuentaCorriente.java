public class CuentaCorriente extends Cuenta {
    private final double interes=1.5/100;
    public CuentaCorriente() {
    }
    public CuentaCorriente(long numcuenta, Persona cliente) {
        super(numcuenta, cliente);
    }
    public double getInteres() {
        return interes;
    }
    @Override
    public String toString() {
        return super.toString()+ "CuentaCorriente{" + "interes=" + interes + '}';
    }
}