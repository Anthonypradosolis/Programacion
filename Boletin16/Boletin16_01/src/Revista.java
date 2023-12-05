public class Revista extends Publicacion {
    private float num;
    public Revista() {
    }
    public Revista(float num) {
        this.num = num;
    }
    public Revista(float num, int codigo, String titulo, int ano) {
        super(codigo, titulo, ano);
        this.num = num;
    }
    public void añopublicacion(){
        super.getAno();
    }
    public void codigo(){
        super.getCodigo();
    }
    @Override
    public String toString() {
        return super.toString()+ "Revista{" + "num=" + num + '}';
    }
}