public class Main {
    public static void main(String[] args) {
        Libro objLi = new Libro();
        objLi.titulolibro("El camino de los reyes");
        objLi.autorlibro("Brandon Sanderson");
        objLi.añolibro(2010);
        objLi.numpaginas((short)1200);
        objLi.mostrarcaraclibro();
        String inflibro=objLi.mostrarcaraclibro();
        System.out.println("Datos del libro: "+inflibro);
        Libro objLib = new Libro("La casa vieja","Hopper",2008,(short)5,4);
        objLib.mostrarcaraclibro();
        String inflibro2=objLi.mostrarcaraclibro();
        System.out.println("Datos del segundo libro: "+inflibro2);
    }
}