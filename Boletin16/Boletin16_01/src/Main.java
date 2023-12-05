public class Main {
    public static void main(String[] args) {
        Libros objl = new Libros(23,"Don Quijote",1987,false);
        objl.toString();
        System.out.println(objl);
        Revista objr = new Revista(23,4,"Las aventuras de Mateo",2020);
        objr.toString();
        System.out.println(objr);
        Biblioteca objb = new Biblioteca(objl,objr);
        objb.toString();
        System.out.println(objb);
    }
}