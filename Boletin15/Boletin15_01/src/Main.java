public class Main {
    public static void main(String[] args) {
        Futbolista fut=new Futbolista(10,"Delantero",10,"Liones Andres","Messi Cuccitini",36);

        SeleccionFutbol ent=new Entrenador("TMTEC",246,"Pep","Guardiola",54);
        fut.setEdad(23);
        System.out.println(fut);
        System.out.println(ent);
    }
}