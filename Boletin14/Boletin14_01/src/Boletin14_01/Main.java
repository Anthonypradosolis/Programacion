package Boletin14_01;
import com.anthony.partes.*;
public class Main {
    public static void main(String[] args) {
        Teclado obj1 = new Teclado("Razer");
        Monitor obj2 = new Monitor(14);
        Procesador obj3 = new Procesador(16);
        Ordenador objo = new Ordenador(obj2,obj1,obj3,1000);
        System.out.println(objo);
    }
}