public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int anosexperiencia;
    public void darMasaje(){
    }
    public Masajista() {
    }
    public Masajista(String titulacion, int anosexperiencia) {
        this.titulacion = titulacion;
        this.anosexperiencia = anosexperiencia;
    }
    public Masajista(String titulacion, int anosexperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anosexperiencia = anosexperiencia;
    }
    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public int getAnosexperiencia() {
        return anosexperiencia;
    }
    public void setAnosexperiencia(int anosexperiencia) {
        this.anosexperiencia = anosexperiencia;
    }
    @Override
    public String toString() {
        return "Masajista{" + "titulacion=" + titulacion + ", anosexperiencia=" + anosexperiencia + '}';
    }
}