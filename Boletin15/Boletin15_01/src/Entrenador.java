public class Entrenador extends SeleccionFutbol {
    private String idFederacion;
    public void dirigirPartido(){
    }
    public void dirigirEntrenamento(){
    }
    public Entrenador() {
    }
    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id,nombre,apellidos,edad);
        this.idFederacion = idFederacion;
    }
    public String getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    @Override
    public String toString() {
        return "Entrenador: "+super.toString() + ", idFederacion=" + idFederacion;
    }
}