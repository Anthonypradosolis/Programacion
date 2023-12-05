public class Libros extends Publicacion {
    private boolean prestado=false;
    public Libros() {
    }
    public Libros(int codigo, String titulo, int ano,boolean prestado) {
        super(codigo, titulo, ano);
        this.prestado = prestado;
    }
    public void añopublicacion(){
        super.getAno();
    }
    public void codigo(){
        super.getCodigo();
    }
    public void Noprestado(){
        prestado=true;
    }
    @Override
    public String toString() {
        return super.toString()+ "Libros{" + "prestado=" + prestado + '}';
    }
}