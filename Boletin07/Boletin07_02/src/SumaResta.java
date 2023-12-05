public class SumaResta {
    private short resul;
    public void RestaSuma(short num1, short num2) {
        if(num1>=num2)
            resul =(short) (num1 - num2);
        System.out.println("Resultado resta: "+resul);
        resul =(short) (num1+num2);
        System.out.println("Resultado suma: "+resul);
    }
}
