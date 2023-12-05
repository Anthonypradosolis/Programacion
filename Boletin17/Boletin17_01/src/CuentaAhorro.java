public class CuentaAhorro extends Cuenta {
    private double interesvariable;
    private double minsaldo;
    public CuentaAhorro() {
    }
    public CuentaAhorro(long numcuenta, Persona cliente) {
        super(numcuenta, cliente);
    }
    public CuentaAhorro(long numcuenta, Persona cliente,double interesvariable,double minsaldo) {
        super(numcuenta,cliente);
        this.interesvariable=interesvariable;
        this.minsaldo=minsaldo;
    }
    public void ingresar(double ingresar){
        if (ingresar >= minsaldo) {
            saldo += ingresar;
        } else {
            System.out.println("El monto ingresado no puede ser menor que el saldo mínimo requerido.");
        }
    }
    @Override
    public String toString() {
        return super.toString()+ "CuentaAhorro{" + "interesvariable=" + interesvariable + ", minsaldo=" + minsaldo + '}';
    }
}