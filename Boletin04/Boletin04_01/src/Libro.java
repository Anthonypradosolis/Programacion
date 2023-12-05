public class Libro {
    private String titulo;
    private String autor;
    private int año;
    private short numpaginas;
    private float valoracion;
    public Libro() {
    }
    public Libro(String ti, String au, int añ, short nump, float val) {
        titulo = ti;
        autor = au;
        año = añ;
        numpaginas = nump;
    }
    public void titulolibro(String ti) {
        titulo = ti;
    }
    public void autorlibro(String au) {
        autor = au;
    }
    public void añolibro(int añ) {
        año = añ;
    }
    public void numpaginas(short nump) {
        numpaginas = nump;
    }
    public String mostrarcaraclibro() {
        return "\ntitulo= " + titulo + " \nautor= " + autor+" \naño= " +año+ " \nnumpaginas= "+ numpaginas;
    }
}
