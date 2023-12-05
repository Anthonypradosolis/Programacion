public class Biblioteca {
    private Libros libro;
    private Revista revista;
    public Biblioteca() {
    }
    public Biblioteca(Libros libro, Revista revista) {
        this.libro = libro;
        this.revista = revista;
    }
    public Libros getLibro() {
        return libro;
    }
    public void setLibro(Libros libro) {
        this.libro = libro;
    }
    public Revista getRevista() {
        return revista;
    }
    public void setRevista(Revista revista) {
        this.revista = revista;
    }
    @Override
    public String toString() {
        return "Biblioteca{" + "libro=" + libro + ", revista=" + revista + '}';
    }
}