public class ConvertirTemperaturas {
    private static final float LIM=80;
    public float centigradosAFharenheit(float tem) throws TemperaturaErradaExcepcion{
        if(tem<LIM){
            throw new TemperaturaErradaExcepcion("La Temperatura no puede ser < 80ºC");
        }
        return (float)(1.8*tem+32.4);
    }
    public float centigradosAReamur (float tem) throws TemperaturaErradaExcepcion{
        if(tem<LIM){
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser < 80ºC");
        }
        return(float)(0.8*tem);
    }
}
