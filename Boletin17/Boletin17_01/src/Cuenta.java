public class Cuenta {
    private  long numcuenta;
    protected double saldo;
    private Persona cliente;
    public Cuenta() {
    }
    public Cuenta(long numcuenta, Persona cliente) {
        this.numcuenta = numcuenta;
        this.cliente = cliente;
    }
    public long getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(long numcuenta) {
        this.numcuenta = numcuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCiente() {
        return cliente;
    }
    public void setCiente(Persona ciente) {
        this.cliente = ciente;
    }
    public void ingresar(double ingresar){
        ingresar+=saldo;
    }
    public void retirar(double retirar ){
        if (saldo >= retirar) {
            saldo -= retirar;
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }
    public void actualizarSaldo(double saldo){
        this.saldo=saldo;
    }
    @Override
    public String toString() {
        return "Cuenta{" + "numcuenta=" + numcuenta + ", saldo=" + saldo + ", ciente=" + cliente + '}';
    }
}
